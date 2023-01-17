import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20" apply false
    id("com.gradle.plugin-publish") version "1.0.0" apply false
}

subprojects {
    group = "ru.cerbe.gradle"
    version = "1.0-SNAPSHOT"
}