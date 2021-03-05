package com.kotlin.testapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.testapp.designpatterns.creational.builder.ToastBuilder
import com.kotlin.testapp.designpatterns.creational.factory.CarFactory
import com.kotlin.testapp.designpatterns.creational.factory.CarType
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnClick.setOnClickListener {
            factoryDesignPatternTest()
        }
    }

    private fun builderDesignPatternTest() {
        ToastBuilder.Builder(this)
            .setText("hello world")
            .setDuration(Toast.LENGTH_LONG)
            .build()
    }

    private fun factoryDesignPatternTest() {
        val factory = CarFactory()
        val car = factory.create(CarType.TOYOTA)
        car?.move()
        car?.drift()
        car?.brake()
    }
}