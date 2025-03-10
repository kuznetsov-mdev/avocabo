import gradle.kotlin.dsl.accessors._c4e04f5e4e0e1789f3861ed0ace1a617.java
import gradle.kotlin.dsl.accessors._c4e04f5e4e0e1789f3861ed0ace1a617.kotlin
import util.BuildConfigConst.COMPILE_JDK_VERSION
import util.BuildConfigConst.JAVA_VERSION

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

kotlin {
    jvmToolchain(JAVA_VERSION)
}

java {
    sourceCompatibility = COMPILE_JDK_VERSION
    targetCompatibility = COMPILE_JDK_VERSION
}