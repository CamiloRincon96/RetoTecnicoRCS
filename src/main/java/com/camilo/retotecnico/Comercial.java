package com.camilo.retotecnico;

public class Comercial extends Empleado {
    // Atributos --------------------------------------*

    private double comision;

    // Constructor --------------------------------------*


    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }



    @Override
    public String aplicaBonificacion() {
        if (getEdad() > 30 && comision > 400000){
            setSalario(getSalario() + getBonificación());
            return "Este empleado recibirá una bonificación \nde $150000 y su nuevo salario es \n$" + (getSalario() + getComision());
        } else return "Este empleado no aplica para bonificación,\n su salario es $" + (getSalario() + getComision());
    }

    @Override
    public String toString() {
        return getNombre();
    }
}
