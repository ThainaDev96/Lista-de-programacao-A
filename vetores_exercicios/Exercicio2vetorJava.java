/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2vetor.java;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Exercicio2vetorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escreva um programa que some todos os valores contidos em um array de inteiros 
        //e caucule a media 
        
        int[] vetor;
        int soma=0;
        float media=0;
        
        vetor = new int[10];
         for( int i = 0; i<vetor.length; i++){//entrada de dados
             vetor[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"informe os numeros"+i));
           }
           for(int i = 0; i<vetor.length; i++){
               soma=soma+vetor[i];
              
           }

         media= soma/10;
         System.out.println("a media dos valores eh:"+media);
               
         
    }
    
}
