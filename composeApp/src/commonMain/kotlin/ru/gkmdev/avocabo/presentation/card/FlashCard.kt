package ru.gkmdev.avocabo.presentation.card

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Composable
fun FlashCard(
    frontText: String,
    backText: String,
    modifier: Modifier = Modifier
) {
    val rotation = remember { Animatable(0f) }
    val scope = rememberCoroutineScope()
    val density = LocalDensity.current.density

    val isFront = rotation.value < 90f
    val displayText = if (isFront) frontText else backText
    val animatedRotation = rotation.value
    val textScaleX = if (isFront) 1f else -1f // зеркалим текст при повороте

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxWidth(0.85f)
            .fillMaxHeight(0.75f)
            .graphicsLayer {
                rotationY = animatedRotation
                cameraDistance = 8 * density
            }
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFFE5F3D7))
            .clickable {
                scope.launch {
                    val target = if (rotation.value < 90f) 180f else 0f
                    rotation.animateTo(
                        target,
                        animationSpec = tween(durationMillis = 400, easing = FastOutSlowInEasing)
                    )
                }
            }
    ) {
        Text(
            text = displayText,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.graphicsLayer {
                scaleX = textScaleX
            }
        )
    }
}