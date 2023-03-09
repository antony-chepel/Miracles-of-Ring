package com.kooapps.stackybirdand.asaw

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

@Keep
data class Fdpsllpxlpclpz(
    @SerializedName("mir_rc_gbct")
    val njcivjcokodk: String,
    @SerializedName("mir_rc_vgudis")
    val dpelpw: String,
    @SerializedName("mir_rc_afcx")
    val spsosokdokijxcjizjci: String,
)
class Rwpqllpspd(private val cxvijjix: Twpqlplplpspl) {
    suspend fun fplrlpe() = cxvijjix.vockookb()
}


class Fwpqlplpskod(private val pspakodkos: Uwiookqko) {
    suspend fun coxkvko() = pspakodkos.cgxcudh()
}
@Keep
data class Yopwowkksdko(
    @SerializedName("countryCode")
    val xkckzxi: String,
)

interface Twpqlplplpspl {
    @GET("mir_rc.json")
    suspend fun vockookb(): Response<Fdpsllpxlpclpz>
}

interface Uwiookqko {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun cgxcudh(): Response<Yopwowkksdko>
}










