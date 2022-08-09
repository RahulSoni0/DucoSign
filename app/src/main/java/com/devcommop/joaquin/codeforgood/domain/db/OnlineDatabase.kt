package com.devcommop.joaquin.codeforgood.domain.db

import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.SponsorsResponse
import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.StudentsResponse
import com.devcommop.joaquin.codeforgood.domain.models.SponsorEntity
import com.devcommop.joaquin.codeforgood.domain.models.StudentEntity
import com.devcommop.joaquin.codeforgood.domain.util.MentorOrder
import com.devcommop.joaquin.codeforgood.domain.util.SponsorOrder
import com.devcommop.joaquin.codeforgood.domain.util.StudentOrder
import kotlinx.coroutines.flow.Flow

interface OnlineDatabase {

    fun getSponsorsList(sponsorOrder: SponsorOrder): Flow<SponsorsResponse>

    fun getStudentsList(studentOrder: StudentOrder): Flow<StudentsResponse>

    //fun getMentorsList(mentorOrder: MentorOrder): Flow<List<MentorEntity>>

}