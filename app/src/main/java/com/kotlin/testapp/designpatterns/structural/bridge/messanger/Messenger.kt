package com.kotlin.testapp.designpatterns.structural.bridge.messanger

import com.kotlin.testapp.designpatterns.structural.bridge.chat.Chat

interface Messenger {
    fun sendMessage(chat: Chat)
    fun deleteMessage(chat: Chat)
}