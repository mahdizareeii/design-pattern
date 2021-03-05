package com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.airplanefactory

import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.airplanefactory.airplanes.Airbus
import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.airplanefactory.airplanes.Boeing
import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.airplanefactory.airplanes.Fokker
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedDevice
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedFactory
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedType

class AirPlaneFactory : MotorizedFactory() {
    override fun create(type: MotorizedType): MotorizedDevice {
        return when (type) {
            MotorizedType.AIRBUS -> Airbus()
            MotorizedType.BOEING -> Boeing()
            MotorizedType.FOKKER -> Fokker()
            else -> throw IllegalArgumentException()
        }
    }
}