plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize") // Plugin Parcelize
}

android {
    namespace = "id.ac.polbeng.muhammadyusri.sqlliteexample"
    compileSdk = 35

    defaultConfig {
        applicationId = "id.ac.polbeng.muhammadyusri.sqlliteexample"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0") // Versi terbaru
    implementation("androidx.appcompat:appcompat:1.7.0") // Versi terbaru
    implementation("com.google.android.material:material:1.9.0") // Versi terbaru
    implementation("androidx.constraintlayout:constraintlayout:2.2.0") // Versi terbaru

    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.2.0-alpha01")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
