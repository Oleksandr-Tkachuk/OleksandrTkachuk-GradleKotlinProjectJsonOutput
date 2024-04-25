plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.10.1")
}

tasks.jar {
    archiveFileName.set("myname.jar")
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }
}