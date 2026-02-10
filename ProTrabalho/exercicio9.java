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
public class exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*9. Faça um programa que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e 
dias.*/


String idade_s;
int idade = 0, anos = 0, meses = 0, dias = 0, diasRestantes = 0;

idade_s = JOptionPane.showInputDialog(null, "Informe sua idade :");
idade = Integer.parseInt(idade_s);

        anos = idade / 365;
        diasRestantes = idade % 365;
        meses = diasRestantes / 30;
        dias = diasRestantes % 30;

        JOptionPane.showMessageDialog(null, "Sua idade é: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
    }
}




