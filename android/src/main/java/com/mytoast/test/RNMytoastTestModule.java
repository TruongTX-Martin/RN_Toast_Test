
package com.mytoast.test;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.UiThreadUtil;

public class RNMytoastTestModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNMytoastTestModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNMytoastTest";
  }
  @ReactMethod
  public void showToast(final String message) {
    UiThreadUtil.runOnUiThread(new Runnable() {
      @Override
      public void run() {
        Toast.makeText(getCurrentActivity(), message, Toast.LENGTH_LONG);
      }
    });
  }

}