package com.devcommop.joaquin.codeforgood.domain.models

import androidx.room.PrimaryKey

data class ClassEntity(

    @PrimaryKey val id: Long? = null,
    var uid: Long? = null,
    var name: String = "Class Name not found",
    var students: List<String>? = null,
    var mentors: List<String>? = null,
    var budget: Long = 0,
    var images: List<String>? = null

)

class InvalidClassException(message: String): Exception()
