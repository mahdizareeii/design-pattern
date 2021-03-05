package com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory

import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.airplanefactory.AirPlaneFactory

abstract class MotorizedFactory {
    abstract fun create(type: MotorizedType): MotorizedDevice

    companion object {
        inline fun <reified T : MotorizedFactory> createFactory(): MotorizedFactory =
            when (T::class) {
                AirPlaneFactory::class -> AirPlaneFactory()
                else -> throw IllegalArgumentException()
            }
    }
}