package com.anwesh.uiprojects.linkeddoublelinecircleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.doublelinecircleview.DoubleLineBallView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DoubleLineBallView.create(this)
    }
}
