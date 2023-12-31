pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Gradle antiguo:
        // maven { url 'https://jitpack.io' }
        maven (url = "https://jitpack.io")
    }
}

rootProject.name = "SendMessageViewBinding"
include(":app")
 