package com.capstone; // replace com.your-app-name with your app’s name
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import android.util.Log

class HelloModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    @ReactMethod
    fun createHello(message: String) {
        Log.d("HelloModule", "Create event called: $message")
    }

    // add to CalendarModule.kt
    override fun getName() = "HelloModule"
}
