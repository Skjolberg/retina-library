plugins {
    id("java")
    id("maven-publish")
}

group = "${project.property("group")}"
version = "${project.property("version")}"

allprojects {
    plugins.apply("maven-publish")

    publishing {
        publications {
            create<MavenPublication>("maven") {
                groupId = "${project.group}"
                artifactId = project.name
                version = "${project.version}"

                from(components["java"])
            }
        }
    }
}

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly(libs.spigot)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
}

tasks {
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(8))
        }
    }
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

}