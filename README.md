# Expo Android Rescue (SDK 52 / RN 0.76)

A reference repo showing how to fix **Expo SDK 52 Android builds** without ejecting.  
These scripts dynamically inject missing Kotlin files and patch Gradle during **EAS remote builds**, restoring compatibility with **React Native 0.76**.

---

## Why This Exists

- Expo SDK 52 stopped generating critical Kotlin files:
  - `MainApplication.kt`
  - `MainActivity.kt`
  - `ReactNativeHostWrapper.kt`
  - `PackageList.kt`
  - `ApplicationLifecycleDispatcher.kt`
- React Native 0.76 still expects them to exist.
- Without them → **100+ failed builds**, Gradle crashes, unresolved references.
- Ejecting was **not an option**.

This repo shows the working approach: **inject Kotlin stubs + patch Gradle on the fly.**

---

## How To Use

1. **Copy scripts into your project**
   - Place `scripts/eas-build-post-install.js` under `scripts/`
   - Place `plugins/withInjectHostWrapper.js` under `plugins/`

2. **Add postinstall hook to your package.json**
   ```json
   {
     "scripts": {
       "postinstall": "node ./scripts/eas-build-post-install.js"
     }
   }
