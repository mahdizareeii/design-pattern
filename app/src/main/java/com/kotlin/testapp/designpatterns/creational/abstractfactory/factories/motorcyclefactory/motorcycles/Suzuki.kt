package com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.motorcyclefactory.motorcycles

import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedDevice

class Suzuki() : MotorizedDevice {
    override fun turnOn() {
        println("turn on with start")
    }

    override fun turnOff() {
        println("turn off with start")
    }
}