# DriverAccounts 8.9

Android app project for daily driver accounts. The app uses the approved dark navy, blue and green visual direction.

## Project versions
- App version: 8.9 (versionCode 89)
- Gradle: 8.9
- Android Gradle Plugin: 8.7.3
- JDK: 17
- compileSdk / targetSdk: 35
- minSdk: 23

## Build with GitHub Actions
The repository workflow should install Gradle 8.9, run `gradle -p "Driver accounts" assembleDebug`, then upload `Driver accounts/app/build/outputs/apk/debug/app-debug.apk` as an artifact.

## Features
- Uber, Yango and Bolt: Credit, Cash and For Us
- OWN Trip, EV Charging, Car Expenses, Salik Toll and Uzair Collected
- Daily and monthly reports, date history, local record storage
- Daily report sharing through Android's share chooser (choose WhatsApp)

Daily earnings = Uber Credit + Yango Credit + Bolt Credit + all three For Us amounts + OWN Trip. Cash, expenses, tolls, charging and Uzair Collected are displayed separately.

Records are stored on the phone. Back up records before uninstalling the app or clearing app data.
