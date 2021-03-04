package com.kotlin.testapp.designpatterns.creational.builder

import android.content.Context
import android.widget.Toast

class ToastBuilder private constructor(builder: Builder) : Toast(builder.context) {

    init {
        makeText(
            builder.context,
            builder.text,
            builder.duration
        ).show()
    }

    class Builder(val context: Context) {

        var text: String? = null
        var duration: Int = LENGTH_SHORT

        fun setText(text: String) = apply {
            this.text = text
        }

        fun setDuration(duration: Int) = apply {
            this.duration = duration
        }

        fun build() = apply {
            ToastBuilder(this)
        }
    }
}