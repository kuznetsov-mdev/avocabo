import gradle.kotlin.dsl.accessors._f2f731efb6df09b1e7770b63a45cad96.androidTestImplementation
import gradle.kotlin.dsl.accessors._f2f731efb6df09b1e7770b63a45cad96.debugImplementation
import gradle.kotlin.dsl.accessors._f2f731efb6df09b1e7770b63a45cad96.implementation
import gradle.kotlin.dsl.accessors._f2f731efb6df09b1e7770b63a45cad96.testImplementation
import util.BuildConfigConst
import util.BuildConfigConst.JAVA_VERSION
import util.android
import util.kotlin
import util.libs

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    compileSdk = BuildConfigConst.COMPILE_SKD
    buildFeatures {
        compose = true
    }
}

kotlin {
    jvmToolchain(JAVA_VERSION)
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    debugImplementation(libs.androidx.compose.ui.tooling)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}