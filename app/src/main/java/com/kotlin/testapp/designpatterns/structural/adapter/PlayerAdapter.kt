package com.kotlin.testapp.designpatterns.structural.adapter

import com.kotlin.testapp.designpatterns.structural.adapter.player.MusicPlayer
import com.kotlin.testapp.designpatterns.structural.adapter.player.VideoPlayer

class PlayerAdapter() : Player {

    override fun play(fileName: String) {
        val player by lazy {
            if (fileName.contains(".mp4", true)) {
                VideoPlayer()
            } else
                MusicPlayer()
        }
        player.playMedia(fileName)
    }

}