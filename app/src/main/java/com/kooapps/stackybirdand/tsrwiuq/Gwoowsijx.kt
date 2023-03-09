package com.kooapps.stackybirdand.flxzo

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.kooapps.stackybirdand.asaw.*
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val uxizoks = module {

    single  <Twpqlplplpspl> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Twpqlplplpspl::class.java)
    }

    single <Uwiookqko> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Uwiookqko::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://miraclesofring.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Fwpqlplpskod(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Rwpqllpspd(get(named("HostInter")))
    }
    single{
        gobktdtsysdhuds()
    }
    single (named("SharedPreferences")) {
        gokfkckokoxkvcjiijsdhuhuf(androidApplication())
    }
}

fun gokfkckokoxkvcjiijsdhuhuf(dpel: Application): SharedPreferences {
    return dpel.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun gobktdtsysdhuds(): Gson {
    return GsonBuilder().create()
}

val dpxpzoxzkckos = module {
    viewModel (named("MainModel")){
        Jowokwows((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Cxozoicds(get())
    }
}