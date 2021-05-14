package com.kotlin.testapp.designpatterns.behavioral.observer

interface TextObserver {
    fun onChanged(text: String)
}