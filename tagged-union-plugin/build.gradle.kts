import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("com.gradle.plugin-publish")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":tagged-union-implementation"))
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test"))
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

gradlePlugin {
    plugins {
        create("taggedUnionGeneratorPlugin") {
            id = "ru.cerbe.tagged-union"
            implementationClass = "ru.cerbe.gradle.TaggedUnionPlugin"
        }
    }
}