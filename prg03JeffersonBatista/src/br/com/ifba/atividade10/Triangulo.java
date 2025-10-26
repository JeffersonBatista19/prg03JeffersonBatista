/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author jeffe
 */
public class Triangulo extends Forma2D { //herda metodos de Formas2D
    private float base;
    private float altura;
    //Construtor com parâmetro base e altura float
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float obterArea() {  //Sobrescreve o Metodo para calcular a area da forma
        return  (base * altura) / 2.0f;
    }

    @Override
    public String toString() {  //Sobresreve o metodo toString para exibir as informaçoes da forma
        return "triangulo de Base = " + base + " e altura " + altura + ", área = " + String.format("%.1f", obterArea());
    }
}