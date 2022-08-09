package com.devcommop.joaquin.codeforgood.data.db.db_repsonses

import com.devcommop.joaquin.codeforgood.domain.models.ClassEntity

data class SingleClassResponse(
    var entity: ClassEntity? = null,
    var exception: Exception? = null
)
