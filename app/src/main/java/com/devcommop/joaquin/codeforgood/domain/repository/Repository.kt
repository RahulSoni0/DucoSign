package com.devcommop.joaquin.codeforgood.domain.repository

import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.SponsorsResponse
import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.StudentsResponse
import com.devcommop.joaquin.codeforgood.domain.models.SponsorEntity
import com.devcommop.joaquin.codeforgood.domain.models.StudentEntity
import com.devcommop.joaquin.codeforgood.domain.util.SponsorOrder
import com.devcommop.joaquin.codeforgood.domain.util.TypeOfOrder
import com.devcommop.joaquin.codeforgood.domain.util.StudentOrder
import kotlinx.coroutines.flow.Flow

interface Repository {

    fun getStudentsList(
        studentOrder: StudentOrder =
            StudentOrder.Ranking(orderType = TypeOfOrder.Ascending)
    ): Flow<StudentsResponse>

    fun getSponsorsList(sponsorOrder: SponsorOrder): Flow<SponsorsResponse>



}