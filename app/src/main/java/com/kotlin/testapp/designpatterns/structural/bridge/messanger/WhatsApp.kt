package com.kotlin.testapp.designpatterns.structural.bridge.messanger

import com.kotlin.testapp.designpatterns.structural.bridge.chat.Chat

class WhatsApp : Messenger {
    override fun sendMessage(chat: Chat) {
        println("${chat.showMessage()} sent in WhatsApp")
    }

    override fun deleteMessage(chat: Chat) {
        println("${chat.showMessage()} deleted in WhatsApp")
    }
}