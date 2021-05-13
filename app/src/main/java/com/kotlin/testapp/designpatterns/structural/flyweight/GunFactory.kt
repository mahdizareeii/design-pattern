package com.kotlin.testapp.designpatterns.structural.flyweight

import com.kotlin.testapp.designpatterns.structural.flyweight.guns.AK47
import com.kotlin.testapp.designpatterns.structural.flyweight.guns.Gun
import com.kotlin.testapp.designpatterns.structural.flyweight.guns.M9
import com.kotlin.testapp.designpatterns.structural.flyweight.guns.MP5

object GunFactory {

    private val gunMap = HashMap<GunType, Gun>()

    fun getGun(gunType: GunType): Gun {
        var gun = gunMap[gunType]
        if (gun == null) {
            gun = createGun(gunType)
            gunMap[gunType] = gun
        }
        return gun
    }

    private fun createGun(gunType: GunType) = when (gunType) {
        GunType.AK47 -> AK47()
        GunType.MP5 -> MP5()
        GunType.M9 -> M9()
    }

}