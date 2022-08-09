package com.devcommop.joaquin.codeforgood.data.db.db_repsonses

import com.devcommop.joaquin.codeforgood.domain.models.StudentEntity
import java.lang.Exception

data class StudentsListResponse(
    var list: List<StudentEntity>? = null,
    var exception: Exception? = null
)