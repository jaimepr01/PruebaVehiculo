/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.domain;

/**
 *
 * @author jaime
 */
public class Vehiculo {
    public String matricula, marca, modelo, color;
    public double tarifa;
    public boolean disponible;
    public String atributos;
    
    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
        this.atributos = atributos;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getAtributos() {
        return atributos;
    }
    public void mostrar(){
        System.out.println("La matrícula del coche es:" + matricula);
        System.out.println("La marca del coche es:" + marca);
        System.out.println("El modelo del coche es:" + modelo);
        System.out.println("El color del coche es:" + color);
        System.out.println("El precio del coche es:" + tarifa);
        System.out.println("La disponibilidad del coche es:" + disponible);
    }
 
    
    
}
