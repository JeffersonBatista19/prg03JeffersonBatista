/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author jeffe
 */
public class Piramide extends Forma3D {  //Herda os metodos de Forma3D
    private float ladoBase;
    private float altura;   
    //cosntrutor
    public Piramide(float ladoBase, float altura) {  
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    @Override
    public float obterArea() { //Sobrescreve o Metodo para calcular a area da forma
        double baseArea = ladoBase * ladoBase;
        double alturaInclinada = (float) Math.sqrt((ladoBase / 2.0) * (ladoBase / 2.0) + altura * altura);
        double lateralArea = 2.0 * ladoBase * alturaInclinada; 
        return (float) (baseArea + lateralArea);
    }

    @Override
    public float obterVolume() { //também sobrescreve o Metodo para calcular o volume da forma
        return (float) ((ladoBase * ladoBase * altura) / 3.0);
    }

    @Override
    public String toString() { //Sobresreve o metodo toString para exibir as informaçoes da forma 
        return "Pirâmide com base = " + ladoBase + " e altura " + altura + ", área = " + String.format("%.1f", obterArea()) + 
                ", volume = " + String.format("%.1f", obterVolume());
    }
}

