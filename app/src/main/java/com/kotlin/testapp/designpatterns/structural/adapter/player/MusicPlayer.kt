package com.kotlin.testapp.designpatterns.structural.adapter.player

class MusicPlayer : MediaPlayer {

    override fun playMedia(fileName: String) {
        println("play $fileName music...")
    }

}