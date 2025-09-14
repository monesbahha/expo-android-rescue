package com.projectName

import android.app.Activity
import android.os.Bundle
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.ReactRootView

class MainActivityDelegate(
  private val activity: Activity
) : ReactActivityDelegate(activity, null) {

  override fun createRootView(): ReactRootView {
    return ReactRootView(activity)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }
}
