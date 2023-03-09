package com.kooapps.stackybirdand.tsrwiuq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kooapps.stackybirdand.databinding.ActivityOuwygsydxzcBinding
import kotlin.random.Random

class Ouwygsydxzc : AppCompatActivity() {
    private lateinit var zxoijiasjid : ActivityOuwygsydxzcBinding
    val scxysag = listOf(
        2,
        5,
        10
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        zxoijiasjid = ActivityOuwygsydxzcBinding.inflate(layoutInflater)
        setContentView(zxoijiasjid.root)
        val iasdas = intent.getIntExtra("mir_scrs",100)
        val jsady = scxysag[Random.nextInt(3)]
        val kcixhu =  iasdas * jsady
        zxoijiasjid.sdoskao.text = "You won $kcixhu treasure scores"
        zxoijiasjid.jnvcyyc.setOnClickListener {
            startActivity(Intent(this,Ksytxuzchuzxhu::class.java))

        }

        zxoijiasjid.saokdasjiwidwhuwdhuas.setOnClickListener {
            finishAffinity()
        }

    }
}