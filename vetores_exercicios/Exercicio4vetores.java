/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Exercicio4vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //faça um programa que inverta as posicoes de um array com 10 elementos
        
            int[] vetor;
        vetor = new int[10];
         for(int i = 0; i<vetor.length; i++){//entrada de dados
             vetor[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"informe os numeros"+i));
           }
        int i = 0;
             for(i =vetor.length-1; i>=0; i--){
               System.out.println("Numeros invertidos na ordem: "+i+" "+vetor[i]);
               
        
        
    }
    
}
}
