package com.devcommop.joaquin.codeforgood.domain.repository

import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.*
import com.devcommop.joaquin.codeforgood.domain.util.SponsorOrder
import com.devcommop.joaquin.codeforgood.domain.util.TypeOfOrder
import com.devcommop.joaquin.codeforgood.domain.util.StudentOrder
import kotlinx.coroutines.flow.Flow

interface Repository {

    fun getStudentsList(
        classId: String,
        studentOrder: StudentOrder =
            StudentOrder.Ranking(orderType = TypeOfOrder.Ascending)
    ): Flow<StudentsListResponse>

    fun getSponsorsList(sponsorOrder: SponsorOrder): Flow<SponsorsListResponse>

    fun getClasses(): Flow<ClassesListResponse>

    fun getClassById(classId: String): Flow<SingleClassResponse>

    fun getStudentById(studentId: String): Flow<SingleStudentResponse>

}