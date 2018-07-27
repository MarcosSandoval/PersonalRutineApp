package com.androidtraining.personalrutineapp.dao

import android.arch.persistence.room.*
import com.androidtraining.personalrutineapp.entity.Gender

@Dao
interface GenderDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRoutine(gender: Gender)

    @Update
    fun updateGender(gender: Gender)

    @Delete
    fun deleteGender(gender: Gender)

    @Query("SELECT * FROM Gender WHERE name == :name")
    fun getGenderByName(name: String): List<Gender>
}