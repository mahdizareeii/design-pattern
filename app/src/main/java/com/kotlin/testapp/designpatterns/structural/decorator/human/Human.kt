package com.kotlin.testapp.designpatterns.structural.decorator.human

class Human() : Creature {

    override fun run() {
        println("human can run")
    }

    override fun jump() {
        println("human can jump")
    }

}