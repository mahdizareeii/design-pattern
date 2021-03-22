package com.kotlin.testapp.designpatterns.structural.bridge.chat

abstract class Chat(
    private val message:String
) {
    fun showMessage() = message
}