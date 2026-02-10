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
public class exercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*29. Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que: A = (base maior + base menor) * 
altura)/2 ; */

String baseMaior_s,baseMenor_s,altura_s;
float baseMaior=0,baseMenor=0,altura=0,areaTrapezio=0;


baseMaior_s=JOptionPane.showInputDialog(null, "Informe o valor da base maior:");
baseMaior=Integer.parseInt(baseMaior_s);

baseMenor_s=JOptionPane.showInputDialog(null, "Informe o valor da base menor:");
baseMenor=Integer.parseInt(baseMenor_s);

altura_s=JOptionPane.showInputDialog(null, "Informe o valor da altura:");
altura=Integer.parseInt(altura_s);

areaTrapezio= ((baseMaior + baseMenor) * altura)/2;

JOptionPane.showMessageDialog(null, "O valor da area do trapezio eh: " + areaTrapezio);



}
}
   


