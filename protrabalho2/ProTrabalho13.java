
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @authorThainaRibeiroBairros
 */
public class ProTrabalho13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*13. Escreva um programa que leia, para um array, um conjunto de 10 valores
        e os apresente por ordem inversa
        */
        int[] valor = new int[10];
        
        for (int i = 0; i < valor.length; i++) {
            valor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor " + (i + 1) + ":"));
        }
    
        System.out.print("Os valores em ordem inversa são:");
        for (int i = valor.length - 1; i >= 0; i--) {
            System.out.print(" " + valor[i]);
        }
        System.out.println(); 
    }
}

    

