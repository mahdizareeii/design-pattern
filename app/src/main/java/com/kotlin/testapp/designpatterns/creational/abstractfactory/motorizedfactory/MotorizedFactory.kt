package com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory

import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.airplanefactory.AirPlaneFactory
import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.carfactory.CarFactory
import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.motorcyclefactory.MotorcycleFactory

abstract class MotorizedFactory {
    abstract fun create(type: MotorizedType): MotorizedDevice

    companion object {
        inline fun <reified T : MotorizedFactory> createFactory(): MotorizedFactory =
            when (T::class) {
                AirPlaneFactory::class -> AirPlaneFactory()
                CarFactory::class -> CarFactory()
                MotorcycleFactory::class -> MotorcycleFactory()
                else -> throw IllegalArgumentException()
            }
    }
}