package com.kooapps.stackybirdand.tsrwiuq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import com.google.android.material.snackbar.Snackbar
import com.kooapps.stackybirdand.R
import com.kooapps.stackybirdand.databinding.ActivityIywyiqisdaBinding
import kotlin.random.Random

class Iywyiqisda : AppCompatActivity() {
    private var cxijvxcioxcokxcko = 0

    var sudhw = listOf(
        20,
        30,
        50,
        60,
        80,
        90,
        120,
        150,
        180,
        200,
        250,
        300,
        500
    )
    var attemps = 3
    private var ozxckkozxc = listOf(
        R.drawable.mir_ric_1,
        R.drawable.mir_ric_2,
        R.drawable.mir_ric_3,
        R.drawable.mir_ric_4,
        R.drawable.mir_ric_5,
        R.drawable.mir_ric_6,
        R.drawable.mir_ric_7,
        R.drawable.mir_ric_8,
        R.drawable.mir_ric_9,
        R.drawable.mir_ric_10,
        R.drawable.mir_ric_11,
    )
    private var oaskdkoas : CountDownTimer? = null
    private lateinit var sdosdokkox : ActivityIywyiqisdaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sdosdokkox = ActivityIywyiqisdaBinding.inflate(layoutInflater)
        setContentView(sdosdokkox.root)
        sdosdokkox.xcivjixcvji.setOnClickListener {
            iashdahu()
        }
    }


    private fun iashdahu()  = with(sdosdokkox){
        oaskdkoas?.cancel()
        var saijdas = 0
        oaskdkoas = object  : CountDownTimer(5000,300){
            override fun onTick(p0: Long) {
                xcivjixcvji.alpha = 0.8f
                saijdas++
                xcivjixcvji.isClickable = false
                if(saijdas>10) saijdas = 0
                asdjiw.setImageResource(ozxckkozxc[saijdas])
                spdllwlp.setImageResource(ozxckkozxc[saijdas])
                cokvxko.setImageResource(ozxckkozxc[saijdas])
                psadakos.setImageResource(ozxckkozxc[saijdas])
            }

            override fun onFinish() {
                xcivjixcvji.isClickable = true
                attemps -=1
                dpplwlp.text = "Your attemps : $attemps"
                xcivjixcvji.alpha = 1.0f
                val sdiowjiji = ozxckkozxc[Random.nextInt(11)]
                val xcovkkoxcko = ozxckkozxc[Random.nextInt(11)]
                val fprllpe = ozxckkozxc[Random.nextInt(11)]
                asdjiw.setImageResource(sdiowjiji)
                spdllwlp.setImageResource(xcovkkoxcko)
                cokvxko.setImageResource(fprllpe)
                val scrdsd = sudhw[Random.nextInt(13)]
                cxijvxcioxcokxcko += scrdsd
                mvmckiobjiv.text = "Scores : $cxijvxcioxcokxcko"
                if(attemps ==0){
                    Snackbar.make(sdosdokkox.root,"Waiting for calculating additional boost scores...",Snackbar.LENGTH_SHORT).show()
                    Handler().postDelayed({
                        startActivity(Intent(this@Iywyiqisda,Ouwygsydxzc::class.java)
                            .putExtra("mir_scrs",cxijvxcioxcokxcko)
                        )
                    },3000)
                }
            }

        }.start()
    }


    override fun onDestroy() {
        super.onDestroy()
        oaskdkoas?.cancel()
    }
}