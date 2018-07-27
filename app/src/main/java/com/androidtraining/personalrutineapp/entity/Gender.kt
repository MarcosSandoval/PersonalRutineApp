package com.androidtraining.personalrutineapp.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import io.reactivex.annotations.NonNull

@Entity
data class Gender(
        @PrimaryKey(autoGenerate = true)
        @NonNull
        val id: Int? = null,
        val name: String)