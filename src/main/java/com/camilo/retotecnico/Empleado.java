package com.camilo.retotecnico;

public abstract class Empleado {

    // Atributos --------------------------------------*

    private String nombre;
    private int edad;
    private double salario;
    private double bonificación;

    // Constructor --------------------------------------*

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        bonificación = 150000;
    }

    // Getters & Setters (necesarios) --------------------------------------*

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificación() {
        return bonificación;
    }


    // Método Abstracto --------------------------------------*

    public abstract String aplicaBonificacion();


}
