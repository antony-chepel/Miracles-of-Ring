package com.kooapps.stackybirdand.asaw
import android.view.LayoutInflater
import android.view.View
import com.kooapps.stackybirdand.R
import com.kooapps.stackybirdand.tsrwiuq.Hiwiwosixjzc.sokdko
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import org.koin.core.qualifier.named
import android.content.Context
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.android.ext.android.inject
import android.content.SharedPreferences
import androidx.navigation.fragment.findNavController
import android.os.Bundle




class Sqppsoxzc : Fragment() {
    val tokkokod: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var osokalolxozockijcjv: String
    private lateinit var dpllpx: Context
    val bplpvc by activityViewModel<Jowokwows>(named("MainModel"))

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bplpvc.fpellplpw.observe(viewLifecycleOwner) {
            if (it!=null) {
                osokalolxozockijcjv = it.xkckzxi
                tokkokod.edit().putString(sokdko, osokalolxozockijcjv).apply()
                findNavController().navigate(R.id.cspwpwq)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        dpllpx = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fodkskzxc, container, false)
    }








}