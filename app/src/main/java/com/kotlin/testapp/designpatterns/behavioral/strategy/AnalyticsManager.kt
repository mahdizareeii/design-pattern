package com.kotlin.testapp.designpatterns.behavioral.strategy

import com.kotlin.testapp.designpatterns.behavioral.strategy.analytics.AnalyticsService

class AnalyticsManager(private val analyticsService: AnalyticsService) {
    fun sendAnalytics() {
        analyticsService.sendAnalytics()
    }
}