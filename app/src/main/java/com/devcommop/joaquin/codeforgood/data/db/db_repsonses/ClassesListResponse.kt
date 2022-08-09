package com.devcommop.joaquin.codeforgood.data.db.db_repsonses

import com.devcommop.joaquin.codeforgood.domain.models.ClassEntity

data class ClassesListResponse(

    var list: List<ClassEntity>? = null,
    var exception: Exception?=  null
)
