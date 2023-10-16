plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.sendmessageviewbinding"
    // Google nos dice que nuestro sdk máximo debe de ser el último que haya
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.sendmessageviewbinding"
        minSdk = 26
        // con targeSdk estamos diciendo que vamos a garantizar que si o si va a funcionar en esa version
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    // Para Android Studio 4.0 hay que poner otra cosa
    viewBinding{
        enable = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    // Descomentar esta línea para generar el javadoc
    //implementation(files("C:\\Users\\jessi\\AppData\\Local\\Android\\Sdk\\platforms\\android-33\\android.jar"))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    // Gradle antiguo:
    // implementation 'com.github.daniel-stoneuk:material-about-library:3.1.2'
    implementation ("com.github.daniel-stoneuk:material-about-library:3.1.2")
}