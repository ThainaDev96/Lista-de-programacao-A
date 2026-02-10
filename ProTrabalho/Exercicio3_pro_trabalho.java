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
public class Exercicio3_pro_trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*3. Elaborar um programa que leia dois valores inteiros e troque o valor, a e b de forma que a fique com o valor de 
        b, b com o valor de a.*/
        
String valorA_s,valorB_s;
int valorA,valorB,valorC;

valorA_s=JOptionPane.showInputDialog(null, "Informe o valor de A:");
valorA=Integer.parseInt(valorA_s);

valorB_s=JOptionPane.showInputDialog(null, "Informe o valor de B:");
valorB=Integer.parseInt(valorB_s);

valorC=valorA;
valorA=valorB;
valorB=valorC;

JOptionPane.showMessageDialog(null, "A troca com B " + valorC );
JOptionPane.showMessageDialog(null, "B troca com A " + valorC );

    }





    }
    

