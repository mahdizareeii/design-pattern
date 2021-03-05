package com.kotlin.testapp.designpatterns.creational.factory

import com.kotlin.testapp.designpatterns.creational.factory.cars.Benz
import com.kotlin.testapp.designpatterns.creational.factory.cars.Bugatti
import com.kotlin.testapp.designpatterns.creational.factory.cars.Toyota

class CarFactory {
    fun create(type: CarType): Car? {
        return when (type) {
            CarType.BENZ -> Benz()
            CarType.BUGATTI -> Bugatti()
            CarType.TOYOTA -> Toyota()
            CarType.UN_KNOW -> null
        }
    }
}