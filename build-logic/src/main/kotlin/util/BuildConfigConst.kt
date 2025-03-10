package util

import org.gradle.api.JavaVersion

object BuildConfigConst {
    const val COMPILE_SKD = 35
    const val MIN_SKD = 29
    const val TARGET_SDK = 35
    val COMPILE_JDK_VERSION = JavaVersion.VERSION_17
    const val JAVA_VERSION = 17
    const val JVM_TARGET = "17"
}