package com.kotlin.testapp.designpatterns.behavioral.strategy.analytics

class FireHouseAnalytics : AnalyticsService {
    override fun sendAnalytics() {
        println("send data to ${this.javaClass.simpleName}")
    }
}