rootProject.name = "retina-library"

enableFeaturePreview("VERSION_CATALOGS")
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            alias("spigot").to("org.spigotmc:spigot-api:1.16.5-R0.1-SNAPSHOT")
            alias("lombok").to("org.projectlombok:lombok:1.18.24")
        }
    }
}

