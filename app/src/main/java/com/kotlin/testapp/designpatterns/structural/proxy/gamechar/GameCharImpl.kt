package com.kotlin.testapp.designpatterns.structural.proxy.gamechar

class GameCharImpl : GameChar {

    init {
        initConfiguration()
    }

    override fun runCharacter() {
        println("running...")
    }

    private fun initConfiguration() {
        println("init heavy configuration")
    }
}