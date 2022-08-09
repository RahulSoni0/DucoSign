package com.devcommop.joaquin.codeforgood.domain.db

import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.*
import com.devcommop.joaquin.codeforgood.domain.util.SponsorOrder
import com.devcommop.joaquin.codeforgood.domain.util.StudentOrder
import kotlinx.coroutines.flow.Flow

interface OnlineDatabase {

    fun getSponsorsList(sponsorOrder: SponsorOrder): Flow<SponsorsListResponse>

    fun getStudentsList(classId: String, studentOrder: StudentOrder): Flow<StudentsListResponse>

    //fun getMentorsList(mentorOrder: MentorOrder): Flow<List<MentorEntity>>

    fun getClasses(): Flow<ClassesListResponse>

    fun getClassById(classId: String): Flow<SingleClassResponse>

    fun getStudentById(studentId: String): Flow<SingleStudentResponse>

}