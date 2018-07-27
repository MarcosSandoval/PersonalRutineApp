package com.androidtraining.personalrutineapp.dao

import android.arch.persistence.room.*
import com.androidtraining.personalrutineapp.entity.Trainee

@Dao
interface TraineeDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTrainee(trainee: Trainee)

    @Update
    fun updateTrainee(trainee: Trainee)

    @Delete
    fun deleteTrainee(trainee: Trainee)

    @Query("SELECT * FROM Trainee WHERE name = :nameToFind")
    fun getUserByName(nameToFind: String): List<Trainee>
}