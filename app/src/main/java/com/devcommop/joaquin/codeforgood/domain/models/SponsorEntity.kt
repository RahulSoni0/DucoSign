package com.devcommop.joaquin.codeforgood.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SponsorEntity(

    @PrimaryKey val id: Long? = null,
    var name: String = "some error occurred",
    var funded: Long = 0,//how much he has contributed till now
    var rank: Long = -1,
    var city: String = "undefined",
    var dateStart: Long = 0,//date since sponsor started his contribution
    var company: String? = "",//which company is sponsor associated with
    var occupation: String? = "",
    var importance: String? = ""//to filter out VIPs, VVIPs, or people like me

)

class InvalidSponsorException(message: String): Exception()
