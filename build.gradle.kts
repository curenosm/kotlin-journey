plugins {
    kotlin("jvm") version "2.0.0"
    application
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("com.curenosm.AppKt")
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.curenosm.AppKt"
    }

    from({
        configurations.runtimeClasspath.get().filter {
            it.name.endsWith("jar")
        }.map {
            zipTree(it)
        }
    })
}