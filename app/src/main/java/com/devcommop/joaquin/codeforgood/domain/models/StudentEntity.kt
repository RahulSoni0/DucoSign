package com.devcommop.joaquin.codeforgood.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StudentEntity(

    @PrimaryKey val id: Long? = null,
    var name: String = "some error occurred",
    var classid: Long = -1,
    var rank: Long = -1,
    var city: String = "undefined",
    var subjects: List<String> = emptyList(),
    var dateofjoin: Long = 0,
    var attendance: List<String> = emptyList(),//keep this as list of strings which we'll parse later through helper class
    var complaints: List<String> = emptyList()

)
