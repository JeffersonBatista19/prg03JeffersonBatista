/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author jeffe
 */
public class Cubo extends Forma3D {  //Herda os metodos de Forma3D
    private float lado;
    //COnstrutor
    public Cubo(float lado) {
        this.lado = lado;
    }

    @Override
    public float obterArea() {  //Sobrescreve o Metodo para calcular a area da forma
        return (float) (6.0 * lado * lado); 
    }

    @Override
    public float obterVolume() { //também sobrescreve o Metodo para calcular o volume da forma
        return lado * lado * lado;
    }

    @Override
    public String toString() {   //Sobresreve o metodo toString para exibir as informaçoes da forma
        return "Cubo com lados = " + lado + ", área = " + String.format("%.1f", obterArea()) + 
                ", volume = " + String.format("%.1f", obterVolume());
    }
}

