package com.androidtraining.personalrutineapp.entity

import android.arch.persistence.room.*

@Entity
data class Exercise(
        @PrimaryKey(autoGenerate = true)
        val exerciseId: Int,
        val name: String,
        val repetitions:Int,
        @ColumnInfo(name = "machine_name")
        val machineName: String,
        val liftedWeight: Int)