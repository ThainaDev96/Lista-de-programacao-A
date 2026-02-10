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
public class Exercicio6_pro_trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* 6. Crie um programa que peça o nome e a altura de uma pessoa em centímetros e apresente na tela o nome e a 
            altura em metros.*/
       
       
String altura_s;
String nome;
float altura=0,conversao=0;

nome=JOptionPane.showInputDialog(null, "Informe o seu nome:");

altura_s=JOptionPane.showInputDialog(null, "Informe a sua altura em centimetros:");
altura=Float.parseFloat(altura_s);

conversao =(altura * 100f); 

JOptionPane.showMessageDialog(null, "A altura em metros eh:"+conversao +nome);

    }
    
}

