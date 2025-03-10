import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import util.BuildConfigConst.JAVA_VERSION
import util.baseConfig
import util.kotlin

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

configure<BaseAppModuleExtension> {
    baseConfig()

    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
}

kotlin {
    jvmToolchain(JAVA_VERSION)
}
