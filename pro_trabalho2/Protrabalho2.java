/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protrabalho2;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiro
 */
public class Protrabalho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*2   . Ler dez números e mostrar a média dos números ímpares. */
        int[] vetor = new int[10]; // Vetor para armazenar os 10 números
        int somaImpares = 0;
        int contImpares = 0;

        // Entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número " + (i + 1)));
        }

        // Cálculo da média dos números ímpares
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) { // Verifica se o número é ímpar
                somaImpares += vetor[i]; // Adiciona o número ímpar à soma
                contImpares++; // Incrementa o contador de números ímpares
            }
        }

        float mediaImpares = (float) somaImpares / contImpares; // Calcula a média dos números ímpares

        // Saída de dados
        System.out.println("A média dos números ímpares é: " + mediaImpares);
    }
}

    
    

