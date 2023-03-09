package com.kooapps.stackybirdand.asaw
import android.app.Application
import org.koin.android.ext.koin.androidContext
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*
import android.content.Context
import com.kooapps.stackybirdand.flxzo.dpxpzoxzkckos
import com.kooapps.stackybirdand.flxzo.uxizoks
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.apalslpaslpplxkozcok
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.uxhchuzijjjisjijidfji
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.spwllps
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.ggtvc


class Yeooiiduhcx: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(uxhchuzijjjisjijidfji)

        val oxokkocijuhvhu = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val dpel = getSharedPreferences("PREFS_NAME", 0)

        val pslpaplpxkoczko = MyTracker.getTrackerParams()
        val uhcxhuv = MyTracker.getTrackerConfig()
        val swpl = MyTracker.getInstanceId(this)
        uhcxhuv.isTrackingLaunchEnabled = true
        val pwplwplwplsp = UUID.randomUUID().toString()

        if (dpel.getBoolean("my_first_time", true)) {
            pslpaplpxkoczko.setCustomUserId(pwplwplwplsp)
            oxokkocijuhvhu.edit().putString(spwllps, pwplwplwplsp).apply()
            oxokkocijuhvhu.edit().putString(apalslpaslpplxkozcok, swpl).apply()
            dpel.edit().putBoolean("my_first_time", false).apply()
        } else {
            val fdplfdp = oxokkocijuhvhu.getString(spwllps, pwplwplwplsp)
            pslpaplpxkoczko.setCustomUserId(fdplfdp)
        }
        MyTracker.initTracker(ggtvc, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Yeooiiduhcx)
            modules(
                listOf(
                    dpxpzoxzkckos, uxizoks
                )
            )
        }
    }
}