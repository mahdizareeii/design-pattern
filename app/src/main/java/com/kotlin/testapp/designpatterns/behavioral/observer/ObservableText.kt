package com.kotlin.testapp.designpatterns.behavioral.observer

import kotlin.properties.Delegates

class ObservableText(private val observer: TextObserver) {
    var value: String by Delegates.observable(
        onChange = { property, oldValue, newValue ->
            observer.onChanged(newValue)
        },
        initialValue = ""
    )


    //if it was in java language this code was be like this

    /*
    private var value: String = ""

    fun setText(text: String) {
        this.value = text
        observer.onChanged(text)
    }

    fun getText(): String = value
    */
}