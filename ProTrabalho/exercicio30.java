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
public class exercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*30. Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que: A = lado * lado.*/

String lado_s;
float lado, area;

lado_s = JOptionPane.showInputDialog(null, "Informe o valor do lado do quadrado:");
lado = Float.parseFloat(lado_s);

area = lado * lado;

JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);
    }
}

    
    

