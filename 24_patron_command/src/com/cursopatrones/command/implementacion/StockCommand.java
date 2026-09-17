package com.cursopatrones.command.implementacion;

import com.cursopatrones.command.interfaz.Command;

public class StockCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Actualziando stock.");
        /*:
         restApi.invoke(….);*/
    }
}

