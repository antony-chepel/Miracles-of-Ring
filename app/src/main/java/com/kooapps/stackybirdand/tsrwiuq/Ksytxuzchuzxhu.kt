package com.kooapps.stackybirdand.tsrwiuq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kooapps.stackybirdand.databinding.ActivityKsytxuzchuzxhuBinding

class Ksytxuzchuzxhu : AppCompatActivity() {
    private lateinit var kiuuashud : ActivityKsytxuzchuzxhuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kiuuashud = ActivityKsytxuzchuzxhuBinding.inflate(layoutInflater)
        setContentView(kiuuashud.root)
        kiuuashud.fodko.setOnClickListener {
            startActivity(Intent(this,Iywyiqisda::class.java))
        }

        kiuuashud.splxzlp.setOnClickListener {
            finishAffinity()
        }
    }
}