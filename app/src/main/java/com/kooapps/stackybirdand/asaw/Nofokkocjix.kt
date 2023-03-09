package com.kooapps.stackybirdand.asaw
import android.net.Uri
import org.koin.core.qualifier.named
import java.io.File
import android.content.Intent
import android.os.Bundle
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.gobiiuhvoko
import android.webkit.*
import android.util.Log
import android.provider.MediaStore
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.spwllps
import android.os.Handler
import java.io.IOException
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.dpllpxzplcpl
import java.util.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import android.os.Looper
import android.os.Environment
import com.kooapps.stackybirdand.flxzo.Cxozoicds
import java.text.SimpleDateFormat

class Nofokkocjix : AppCompatActivity() {
    var jixcjizoks = ""
    private  val cijxivjxcji = 1
    private var eplwpl: String? = null
    private var delplplpwpqloksdkoa: ValueCallback<Array<Uri>>? = null
    private val sokdskokoxkoczko by viewModel<Cxozoicds>(
        named("BeamModel")
    )
    private var sdwji = false
    lateinit var uxchvhuxhuvd: WebView





    fun dwllqpplqpl(cxookdkof: String?) {
        if (!cxookdkof!!.contains("t.me")) {

            if (jixcjizoks == "") {
                jixcjizoks = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    cxookdkof
                ).toString()

                val cxijvijx = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val swioksoadko = cxijvijx.edit()
                swioksoadko.putString("SAVED_URL", cxookdkof)
                swioksoadko.apply()
            }
        }
    }



    override fun onActivityResult(gfokfdko: Int, swpllpalp: Int, xgzgycxz: Intent?) {

        if (gfokfdko != cijxivjxcji || delplplpwpqloksdkoa == null) {
            super.onActivityResult(gfokfdko, swpllpalp, xgzgycxz)
            return
        }
        var pldlpelplpw: Array<Uri>? = null

        if (swpllpalp == RESULT_OK) {
            if (xgzgycxz == null) {
                if (eplwpl != null) {
                    pldlpelplpw = arrayOf(Uri.parse(eplwpl))
                }
            } else {
                val coxkvkokoxjidji = xgzgycxz.dataString
                if (coxkvkokoxjidji != null) {
                    pldlpelplpw = arrayOf(Uri.parse(coxkvkokoxjidji))
                }
            }
        }
        delplplpwpqloksdkoa!!.onReceiveValue(pldlpelplpw)
        delplplpwpqloksdkoa = null
        return
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uxchvhuxhuvd = WebView(this)
        setContentView(uxchvhuxhuvd)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(uxchvhuxhuvd, true)
        sokdskokoxkoczko.gfodoooxozozxijcijcuhs(uxchvhuxhuvd)

        uxchvhuxhuvd.webViewClient = Tooqkkowkokowksdjix()
        uxchvhuxhuvd.webChromeClient = Twqpqppppsad()
        uxchvhuxhuvd.loadUrl(kcixoovijhudhuhusfhu())
    }






    override fun onBackPressed() {

        if (uxchvhuxhuvd.canGoBack()) {
            if (sdwji) {
                uxchvhuxhuvd.stopLoading()
                uxchvhuxhuvd.loadUrl(jixcjizoks)
            }
            this.sdwji = true
            uxchvhuxhuvd.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                sdwji = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    inner class Tooqkkowkokowksdjix: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (sokdskokoxkoczko.gcoxkkoijvijijds(url)) {

                    val xozcijos = Intent(Intent.ACTION_VIEW)
                    xozcijos.data = Uri.parse(url)
                    startActivity(xozcijos)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            dwllqpplqpl(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Nofokkocjix, description, Toast.LENGTH_SHORT).show()
        }
    }

    inner class Twqpqppppsad : WebChromeClient() {

        override fun onShowFileChooser(
            sdij: WebView?,
            okxckoxkoxzjisji: ValueCallback<Array<Uri>>?,
            reokoks: FileChooserParams?
        ): Boolean {
            delplplpwpqloksdkoa?.onReceiveValue(null)
            delplplpwpqloksdkoa = okxckoxkoxzjisji
            var xuzhcjzxjisokkosakocasojidjias: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (xuzhcjzxjisokkosakocasojidjias!!.resolveActivity(packageManager) != null) {
                var dpwlpqpppapsokokzxc: File? = null
                try {
                    dpwlpqpppapsokokzxc = issuwisdko()
                    xuzhcjzxjisokkosakocasojidjias.putExtra("PhotoPath", eplwpl)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (dpwlpqpppapsokokzxc != null) {
                    eplwpl = "file:" + dpwlpqpppapsokokzxc.absolutePath
                    xuzhcjzxjisokkosakocasojidjias.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(dpwlpqpppapsokokzxc)
                    )
                } else {
                    xuzhcjzxjisokkosakocasojidjias = null
                }
            }
            val apfprpdpps = Intent(Intent.ACTION_GET_CONTENT)
            apfprpdpps.addCategory(Intent.CATEGORY_OPENABLE)
            apfprpdpps.type = "image/*"
            val ivjcjibji: Array<Intent?> = xuzhcjzxjisokkosakocasojidjias?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val tokkoekoe = Intent(Intent.ACTION_CHOOSER)
            tokkoekoe.putExtra(Intent.EXTRA_INTENT, apfprpdpps)
            tokkoekoe.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            tokkoekoe.putExtra(Intent.EXTRA_INITIAL_INTENTS, ivjcjibji)
            startActivityForResult(tokkoekoe, cijxivjxcji)
            return true
        }

        fun issuwisdko(): File? {
            val gfkokodgkokcovko = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val dplelpw = "JPEG_" + gfkokodgkokcovko + "_"
            val itrjifhudg = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                dplelpw,
                ".jpg",
                itrjifhudg
            )
        }
    }
    private fun kcixoovijhudhuhusfhu(): String {
        val wppllpslppx = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val hchuvkokkokod = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val rplepllpwlppsld = wppllpslppx.getString(spwllps, null)
        val txuzhhuzxchus = wppllpslppx.getString(dpllpxzplcpl, null)
        val sosdkokosdkokokoxzjicjizxcji = wppllpslppx.getString(gobiiuhvoko, null)
        when (wppllpslppx.getString("WebInt", null)) {
            "campaign" -> {
                sokdskokoxkoczko.locxpovkd(txuzhhuzxchus.toString())
            }
            "deepLink" -> {
                sokdskokoxkoczko.locxpovkd(txuzhhuzxchus.toString())
            }
            "deepLinkNOApps" -> {
                sokdskokoxkoczko.locxpovkd(rplepllpwlppsld.toString())
            }
            "geo" -> {
                sokdskokoxkoczko.locxpovkd(rplepllpwlppsld.toString())
            }
        }
        return hchuvkokkokod.getString("SAVED_URL", sosdkokosdkokokoxzjicjizxcji).toString()
    }








}

