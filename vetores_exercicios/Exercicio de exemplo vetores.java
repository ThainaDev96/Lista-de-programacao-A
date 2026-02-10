/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //implemente um algoritmo que ordene um array com 10 numeros inteiros
        int[] vetor;
        vetor = new int[10];
         for(int i = 0; i<vetor.length; i++){//entrada de dados
             vetor[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"informe os numeros"+i));
           }
             for(int i = 0; i<vetor.length; i++){//saida de dados
               System.out.println("Numeros: "+i+vetor[i]);
               
         }
        
        
        
        
    }
    
}
