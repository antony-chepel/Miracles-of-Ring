package com.kooapps.stackybirdand.flxzo
import android.view.View
import androidx.navigation.fragment.findNavController
import org.koin.android.ext.android.inject
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import android.view.LayoutInflater
import org.koin.core.qualifier.named
import android.view.ViewGroup
import android.content.SharedPreferences
import com.kooapps.stackybirdand.R
import com.kooapps.stackybirdand.asaw.Jowokwows
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.epppqppwppssoxkzkocxokji


class Gfpdocxoisad : Fragment() {
    lateinit var epplw: String
    val uhxcok: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var ioxcivixj: Context
    val spldwlpplsd by activityViewModel<Jowokwows>(named("MainModel"))





    override fun onAttach(context: Context) {
        super.onAttach(context)
        ioxcivixj = context
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val uchvijijxjijidji = uhxcok.getString(epppqppwppssoxkzkocxokji, null)
        val soakkod = uhxcok.getString("appCamp", null)

        if (uchvijijxjijidji=="1" &&soakkod == null) {
            spldwlpplsd.cxviojjixcvijd(ioxcivixj)
            spldwlpplsd.dwlp.observe(viewLifecycleOwner) {
                if (it != null) {
                    epplw = it.toString()
                    uhxcok.edit().putString("appCamp", epplw).apply()
                    findNavController().navigate(R.id.dosiisdxcv)
                }
            }
        } else {
            findNavController().navigate(R.id.dosiisdxcv)
        }
    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dsiijwjisda, container, false)
    }

}