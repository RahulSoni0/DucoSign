package com.devcommop.joaquin.codeforgood.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.devcommop.joaquin.codeforgood.domain.db.CachingDatabase
import com.devcommop.joaquin.codeforgood.domain.models.StudentEntity

@Database(
    entities =[StudentEntity::class],
    version = 1
)
abstract class RoomDb: RoomDatabase(), CachingDatabase {

    abstract val studentDao: StudentDao//RoomDB will take care of rest

    companion object{
        const val DATABASE_NAME = "students_db"
    }

}