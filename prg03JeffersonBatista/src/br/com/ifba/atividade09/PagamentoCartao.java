/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author jeffe
 */
public class PagamentoCartao implements Pagamento {
    //atributos
    private double valor;
    
    //Construtor
    public PagamentoCartao(double valor){
        this.valor = valor;
    }
    
    //metodos acessores 
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    //metodos abstratos (importados da interface pagamento)
    @Override
    public double calcularTotal() {
        double taxa = valor * 0.05; // calculo da porcentagem do desconto
        return valor + taxa; // retorno do valor total após a taxa aplicada
    }

    @Override
    public String imprimirRecibo() {
        String recibo = " ------ RECIBO ------ \n" +
        " (Pagamento por Catão) \n " +
        "Valor: R$ " + getValor() + "\n" +
        "Valor total a pagar com taxa aplicada(5%): " + calcularTotal();
        return recibo;
    }
    
    
}
