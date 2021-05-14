package com.kotlin.testapp.designpatterns.structural.proxy

import com.kotlin.testapp.designpatterns.structural.proxy.gamechar.GameChar
import com.kotlin.testapp.designpatterns.structural.proxy.gamechar.GameCharImpl

class GameCharProxy : GameChar {

    private var gameChar: GameChar? = null

    override fun runCharacter() {
        if (gameChar == null) {
            gameChar = GameCharImpl()
        }
        gameChar?.runCharacter()
    }

}