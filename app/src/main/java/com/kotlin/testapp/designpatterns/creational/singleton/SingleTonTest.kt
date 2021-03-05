package com.kotlin.testapp.designpatterns.creational.singleton

class SingleTonTest {

    private object HOLDER {
        val INSTANCE = SingleTonTest()
    }

    companion object {
        val instance: SingleTonTest by lazy {
            HOLDER.INSTANCE
        }
    }

}