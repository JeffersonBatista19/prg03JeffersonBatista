/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author jeffe
 */
public class ClasseMain {
    public static void main(String[] args) {
    //Testes com a classe de pagamentos em dinheiro
    PagamentoDinheiro PD = new PagamentoDinheiro(100);
    PD.imprimirRecibo();
    PD.setValor(250);
    PD.imprimirRecibo();
    
    //Teste com a classe de pagamentos em dinheiro
    PagamentoCartao PC = new PagamentoCartao(100);
    PC.imprimirRecibo();
    PC.setValor(250);
    PC.imprimirRecibo();
   
    
    PagamentoPix PP = new PagamentoPix(100);
    PP.imprimirRecibo();
    PP.setValor(250);
    PP.imprimirRecibo();
    }
}
