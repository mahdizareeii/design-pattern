package com.kotlin.testapp.designpatterns.behavioral.strategy.analytics

class OneSignalAnalytics : AnalyticsService {
    override fun sendAnalytics() {
        println("send data to ${this.javaClass.simpleName}")
    }
}