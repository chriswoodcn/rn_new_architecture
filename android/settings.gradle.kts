pluginManagement {
    repositories {
        mavenLocal()
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/central")
        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://maven.aliyun.com/repository/google") {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    includeBuild("../node_modules/@react-native/gradle-plugin")
}

//dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//    repositories {
//        mavenLocal()
//        maven("https://maven.aliyun.com/repository/public")
//        maven("https://maven.aliyun.com/repository/central")
//        maven("https://maven.aliyun.com/repository/jcenter")
//        maven("https://maven.aliyun.com/repository/google") {
//            mavenContent {
//                includeGroupAndSubgroups("androidx")
//                includeGroupAndSubgroups("com.android")
//                includeGroupAndSubgroups("com.google")
//            }
//        }
//        maven("https://maven.aliyun.com/repository/gradle-plugin")
//        google()
//        mavenCentral()
//    }
//}

// Configures the React Native Gradle Settings plugin used for autolinking
plugins { id("com.facebook.react.settings") }
extensions.configure<com.facebook.react.ReactSettingsExtension> { autolinkLibrariesFromCommand() }
//val expoPackageJsonPath = ProcessBuilder("node", "--print", "require.resolve('expo/package.json')")
//    .directory(rootDir)
//    .start()
//    .inputStream.bufferedReader()
//    .use { it.readText().trim() }
//println("expoPackageJsonPath $expoPackageJsonPath")
//apply(from = File(expoPackageJsonPath).resolve("../scripts/autolinking.gradle"))
//useExpoModules()

rootProject.name = "MyApplication"
include(":app")
// Configures the React Native Gradle Plugin
includeBuild("../node_modules/@react-native/gradle-plugin")
