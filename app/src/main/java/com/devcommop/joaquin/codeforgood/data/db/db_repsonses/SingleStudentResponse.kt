package com.devcommop.joaquin.codeforgood.data.db.db_repsonses

import com.devcommop.joaquin.codeforgood.domain.models.StudentEntity

data class SingleStudentResponse(
    var student: StudentEntity? = null,
    var exception: Exception? = null
)
