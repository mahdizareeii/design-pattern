package com.kotlin.testapp.designpatterns.behavioral.command.electricalsystems

class TV : ElectricalSystem {
    override fun turnOn() {
        println("turn on ${this.javaClass.simpleName}")
    }

    override fun turnOff() {
        println("turn off ${this.javaClass.simpleName}")
    }
}