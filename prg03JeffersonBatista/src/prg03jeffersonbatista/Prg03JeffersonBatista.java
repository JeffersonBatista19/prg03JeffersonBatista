/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prg03jeffersonbatista;

import br.com.ifba.atividade03.view.telacalculadora;

/**
 *
 * @author jeffe
 */
public class Prg03JeffersonBatista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new telacalculadora().setVisible(true);
        }
    });

    }
    
}
