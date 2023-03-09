package com.kooapps.stackybirdand.flxzo
import android.webkit.WebSettings
import android.app.Application
import android.webkit.WebView
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject




class Cxozoicds(jdodskkof: Application): ViewModel() {
    val dplwplldsads = jdodskkof.packageManager


    fun gcoxkkoijvijijds(prel: String): Boolean {
        try {
            dplwplldsads.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }


    fun gfodoooxozozxijcijcuhs(ncxooxidi: WebView): WebSettings{
        val fpepwp = ncxooxidi.settings
        fpepwp.allowContentAccess = true
        fpepwp.pluginState = WebSettings.PluginState.ON
        fpepwp.allowContentAccess = true
        fpepwp.displayZoomControls = false
        fpepwp.mediaPlaybackRequiresUserGesture = false
        fpepwp.loadWithOverviewMode = true
        fpepwp.allowFileAccess = true
        fpepwp.cacheMode = WebSettings.LOAD_DEFAULT
        fpepwp.setSupportMultipleWindows(false)
        fpepwp.javaScriptCanOpenWindowsAutomatically = true
        fpepwp.builtInZoomControls = true
        fpepwp.userAgentString = fpepwp.userAgentString.replace("; wv", "")
        fpepwp.allowFileAccess = true
        fpepwp.javaScriptEnabled = true
        fpepwp.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        fpepwp.domStorageEnabled = true
        fpepwp.useWideViewPort = true



        fpepwp.setSupportZoom(true)
        return fpepwp
    }





    fun locxpovkd(wpspa: String) {
        OneSignal.setExternalUserId(
            wpspa,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(hcxokvjidshufhudhug: JSONObject) {
                    try {
                        if (hcxokvjidshufhudhug.has("push") && hcxokvjidshufhudhug.getJSONObject("push").has("success")) {
                            val rpepl = hcxokvjidshufhudhug.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $rpepl"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (hcxokvjidshufhudhug.has("email") && hcxokvjidshufhudhug.getJSONObject("email").has("success")) {
                            val splxlplpzckookv =
                                hcxokvjidshufhudhug.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $splxlplpzckookv"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (hcxokvjidshufhudhug.has("sms") && hcxokvjidshufhudhug.getJSONObject("sms").has("success")) {
                            val sooadladikxicik = hcxokvjidshufhudhug.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $sooadladikxicik"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }






}