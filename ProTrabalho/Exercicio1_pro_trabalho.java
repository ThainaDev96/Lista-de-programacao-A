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
public class Exercicio1_pro_trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*1. Faça um programa que leia três variáveis do tipo int e que calcula e mostra o produto dos três inteiros e a 
            divisão do primeiro pelo segundo. */
String n1_s,n2_s,n3_s;
int nro1,nro2,nro3;
float produto,divisao;

n1_s=JOptionPane.showInputDialog(null, "Informe o número 1:");
nro1=Integer.parseInt(n1_s);

n2_s=JOptionPane.showInputDialog(null, "Informe o número 2:");
nro2=Integer.parseInt(n2_s);

n3_s=JOptionPane.showInputDialog(null, "Informe o número 3:");
nro3=Integer.parseInt(n3_s);

 produto = nro1 * nro2 * nro3;
 JOptionPane.showMessageDialog(null, "O produto dos valores é: " + produto);

if (nro1 != 0 && nro2 != 0) {
    divisao = (float) nro1 / nro2;
    JOptionPane.showMessageDialog(null, "A divisão do primeiro pelo segundo é: " + divisao);
} else {
    JOptionPane.showMessageDialog(null, "Impossível realizar a divisão por zero ou algum dos números é zero!");
}

}
}
    
    


    
    


