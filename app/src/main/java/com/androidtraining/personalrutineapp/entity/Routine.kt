package com.androidtraining.personalrutineapp.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters
import android.support.annotation.NonNull
import com.androidtraining.personalrutineapp.converter.ListConverter
import java.util.*

@Entity(tableName = "traineeRoutine")
data class Routine(
        @PrimaryKey(autoGenerate = true)
        val Id: Int,
        @ColumnInfo(name = "due_day")
        val dueDay: Date,
        @TypeConverters(ListConverter::class)
        val exercises: List<Exercise>)