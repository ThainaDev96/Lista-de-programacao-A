/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_pro_trabalho;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class exercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*22. Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui. 
Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 
dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS. */

String nome, idade_s;
int idade = 0, diasVida = 0;

nome = JOptionPane.showInputDialog(null, "Informe o seu nome:");

idade_s = JOptionPane.showInputDialog(null, "Informe a sua idade:");
idade = Integer.parseInt(idade_s);

diasVida = idade * 365;

JOptionPane.showMessageDialog(null, nome + ", você já viveu " + diasVida + " dias.");
    }
}


    
