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
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*8. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa 
apenas em dias.*/

String idade_s, meses_s, dias_s;
int idade, meses, dias, total_dias;

idade_s = JOptionPane.showInputDialog(null, "Informe a sua idade:");
idade = Integer.parseInt(idade_s);

meses_s = JOptionPane.showInputDialog(null, "Informe o seu mês de nascimento (1 a 12):");
meses = Integer.parseInt(meses_s);

while (meses < 1 || meses > 12) {
JOptionPane.showMessageDialog(null, "Mês inválido! O mês deve estar entre 1 e 12.");

meses_s = JOptionPane.showInputDialog(null, "Informe o seu mês de nascimento (1 a 12):");
meses = Integer.parseInt(meses_s);
}

dias_s = JOptionPane.showInputDialog(null, "Informe o seu dia de nascimento:");
dias = Integer.parseInt(dias_s);

if (meses == 4 || meses == 6 || meses == 9 || meses == 11) {
total_dias = (idade * 365) + (meses * 30) - dias; 
} else {
total_dias = (idade * 365) + (meses * 31) - dias; 
}
JOptionPane.showMessageDialog(null, "O número exato de dias com base na idade em anos, meses e dias é: " + total_dias);
    }
}


   

