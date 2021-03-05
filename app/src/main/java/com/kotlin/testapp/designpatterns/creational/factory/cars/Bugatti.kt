package com.kotlin.testapp.designpatterns.creational.factory.cars

import com.kotlin.testapp.designpatterns.creational.factory.Car

class Bugatti(): Car {
    override fun move() {
        println("move with speed 490km")
    }

    override fun drift() {
        println("drift good")
    }

    override fun brake() {
        println("brake very good")
    }
}