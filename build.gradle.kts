plugins {
    kotlin("js") version "1.3.61"
    id("org.jetbrains.dokka") version "0.10.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
}

kotlin {
    target {
        nodejs()
        browser()
    }
    sourceSets {
        main {
            dependencies {
                implementation(kotlin("stdlib-js"))
                implementation(npm("sockjs-client", "1.1.4"))
            }
        }
    }
}

tasks.dokka {
    configuration {
        platform = "js"
    }
}
