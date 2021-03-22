package com.kotlin.testapp.designpatterns.structural.bridge.messanger

import com.kotlin.testapp.designpatterns.structural.bridge.chat.Chat

class Telegram : Messenger {
    override fun sendMessage(chat: Chat) {
        println("${chat.showMessage()} sent in Telegram")
    }

    override fun deleteMessage(chat: Chat) {
        println("${chat.showMessage()} deleted in Telegram")
    }
}