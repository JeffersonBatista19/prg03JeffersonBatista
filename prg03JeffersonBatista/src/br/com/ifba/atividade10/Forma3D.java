/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author jeffe
 */
public abstract class Forma3D extends Forma{   //herda ou estende da raiz Forma
    public abstract float obterArea();   
    public abstract float obterVolume(); //todas as "Filhas" terão esses 2 metodos herdados 
}
