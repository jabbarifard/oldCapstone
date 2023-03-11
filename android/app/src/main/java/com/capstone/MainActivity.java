//package com.capstone;
//
//import com.facebook.react.ReactActivity;
//import com.facebook.react.ReactActivityDelegate;
//import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
//import com.facebook.react.defaults.DefaultReactActivityDelegate;
//
//public class MainActivity extends ReactActivity {
//
//    /**
//     * Returns the name of the main component registered from JavaScript. This is used to schedule
//     * rendering of the component.
//     */
//    @Override
//    protected String getMainComponentName() {
//        return "capstone";
//    }
//
//    /**
//     * Returns the instance of the {@link ReactActivityDelegate}. Here we use a util class {@link
//     * DefaultReactActivityDelegate} which allows you to easily enable Fabric and Concurrent React
//     * (aka React 18) with two boolean flags.
//     */
//    @Override
//    protected ReactActivityDelegate createReactActivityDelegate() {
//        return new DefaultReactActivityDelegate(
//                this,
//        getMainComponentName(),
//        // If you opted-in for the New Architecture, we enable the Fabric Renderer.
//        DefaultNewArchitectureEntryPoint.getFabricEnabled(), // fabricEnabled
//        // If you opted-in for the New Architecture, we enable Concurrent React (i.e. React 18).
//        DefaultNewArchitectureEntryPoint.getConcurrentReactEnabled() // concurrentRootEnabled
//        );
//    }
//}

//package com.capstone
//
//import com.facebook.react.ReactActivity
//import com.facebook.react.ReactActivityDelegate
//import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.concurrentReactEnabled
//import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.fabricEnabled
//import com.facebook.react.defaults.DefaultReactActivityDelegate
//
//class MainActivity : ReactActivity() {
//    /**
//     * Returns the name of the main component registered from JavaScript. This is used to schedule
//     * rendering of the component.
//     */
//    override fun getMainComponentName(): String? {
//        return "capstone"
//    }
//
//    /**
//     * Returns the instance of the [ReactActivityDelegate]. Here we use a util class [ ] which allows you to easily enable Fabric and Concurrent React
//     * (aka React 18) with two boolean flags.
//     */
//    override fun createReactActivityDelegate(): ReactActivityDelegate {
//        return DefaultReactActivityDelegate(
//            this,
//            mainComponentName!!,  // If you opted-in for the New Architecture, we enable the Fabric Renderer.
//            fabricEnabled,  // fabricEnabled
//            // If you opted-in for the New Architecture, we enable Concurrent React (i.e. React 18).
//            concurrentReactEnabled // concurrentRootEnabled
//        )
//    }
//}
