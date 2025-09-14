package com.projectName

import android.os.Bundle
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.ReactRootView

class ReactActivityDelegateWrapper(
  private val activity: ReactActivity,
  mainComponentName: String?
) : ReactActivityDelegate(activity, mainComponentName) {

  override fun createRootView(): ReactRootView {
    return ReactRootView(activity)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }
}
