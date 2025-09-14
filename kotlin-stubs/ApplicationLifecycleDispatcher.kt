package com.projectName

import android.app.Application
import android.content.ComponentCallbacks
import android.content.res.Configuration

object ApplicationLifecycleDispatcher : ComponentCallbacks {
  private var application: Application? = null

  fun onApplicationCreate(app: Application?) {
    if (app == null || this.application != null) return
    this.application = app
    app.registerComponentCallbacks(this)
  }

  override fun onConfigurationChanged(newConfig: Configuration) {}
  override fun onLowMemory() {}
}
