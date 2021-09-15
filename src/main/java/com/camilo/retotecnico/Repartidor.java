package com.camilo.retotecnico;


public class Repartidor extends Empleado {

    // Atributos --------------------------------------*

    private int zona;

    // Constructor --------------------------------------*

    public Repartidor(String nombre, int edad, double salario, int zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    // Método sobreescrito --------------------------------------*

    @Override
    public String aplicaBonificacion() {
       if(getEdad() < 25 && zona == 3){
           return "Este empleado recibirá una bonificación \nde $150000 y su nuevo salario es \n$" + (getSalario() + getBonificación() );
       } else return "Este empleado no aplica para bonificación,\n su salario es $" + getSalario();
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return getNombre();
    }

}
