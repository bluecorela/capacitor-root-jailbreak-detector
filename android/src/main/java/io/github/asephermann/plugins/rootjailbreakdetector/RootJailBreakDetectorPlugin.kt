package io.github.asephermann.plugins.rootjailbreakdetector

import android.content.Context
import android.util.Log
import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.CapacitorPlugin
import com.scottyab.rootbeer.RootBeer

@CapacitorPlugin(name = "RootJailBreakDetector")
class RootJailBreakDetectorPlugin : Plugin() {
    private val implementation = RootJailBreakDetector()

    /**
     * Check with rootBeer and with internal checks.
     */
    @PluginMethod
    fun isRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val checkRootBeer: Boolean = rootBeer.isRooted
            val checkInternal: Boolean = implementation.checkIsRooted(activity)
            Log.d(Constants.LOG_TAG, "[checkIsRooted] checkRootBeer: $checkRootBeer")
            Log.d(Constants.LOG_TAG, "[checkIsRooted] checkInternal: $checkInternal")
            val isRooted = checkRootBeer || checkInternal

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("checkIsRooted", error)
            call.reject(error.toString())
        }
    }

    /**
     * Check with rootBeer with BusyBox and with internal checks.
     */
    @PluginMethod
    fun isRootedWithBusyBox(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val checkRootBeer: Boolean = rootBeer.isRootedWithBusyBoxCheck
            val checkInternal: Boolean = implementation.checkIsRooted(activity)
            Log.d(Constants.LOG_TAG, "[checkIsRootedWithBusyBox] checkRootBeer: $checkRootBeer")
            Log.d(Constants.LOG_TAG, "[checkIsRootedWithBusyBox] checkInternal: $checkInternal")
            val isRooted = checkRootBeer || checkInternal

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("checkIsRootedWithBusyBox", error)
            call.reject(error.toString())
        }
    }

    /**
     * Check with rootBeer and with internal checks and with isRunningOnEmulator
     */
    @PluginMethod
    fun isRootedWithEmulator(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val checkRootBeer: Boolean = rootBeer.isRooted
            val checkInternal: Boolean = implementation.checkIsRootedWithEmulator(activity)
            Log.d(Constants.LOG_TAG, "[checkIsRootedWithEmulator] checkRootBeer: $checkRootBeer")
            Log.d(Constants.LOG_TAG, "[checkIsRootedWithEmulator] checkInternal: $checkInternal")
            val isRooted = checkRootBeer || checkInternal

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("checkIsRootedWithEmulator", error)
            call.reject(error.toString())
        }
    }

    /**
     * Check with rootBeer and with internal checks and with isRunningOnEmulator
     */
    @PluginMethod
    fun isRootedWithBusyBoxWithEmulator(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val checkRootBeer: Boolean = rootBeer.isRootedWithBusyBoxCheck
            val checkInternal: Boolean = implementation.checkIsRootedWithEmulator(activity)
            Log.d(Constants.LOG_TAG, "[isRootedWithBusyBoxWithEmulator] checkRootBeer: $checkRootBeer")
            Log.d(Constants.LOG_TAG, "[isRootedWithBusyBoxWithEmulator] checkInternal: $checkInternal")
            val isRooted = checkRootBeer || checkInternal

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("isRootedWithBusyBoxWithEmulator", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isDetectRootManagementAppsRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val isRooted: Boolean = rootBeer.detectRootManagementApps()

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] detectRootManagementApps: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] detectRootManagementApps", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isDetectPotentiallyDangerousAppsRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val isRooted: Boolean = rootBeer.detectPotentiallyDangerousApps()

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] detectPotentiallyDangerousApps: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] detectPotentiallyDangerousApps", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isTestKeysRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val isRooted: Boolean = rootBeer.detectTestKeys()

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] detectTestKeys: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] detectTestKeys", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isCheckForBusyBoxBinaryRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val isRooted: Boolean = rootBeer.checkForBusyBoxBinary()

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkForBusyBoxBinary: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkForBusyBoxBinary", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isCheckForSuBinaryRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val isRooted: Boolean = rootBeer.checkForSuBinary()

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkForSuBinary: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkForSuBinary", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isCheckSuExistsRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val isRooted: Boolean = rootBeer.checkSuExists()

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkSuExists: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkSuExists", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isCheckForRWPathsRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val isRooted: Boolean = rootBeer.checkForRWPaths()

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkForRWPaths: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkForRWPaths", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isCheckForDangerousPropsRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val isRooted: Boolean = rootBeer.checkForDangerousProps()

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkForDangerousProps: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkForDangerousProps", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isCheckForRootNativeRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val isRooted: Boolean = rootBeer.checkForRootNative()

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkForRootNative: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkForRootNative", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isDetectRootCloakingAppsRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val context: Context = activity.applicationContext
            val rootBeer = RootBeer(context)
            val isRooted: Boolean = rootBeer.detectRootCloakingApps()

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] detectRootCloakingApps: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] detectRootCloakingApps", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isSelinuxFlagInEnabled(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = Utils.isSelinuxFlagInEnabled

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] isSelinuxFlagInEnabled: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] isSelinuxFlagInEnabled", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isExistBuildTagsRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("isExistBuildTags", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] isExistBuildTags: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] isExistBuildTags", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun doesSuperuserApkExistRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("doesSuperuserApkExist", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] doesSuperuserApkExist: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] doesSuperuserApkExist", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isExistSUPathRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("isExistSUPath", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] isExistSUPath: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] isExistSUPath", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isCheckDirPermissionsRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("checkDirPermissions", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkDirPermissions: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkDirPermissions", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isCheckExecutingCommandsRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("checkDirPermissions", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkDirPermissions: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkDirPermissions", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isCheckInstalledPackagesRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("checkInstalledPackages", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkInstalledPackages: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkInstalledPackages", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isCheckforOverTheAirCertificatesRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("checkforOverTheAirCertificates", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkforOverTheAirCertificates: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkforOverTheAirCertificates", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isRunningOnEmulatorRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("isRunningOnEmulator", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] isRunningOnEmulator: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] isRunningOnEmulator", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun isRunningOnEmulator(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.isRunningOnEmulator

            Log.e(Constants.LOG_TAG, "isRunningOnEmulator: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("isRunningOnEmulator: ", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun simpleCheckEmulatorRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("simpleCheckEmulator", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] simpleCheckEmulator: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] simpleCheckEmulator", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun simpleCheckSDKBF86Rooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("simpleCheckSDKBF86", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] simpleCheckSDKBF86: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] simpleCheckSDKBF86", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun simpleCheckQRREFPHRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("simpleCheckQRREFPH", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] simpleCheckQRREFPH: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] simpleCheckQRREFPH", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun simpleCheckBuildRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("simpleCheckBuild", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] simpleCheckBuild: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] simpleCheckBuild", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun checkGenymotionRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("checkGenymotion", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkGenymotion: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkGenymotion", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun checkGenericRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("checkGeneric", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkGeneric: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkGeneric", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun checkGoogleSDKRooted(call: PluginCall) {
        val ret = JSObject()
        try {
            val isRooted: Boolean = implementation.whatIsRooted("checkGoogleSDK", activity)

            Log.e(Constants.LOG_TAG, "[WhatIsRooted] checkGoogleSDK: $isRooted");

            ret.put("isRooted", isRooted)
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[WhatIsRooted] checkGoogleSDK", error)
            call.reject(error.toString())
        }
    }

    @PluginMethod
    fun getDeviceInfo(call: PluginCall) {
        val ret: JSObject
        try {
            ret = implementation.getDeviceInfo()

            Log.e(Constants.LOG_TAG, "[Device Info] Result: $ret");
            call.resolve(ret)
        } catch (error: Exception) {
            Utils.getPluginResultError("[Device Info] Error:", error)
            call.reject(error.toString())
        }
    }
}