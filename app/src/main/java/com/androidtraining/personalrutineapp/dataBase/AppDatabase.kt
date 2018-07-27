package com.androidtraining.personalrutineapp.dataBase

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context
import com.androidtraining.personalrutineapp.converter.DateTypeConverter
import com.androidtraining.personalrutineapp.converter.ListConverter
import com.androidtraining.personalrutineapp.dao.*
import com.androidtraining.personalrutineapp.entity.Exercise
import com.androidtraining.personalrutineapp.entity.Gender
import com.androidtraining.personalrutineapp.entity.Routine
import com.androidtraining.personalrutineapp.entity.Trainee

@Database(entities = [Exercise::class, Gender::class, Routine::class, Trainee::class], version = 1)
@TypeConverters(DateTypeConverter::class, ListConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao
    abstract fun dayRoutineDao(): GenderDao
    abstract fun routineDao(): RoutineDao
    abstract fun traineeDao(): TraineeDao

    companion object {
        var INSTANCE: AppDatabase? = null

        fun getAppDataBase(context: Context): AppDatabase? {
            if (INSTANCE == null){
                synchronized(AppDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "myDB").build()
                }
            }
            return INSTANCE
        }

        fun destroyDataBase(){
            INSTANCE = null
        }
    }
}