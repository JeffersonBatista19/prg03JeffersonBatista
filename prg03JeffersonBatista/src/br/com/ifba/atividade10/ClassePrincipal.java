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
        
        formas[0] = new Circulo(2.5f);//teste circulo
        formas[1] = new Esfera(1.5f);//teste esfera
        
        formas[2] = new Quadrado(3.0f);//teste quadrado
        formas[3] = new Cubo(2.0f);//teste cubo
        
        formas[4] = new Triangulo(4.0f, 2.5f);//teste triangulo                
        formas[5] = new Piramide(3.0f, 4.0f); //teste piramide            

        // for each que percorre o array
        for (Forma f : formas) {
            System.out.println(f.toString());
            if (f instanceof Forma2D) {
                Forma2D f2 = (Forma2D) f; //mostra o toString e area 
                System.out.printf("Área = %.2f%n", f2.obterArea());
            } else if (f instanceof Forma3D) { //mostra toString, area e volume
                Forma3D f3 = (Forma3D) f;
                System.out.printf("Área (superfície) = %.2f%n", f3.obterArea());
                System.out.printf("Volume = %.2f%n", f3.obterVolume());
            }
            System.out.println("=============================");
        }
    }

}
