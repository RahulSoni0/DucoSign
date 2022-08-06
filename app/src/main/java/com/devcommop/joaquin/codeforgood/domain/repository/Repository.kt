package com.devcommop.joaquin.codeforgood.domain.repository

import com.devcommop.joaquin.codeforgood.domain.models.StudentEntity
import com.devcommop.joaquin.codeforgood.domain.util.OrderType
import com.devcommop.joaquin.codeforgood.domain.util.StudentOrder
import kotlinx.coroutines.flow.Flow

interface Repository {

    fun getStudents(studentOrder: StudentOrder = StudentOrder.Ranking(orderType = OrderType.Ascending)): Flow<List<StudentEntity>>

}