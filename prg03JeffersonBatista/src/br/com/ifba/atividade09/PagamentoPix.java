/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author jeffe
 */
public class PagamentoPix implements Pagamento {
    //atributos
    private double valor;
    
    //construtor
    public PagamentoPix(double valor){
        this.valor = valor;
    }
    
    //metodos acessores 
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    //metodos abstratos (Importados da intarface Pagamentos
    @Override
    public double calcularTotal() {
        return valor - (valor * 0.02); // retorno do valor total após o cashback
    }

    @Override
    public void imprimirRecibo() {
        System.out.println(" ------ RECIBO ------ ");
        System.out.println(" (Pagamento por Pix) ");
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Valor total a pagar após caschback (2%): " + calcularTotal());
    }
    
    
}
