package com.kooapps.stackybirdand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kooapps.stackybirdand.asaw.Jowokwows
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val ocokokvxko by viewModel<Jowokwows>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ocokokvxko.fokokwokqokokskaoijxcjiz(this)
    }
}