/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Exercicio3vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Desenvolva um programa que dado um array de 10 numeros inteiros multiplique o primeiro
        //elemento pelo seguinte, o resultado deve então ser multiplicado pelo proximo elemento
        //ate que todos os elementos sejam percorridos.Imprima o valor final.
        
         int[] vetor;
        vetor = new int[10];
        int produto=1;
         for(int i = 0; i<vetor.length; i++){//entrada de dados
             vetor[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"informe os numeros"+i));
         }
         for(int i = 0; i<vetor.length; i++){//processamento
             
         produto= produto*vetor[i];
             
         }
           
            System.out.println("Resultado:"+produto);
               
    
    
    }
}
