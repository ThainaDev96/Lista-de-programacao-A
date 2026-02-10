/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provathainaribeiro;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Questao5_Thaina_Ribeiro_Bairros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            /*5)Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que: A = lado * lado;*/
            
        
String lado_s,reposta_s;
float lado=0, area=0;
int resposta=1;

while(resposta ==1){
String resposta_s = JOptionPane.showInputDialog(null, "informe 1 para para continuar ou 2 para encerrar ");
resposta = Integer.parseInt(resposta_s);

if(resposta==2)
    break;

lado_s = JOptionPane.showInputDialog(null, "Informe o valor do lado do quadrado:");
lado = Float.parseFloat(lado_s);

area = lado * lado;

JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);
    }
    }
}

   

    

