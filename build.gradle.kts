plugins {
    kotlin("jvm") version "2.0.10"
}

group = "br.com"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.2")
    implementation("com.google.code.gson:gson:2.8.8")

}

tasks.test {
    useJUnitPlatform()
}