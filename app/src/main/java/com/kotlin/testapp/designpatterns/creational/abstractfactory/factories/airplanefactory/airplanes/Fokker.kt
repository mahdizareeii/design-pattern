package com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.airplanefactory.airplanes

import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedDevice

class Fokker() : MotorizedDevice {
    override fun turnOn() {
        println("turn on with start")
    }

    override fun turnOff() {
        println("turn off with start")
    }
}