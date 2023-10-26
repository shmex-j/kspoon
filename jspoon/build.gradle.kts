plugins {
    `java-library`
    `maven-publish`
    id("org.jetbrains.kotlin.jvm") version "1.8.10"
}

dependencies {
    api("org.jsoup:jsoup:1.15.3")
    compileOnly("org.jetbrains:annotations:16.0.2")
    testCompileOnly("org.jetbrains:annotations:16.0.2")
    testImplementation("junit:junit:4.13.1")
}

group = project.properties["POM_GROUP"] ?: ""
version = project.properties["POM_VERSION"] ?: ""

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}