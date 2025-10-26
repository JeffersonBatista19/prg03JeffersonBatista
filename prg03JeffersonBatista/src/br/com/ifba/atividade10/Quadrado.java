/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author jeffe
 */
public class Quadrado extends Forma2D { //herda tudo de Forma2D
    private float lado;
    //Construtor com parametro float 
    public Quadrado(float lado) { 
        this.lado = lado;
    }

    @Override
    public float obterArea() {  //Sobrescreve o Metodo para calcular a area da forma
        return (float) lado * lado;
    }

    @Override
    public String toString() {  //Sobresreve o metodo toString para exibir as informaçoes da forma
        return "Quadrado com lado = " + lado + ", área = " + String.format("%.1f", obterArea());
    }
}
