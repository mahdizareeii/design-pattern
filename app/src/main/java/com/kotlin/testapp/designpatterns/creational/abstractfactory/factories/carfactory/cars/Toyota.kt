package com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.carfactory.cars

import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedDevice

class Toyota() : MotorizedDevice {
    override fun turnOn() {
        println("turn on with start")
    }

    override fun turnOff() {
        println("turn off with start")
    }
}