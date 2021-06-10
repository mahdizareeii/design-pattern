package com.kotlin.testapp.designpatterns.behavioral.command

import com.kotlin.testapp.designpatterns.behavioral.command.command.Command

class CommandManager {
    private val commands = ArrayList<Command>()

    fun addCommand(command: Command) {
        commands.add(command)
    }

    fun executeCommand() {
        for (command in commands) command.execute()
        commands.clear()
    }
}