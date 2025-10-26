/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author jeffe
 */
public class Circulo extends Forma2D { //herda tudo de Forma2D
    private float raio;
    //Construtor
    public Circulo(float raio) {
        this.raio = raio;
    }
    
    @Override
    public float obterArea(){  //Sobrescreve o Metodo para calcular a area da forma
        return (float) (Math.PI * raio * raio);
    }
    
    @Override
    public String toString() {  //Sobresreve o metodo toString para exibir as informaçoes da forma
        return "Círculo com raio = " + raio + ", área = " + String.format("%.1f", obterArea());
    }
}
