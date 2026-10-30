# Experiment 11 – Implement Google Maps in Android Studio

📌 **Description**
This experiment is developed using Android Studio as part of the Mobile Application Development Lab. It demonstrates the integration of the Google Maps SDK into an Android application. 

The application utilizes a `SupportMapFragment` to display an interactive map. It handles runtime permissions for location and internet access, features custom map markers, animates the camera to specific geographical coordinates, and uses interactive UI overlays to display tapped coordinates.

This experiment provides practical experience with third-party SDK integration, API Key management in the Android Manifest, and location-based services.

👨‍💻 **Author**
*   **Name:** Debayan Saha
*   **Subject:** Mobile Application Development Lab
*   **USN:** 25MCAR0129

🚀 **Features**
*   Integrates Google Maps SDK for Android.
*   Displays a full-screen interactive map using `SupportMapFragment`.
*   Implements `OnMapReadyCallback` for map initialization.
*   Animates camera movement to predefined and dynamic coordinates.
*   Adds custom markers on the map upon user interaction.
*   Displays tapped coordinates in a modern CardView overlay.
*   Secures Google Maps API Key via `AndroidManifest.xml` metadata.

🛠️ **Technologies Used**
*   Android Studio
*   Kotlin
*   Google Maps SDK (Play Services)
*   XML Layouts (CoordinatorLayout, CardView, FloatingActionButton)
*   Gradle

📂 **Project Structure**
```text
exp11/
├── app/
│   ├── build.gradle.kts (Contains Google Maps dependencies)
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml (Contains API Key metadata & Permissions)
│           ├── java/
│           │   └── com.example.myapplication/
│           │       └── MainActivity.kt (Implements OnMapReadyCallback)
│           └── res/
│               ├── layout/
│               │   └── activity_main.xml (MapFragment & Overlay UI)
│               ├── mipmap/
│               ├── values/
│               │   ├── colors.xml
│               │   ├── strings.xml
│               │   └── themes.xml
│               └── xml/
│                   ├── backup_rules.xml
│                   └── data_extraction_rules.xml
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
```

📸 **Output**


https://github.com/user-attachments/assets/bfee6581-0581-4f2d-8477-0c5afd05e563

