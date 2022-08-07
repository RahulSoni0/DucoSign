package com.devcommop.joaquin.codeforgood.data.repository

import com.devcommop.joaquin.codeforgood.domain.models.StudentEntity
import com.devcommop.joaquin.codeforgood.domain.repository.Repository
import com.devcommop.joaquin.codeforgood.domain.util.StudentOrder
import kotlinx.coroutines.flow.Flow

class RepositoryImpl : Repository {

    override fun getStudents(studentOrder: StudentOrder): Flow<List<StudentEntity>> {
        TODO("Not yet implemented")
    }
}