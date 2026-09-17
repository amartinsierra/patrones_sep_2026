package com.cursopatrones.command.implementacion;

import java.util.ArrayList;
import java.util.List;

import com.cursopatrones.command.interfaz.Command;

public class CommandDispatcher {
    private final List<Command> commands=new ArrayList<>();
    public void addCommand(Command command) {
        commands.add(command);
    }
    public void dispatch() {
        commands.forEach(Command::execute);
    }
}
