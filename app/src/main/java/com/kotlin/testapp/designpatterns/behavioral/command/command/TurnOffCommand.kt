package com.kotlin.testapp.designpatterns.behavioral.command.command

import com.kotlin.testapp.designpatterns.behavioral.command.electricalsystems.ElectricalSystem

class TurnOffCommand(private val electricalSystem: ElectricalSystem) : Command {
    override fun execute() {
        electricalSystem.turnOff()
    }
}