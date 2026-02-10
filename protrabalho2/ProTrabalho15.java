
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @authorThainaRibeiro
 */
public class ProTrabalho15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*15.Escrever um programa que leia 2 vetores de 10 posições cada e faça a
        multiplicação entre eles, colocando o resultado em um 3 vetor.
        */
   
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[10]; 

        System.out.println("Informe os valores para o primeiro array:");
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor " + (i + 1)));
        }

        System.out.println("Informe os valores para o segundo array:");
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor " + (i + 1)));
        }

     
        for (int i = 0; i < vet3.length; i++) {
            vet3[i] = vet1[i] * vet2[i];
        }

    
        System.out.print("Vetor 1: ");
        for (int i = 0; i < vet1.length; i++) {
            System.out.print(vet1[i] + " ");
        }
        System.out.println(); 

        System.out.print("Vetor 2: ");
        for (int i = 0; i < vet2.length; i++) {
            System.out.print(vet2[i] + " ");
        }
        System.out.println(); 

        System.out.print("vet1 * vet2): ");
        for (int i = 0; i < vet3.length; i++) {
            System.out.print(vet3[i] + " ");
        }
        System.out.println(); 
    }
}

    
    

