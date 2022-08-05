package com.devcommop.joaquin.codeforgood.domain

import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getStudents(classId: String)
}