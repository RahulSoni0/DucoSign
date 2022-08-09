package com.devcommop.joaquin.codeforgood.data.repository

import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.ClassesListResponse
import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.SingleStudentResponse
import com.devcommop.joaquin.codeforgood.domain.db.OnlineDatabase
import com.devcommop.joaquin.codeforgood.domain.models.SponsorEntity
import com.devcommop.joaquin.codeforgood.domain.models.StudentEntity
import com.devcommop.joaquin.codeforgood.domain.repository.Repository
import com.devcommop.joaquin.codeforgood.domain.util.SponsorOrder
import com.devcommop.joaquin.codeforgood.domain.util.StudentOrder
import kotlinx.coroutines.flow.Flow

/**
 * Always remember: Repo never takes DataSrc parameter. Only RepoImpl will take DataSrc in parameter and that too through abstraction with all respects to Clean Architecture principles
 */
class RepositoryImpl(
    private val firestore: OnlineDatabase
) : Repository {

    override fun getStudentsList(classId: String, studentOrder: StudentOrder)= firestore.getStudentsList(classId, studentOrder)

    override fun getSponsorsList(sponsorOrder: SponsorOrder) = firestore.getSponsorsList(sponsorOrder)

    override fun getClasses()= firestore.getClasses()

    override fun getClassById(uid: String)= firestore.getClassById(uid)

    override fun getStudentById(studentId: String)= firestore.getStudentById(studentId)
}