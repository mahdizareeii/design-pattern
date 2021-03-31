package com.kotlin.testapp.designpatterns.structural.decorator

import com.kotlin.testapp.designpatterns.structural.decorator.human.Creature

class HumanDecoratorKotlinSolution(val human: Creature) : Creature by human {

    override fun run() {
        human.run()
        limitForRun()
    }

    private fun limitForRun() {
        println("until 45 KM speed")
    }

}