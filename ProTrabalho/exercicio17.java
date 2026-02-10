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
public class exercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*17. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um 
programa que receba um valor de uma compra e mostre o valor das prestações. */

String valorCompra_s;
float valorCompra, valorPrestacao;

valorCompra_s = JOptionPane.showInputDialog(null, "Informe o valor da compra:");
valorCompra = Float.parseFloat(valorCompra_s);

valorPrestacao = valorCompra / 5;

JOptionPane.showMessageDialog(null, "O valor de cada prestação sem juros é: " + valorPrestacao);
    }
}
    


