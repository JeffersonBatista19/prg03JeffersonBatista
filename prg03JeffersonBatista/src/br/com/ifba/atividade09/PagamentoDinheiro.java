/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author jeffe
 */
public class PagamentoDinheiro implements Pagamento{
    //atributos
    private double valor;
    
    //classe contrutor
    public PagamentoDinheiro(double valor){
         this.valor = valor;
    }
    
    //metodos acessores 
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    //metodos abstratos (importados da interface Pagamentp) 
    @Override
    public double calcularTotal() {
        double desconto = valor * 0.10; // calculo da porcentagem do desconto
        return valor - desconto; // retorno do valor total após o desconto
    }

    @Override
    public String imprimirRecibo() {
        String recibo = " ------ RECIBO ---\n" +
        " (Pagamento em Dinheiro)\n" +
        "Valor: R$ " + getValor() + "\n" +
        "Valor total a pagar com desconto(10%): " + calcularTotal();
        return recibo;
    }
}
