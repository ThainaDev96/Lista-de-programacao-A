/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_pro_trabalho;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiro
 */
public class exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*18. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário. */


String acrescimo_s, precoProduto_s;
float acrescimo = 0, precoProduto = 0, valorVenda = 0;

precoProduto_s = JOptionPane.showInputDialog(null, "Informe o preço do produto:");
precoProduto = Float.parseFloat(precoProduto_s);

acrescimo_s = JOptionPane.showInputDialog(null, "Informe o valor de acréscimo do produto (%):");
acrescimo = Float.parseFloat(acrescimo_s);

valorVenda = precoProduto * (acrescimo / 100);

JOptionPane.showMessageDialog(null, "O valor da venda é: R$" + valorVenda);
    }
}

    

