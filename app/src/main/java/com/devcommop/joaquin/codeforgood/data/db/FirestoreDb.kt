package com.devcommop.joaquin.codeforgood.data.db

import com.devcommop.joaquin.codeforgood.common.Constants
import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.ClassesListResponse
import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.SingleClassResponse
import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.SponsorsResponse
import com.devcommop.joaquin.codeforgood.data.db.db_repsonses.StudentsResponse
import com.devcommop.joaquin.codeforgood.domain.db.OnlineDatabase
import com.devcommop.joaquin.codeforgood.domain.models.ClassEntity
import com.devcommop.joaquin.codeforgood.domain.models.SponsorEntity
import com.devcommop.joaquin.codeforgood.domain.models.StudentEntity
import com.devcommop.joaquin.codeforgood.domain.util.SponsorOrder
import com.devcommop.joaquin.codeforgood.domain.util.StudentOrder
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.toObject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await

class FirestoreDb(): OnlineDatabase {

    private val firestore: FirebaseFirestore by lazy {
        FirebaseFirestore.getInstance()
    }

    override fun getStudentsList(studentOrder: StudentOrder) = flow {
        val response = StudentsResponse()
        try{
            val list = mutableListOf<StudentEntity>()
            firestore.collection(Constants.STUDENTS_COLLECTION).get().await().forEach { snapshot ->
                list.add(snapshot.toObject(StudentEntity::class.java))
            }
            response.list = list
        } catch (exception: Exception) {
            response.exception = exception
        }
        emit(response)
    }

    override fun getSponsorsList(sponsorOrder: SponsorOrder)= flow {
        val response = SponsorsResponse()
        try{
            val list = mutableListOf<SponsorEntity>()
            firestore.collection(Constants.SPONSORS_COLLECTION).get().await().forEach { snapshot ->
                list.add(snapshot.toObject(SponsorEntity::class.java))
            }
            response.list = list
        } catch (exception: Exception) {
            response.exception = exception
        }
        emit(response)
    }

    override fun getClasses() = flow {
        val response = ClassesListResponse()
        try{
            val list = mutableListOf<ClassEntity>()
            firestore.collection(Constants.CLASSES_COLLECTION).get().await().forEach { snapshot ->
                list.add(snapshot.toObject(ClassEntity::class.java))
            }
            response.list = list
        } catch (exception: Exception) {
            response.exception = exception
        }
        emit(response)
    }

    override fun getClassById(uid: String) = flow {
        val response = SingleClassResponse()
        try{
            response.entity = firestore.collection(Constants.CLASSES_COLLECTION).whereEqualTo("uid", uid).get().await().map{
                it.toObject(ClassEntity::class.java)
            }[0]//get the first object of the list as the list would contain only one character
        } catch (exception: Exception) {
            response.exception = exception
        }
        emit(response)
    }

}