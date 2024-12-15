plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.beta.myapplication1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.beta.myapplication1"
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

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    // ML Kit text Recognition
    implementation("com.google.mlkit:text-recognition:16.0.0-beta6")

    // CameraX Core & modules
    implementation ("androidx.camera:camera-core:1.2.0-beta01")
    implementation ("androidx.camera:camera-camera2:1.2.0-beta01")
    implementation ("androidx.camera:camera-lifecycle:1.2.0-beta01")
    implementation ("androidx.camera:camera-view:1.3.0-alpha02")
    implementation ("androidx.camera:camera-extensions:1.2.0-beta01")
    implementation ("androidx.camera:camera-video:1.2.0-beta01")
    implementation ("androidx.camera:camera-video-camera-pipe:1.2.0-beta01")
    implementation ("androidx.camera:camera-camera2-pipe:1.2.0-beta01")
    implementation ("androidx.camera:camera-extensions:1.2.0-beta01")
    implementation ("androidx.camera:camera-lifecycle-extensions:1.2.0-beta01")
    implementation ("androidx.camera:camera-view-extensions:1.2.0-beta01")
    implementation ("androidx.camera:camera-core:1.2.0-beta01")

    // RecyclerView
    implementation ("androidx.recyclerview:recyclerview:1.3.1")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}