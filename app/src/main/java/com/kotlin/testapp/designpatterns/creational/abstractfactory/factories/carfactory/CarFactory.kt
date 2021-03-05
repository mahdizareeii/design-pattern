package com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.carfactory

import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.carfactory.cars.Benz
import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.carfactory.cars.Toyota
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedDevice
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedFactory
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedType

class CarFactory : MotorizedFactory() {
    override fun create(type: MotorizedType): MotorizedDevice {
        return when (type) {
            MotorizedType.BENZ -> Benz()
            MotorizedType.BUGATTI -> Benz()
            MotorizedType.TOYOTA -> Toyota()
            else -> throw IllegalArgumentException()
        }
    }
}