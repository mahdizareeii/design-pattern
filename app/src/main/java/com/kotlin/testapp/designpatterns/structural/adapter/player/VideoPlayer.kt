package com.kotlin.testapp.designpatterns.structural.adapter.player

class VideoPlayer : MediaPlayer {

    override fun playMedia(fileName: String) {
        println("play $fileName video...")
    }

}