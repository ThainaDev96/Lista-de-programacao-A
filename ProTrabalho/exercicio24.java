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
public class exercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*24. O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo que leia o 
peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a balança já desconte o 
peso do prato. */


String peso_prato_s;
float peso_prato, valorPagar;

peso_prato_s = JOptionPane.showInputDialog(null, "Informe o peso do prato (em quilos):");
peso_prato = Float.parseFloat(peso_prato_s);

valorPagar = 12.00f * peso_prato;

JOptionPane.showMessageDialog(null, "O valor em reais a pagar é: " + valorPagar);
}
}


