package com.patrones.composite.empleados;

import java.util.ArrayList;
import java.util.List;

import com.patrones.composite.interfaz.Empleado;

public class EmpleadoCompuesto implements Empleado {
    private final String nombre;
    private final String cargo;
    //lista de empleados subordinados
    private final List<Empleado> subordinados = new ArrayList<>();
    public EmpleadoCompuesto(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }
    public void agregarSubordinado(Empleado empleado) {
        subordinados.add(empleado);
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getCargo() {
        return cargo;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("+ " + cargo + ": " + nombre);
        for (Empleado e : subordinados) {
            e.mostrarDetalles();
        }
    }
}
