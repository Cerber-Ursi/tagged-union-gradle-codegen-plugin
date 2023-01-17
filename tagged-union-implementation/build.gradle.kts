import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("com.gradle.plugin-publish")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    // last version which works with Java 8
    val rosterVersion = "2.22.2.Final"
    implementation(group = "org.jboss.forge.roaster", name = "roaster-api", version = rosterVersion)
    implementation(group = "org.jboss.forge.roaster", name = "roaster-jdt", version = rosterVersion)

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