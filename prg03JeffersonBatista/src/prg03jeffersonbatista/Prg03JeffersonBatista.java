/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prg03jeffersonbatista;
// Definição do pacote onde a classe principal está.
import br.com.ifba.atividade03.view.telacalculadora;
// Importa a classe "telacalculadora", que está em outro pacote.
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
                //faz com que a interface gráfica seja criada na Event Dispatch Thread.
        public void run() {
            new telacalculadora().setVisible(true);
            //Cria uma nova instância da tela da calculadora e a torna visível
        }
    });

    }
    
}
