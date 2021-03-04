package com.kotlin.testapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.testapp.designpatterns.creational.builder.ToastBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnClick.setOnClickListener {
            builderDesignPatternTest()
        }
    }

    private fun builderDesignPatternTest() {
        ToastBuilder.Builder(this)
            .setText("hello world")
            .setDuration(Toast.LENGTH_LONG)
            .build()
    }
}