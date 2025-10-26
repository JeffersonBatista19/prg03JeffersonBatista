/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author jeffe
 */
public class Esfera extends Forma3D { //Herda os metodos de Forma3D
    private float raio;

    public Esfera(float raio) {
        this.raio = raio;
    }

    @Override
    public float obterArea() {  //Sobrescreve o Metodo para calcular a area da forma
        return (float) (4.0 * Math.PI * raio * raio);
    }

    @Override
    public float obterVolume() {   //também sobrescreve o Metodo para calcular o volume da forma
        return (float) ((4.0 / 3.0) * Math.PI * raio * raio * raio);
    }

    @Override
    public String toString() {    //Sobresreve o metodo toString para exibir as informaçoes da forma
        return "Esfera com raio = " + raio + ", área = " + String.format("%.1f", obterArea()) + 
                ", volume = " + String.format("%.1f", obterVolume());
    }
}
