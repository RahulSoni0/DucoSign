package com.devcommop.joaquin.codeforgood.data.db.db_repsonses

import com.devcommop.joaquin.codeforgood.domain.models.SponsorEntity
import java.lang.Exception

data class SponsorsResponse(
    var list: List<SponsorEntity>? = null,
    var exception: Exception? = null
)
