/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;
/**
 *
 * @author jeffe
 */
public class ClassePrincipal {
    public static void main(String[] args) {
        Forma[] formas = new Forma[6];
        formas[0] = new Circulo(2.5f);
        System.out.println(formas[0]);
        
        formas [1] = new Quadrado(3.0f);
        System.out.println(formas[1]);
        
        formas [2] = new Triangulo(4.0f, 2.5f);
        System.out.println(formas[2]);
        
        
        
    }
}
