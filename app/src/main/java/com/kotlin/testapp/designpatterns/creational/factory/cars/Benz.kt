package com.kotlin.testapp.designpatterns.creational.factory.cars

import com.kotlin.testapp.designpatterns.creational.factory.Car

class Benz() : Car {
    override fun move() {
        println("move with speed 310km")
    }

    override fun drift() {
        println("drift very good")
    }

    override fun brake() {
        println("brake very good")
    }
}