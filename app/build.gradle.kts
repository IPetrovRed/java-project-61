plugins {
    application
    jacoco
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application { mainClass.set("hexlet.code.App") }

repositories {
    mavenCentral()
}

dependencies {
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
