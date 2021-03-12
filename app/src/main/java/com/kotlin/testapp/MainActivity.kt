package com.kotlin.testapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.motorcyclefactory.MotorcycleFactory
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedFactory
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedType
import com.kotlin.testapp.designpatterns.creational.builder.ToastBuilder
import com.kotlin.testapp.designpatterns.creational.factory.CarFactory
import com.kotlin.testapp.designpatterns.creational.factory.CarType
import com.kotlin.testapp.designpatterns.creational.prototype.EmailSender
import com.kotlin.testapp.designpatterns.creational.singleton.SingleTonTest
import com.kotlin.testapp.designpatterns.structural.adapter.PlayerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnClick.setOnClickListener {
            adapterDesignPatternTest()
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

    private fun abstractFactoryDesignPatternTest() {
        val factory = MotorizedFactory.createFactory<MotorcycleFactory>()
        val motorCycle = factory.create(MotorizedType.SUZUKI)
        motorCycle.turnOn()
        motorCycle.turnOff()
    }

    private fun singletonDesignPatternTest() {
        val instance = SingleTonTest.instance
        println(instance::class.java.name)
    }

    private fun prototypeDesignPatternTest() {
        val sender = EmailSender(
            recipient = "test1@gmail.com",
            subject = "hiring",
            message = "hello dear user")
        sender.send()

        val sender2 = sender.clone()
        sender2.recipient = "test2@gmail.com"
        sender2.send()

        /**
         *  we can use
         *  ***
         *  val sender2 = sender.copy(recipient = "test2@gmail.com")
         *  ***
         *  in kotlin but in java we use that solution
         */
    }

    private fun adapterDesignPatternTest(){
        val playerAdapter = PlayerAdapter()
        playerAdapter.play("hayedeh.mp3")
    }
}