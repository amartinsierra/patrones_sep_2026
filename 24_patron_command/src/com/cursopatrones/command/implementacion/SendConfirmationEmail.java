package com.cursopatrones.command.implementacion;

import com.cursopatrones.command.interfaz.Command;

public class SendConfirmationEmail implements Command {
    @Override
    public void execute() {
        System.out.println("Email de confirmación enviado.");
        /*:
        EmailSender.send(…);*/
    }
} 

