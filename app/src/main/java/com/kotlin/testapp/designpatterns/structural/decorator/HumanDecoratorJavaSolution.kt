package com.kotlin.testapp.designpatterns.structural.decorator

import com.kotlin.testapp.designpatterns.structural.decorator.human.Creature

class HumanDecoratorJavaSolution(val human: Creature) : Creature {

    override fun run() {
        human.run()
        limitForRun()
    }

    override fun jump() {
        human.jump()
    }

    private fun limitForRun() {
        println("until 45 KM speed")
    }

}