package com.androidtraining.personalrutineapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.androidtraining.personalrutineapp.dataBase.AppDatabase
import com.androidtraining.personalrutineapp.entity.Gender

class MainActivity : AppCompatActivity() {

    var db: AppDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = AppDatabase.getAppDataBase(context = this)
        var gender1 = Gender(name = "Test")
    }
}
