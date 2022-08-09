package com.devcommop.joaquin.codeforgood.data.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.devcommop.joaquin.codeforgood.AppController
import com.devcommop.joaquin.codeforgood.domain.db.CachingDatabase
import com.devcommop.joaquin.codeforgood.domain.models.StudentEntity

@Database(
    entities =[StudentEntity::class],
    version = 1
)
abstract class RoomDb: RoomDatabase(), CachingDatabase {

    abstract val studentDao: StudentDao//RoomDB will take care of rest

    companion object{
        private var INSTANCE: RoomDb? = null
        const val DATABASE_NAME = "students_db"

        fun getInstance(): RoomDb {
            if(INSTANCE == null){
                synchronized(RoomDb::class.java) {
                    INSTANCE = Room.databaseBuilder(
                        AppController.getInstance().applicationContext,
                        RoomDb::class.java, DATABASE_NAME).allowMainThreadQueries().build()
                }
            }
            return INSTANCE!!
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

}