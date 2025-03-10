package util

import com.android.build.gradle.BaseExtension

fun BaseExtension.baseConfig() {
    setCompileSdkVersion(BuildConfigConst.COMPILE_SKD)

    defaultConfig {
        minSdk = BuildConfigConst.MIN_SKD
        targetSdk = BuildConfigConst.TARGET_SDK

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = BuildConfigConst.COMPILE_JDK_VERSION
        targetCompatibility = BuildConfigConst.COMPILE_JDK_VERSION
    }
}