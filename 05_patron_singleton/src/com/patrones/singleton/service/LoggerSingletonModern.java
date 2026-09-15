package com.patrones.singleton.service;

public enum LoggerSingletonModern {
	INSTANCE; //se crea una única instancia de forma segura, garantizado por la JVM
    public void log(String msg) {
        System.out.println("[LOG] " + msg);
    }

}
