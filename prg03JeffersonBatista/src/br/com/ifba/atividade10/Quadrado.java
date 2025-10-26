/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author jeffe
 */
public class Quadrado extends Forma2D {
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public float obterArea() {
        return (float) lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado com raio = " + lado + ", área = " + String.format("%.1f", obterArea());
    }
}
