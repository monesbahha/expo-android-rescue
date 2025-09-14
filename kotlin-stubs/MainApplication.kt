package com.projectName

import android.app.Application
import android.content.Context
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.soloader.SoLoader
import com.projectName.ApplicationLifecycleDispatcher
import com.projectName.PackageList

class MainApplication : Application(), ReactApplication {

  override val reactNativeHost: ReactNativeHost = object : ReactNativeHost(this) {
    override fun getUseDeveloperSupport(): Boolean = BuildConfig.DEBUG

    override fun getPackages(): List<ReactPackage> {
      return PackageList(this@MainApplication).packages
    }

    override fun getJSMainModuleName(): String = "index"
  }

  override fun onCreate() {
    super.onCreate()
    SoLoader.init(this, false)
    ApplicationLifecycleDispatcher.onApplicationCreate(this)
  }

  override fun attachBaseContext(base: Context) {
    super.attachBaseContext(base)
    ApplicationLifecycleDispatcher.onApplicationCreate(this)
  }
}
