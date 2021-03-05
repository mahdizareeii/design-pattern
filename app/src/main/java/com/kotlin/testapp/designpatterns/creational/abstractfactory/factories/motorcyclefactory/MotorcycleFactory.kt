package com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.motorcyclefactory

import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.motorcyclefactory.motorcycles.Honda
import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.motorcyclefactory.motorcycles.Suzuki
import com.kotlin.testapp.designpatterns.creational.abstractfactory.factories.motorcyclefactory.motorcycles.Yamaha
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedDevice
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedFactory
import com.kotlin.testapp.designpatterns.creational.abstractfactory.motorizedfactory.MotorizedType

class MotorcycleFactory : MotorizedFactory() {
    override fun create(type: MotorizedType): MotorizedDevice {
        return when (type) {
            MotorizedType.HONDA -> Honda()
            MotorizedType.YAMAHA -> Yamaha()
            MotorizedType.SUZUKI -> Suzuki()
            else -> throw IllegalArgumentException()
        }
    }
}