package com.kotlin.testapp.designpatterns.behavioral.strategy.analytics

class FirebaseAnalytics : AnalyticsService {
    override fun sendAnalytics() {
        println("send data to ${this.javaClass.simpleName}")
    }
}