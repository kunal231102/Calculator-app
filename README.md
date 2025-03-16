# Calculator App

## Overview
This is a simple **Calculator App** built using **Android Studio** with **Java** and XML. It supports basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Features
- Simple and user-friendly UI
- Supports **Addition (+), Subtraction (-), Multiplication (*), and Division (/)**
- Clear button to reset calculations
- Rounded buttons for a modern design

## Technologies Used
- **Language**: Java
- **IDE**: Android Studio
- **UI**: XML with GridLayout

## Installation
1. **Clone the repository**
   ```sh
   git clone https://github.com/your-repo/calculator-app.git
   ```
2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open an existing project"
   - Choose the cloned folder
3. **Run the app**
   - Connect an Android device or use an emulator
   - Click "Run" (Shift + F10)

## Building the APK
1. **Generate Debug APK**
   - `Build` > `Build Bundle(s)/APK(s)` > `Build APK(s)`
   - Find the APK in `app/build/outputs/apk/debug/`

2. **Generate Signed APK (For Sharing)**
   - `Build` > `Generate Signed Bundle / APK`
   - Follow the signing process and select `release`
   - The APK will be in `app/build/outputs/apk/release/`

## Troubleshooting
- If you encounter `compileSdkVersion` errors, update `compileSdkVersion` in `build.gradle (Module: app)` to **35**.
- Ensure **Gradle syncs** successfully before running the project.

## Future Improvements
- Add **percentage (%)** and **decimal point support**
- Implement **Dark Mode**
- Improve UI with animations

## Contact
For questions or feedback, contact kbag791@gmail.com.

