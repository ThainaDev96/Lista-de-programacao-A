
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @ThainaRibeiro
 */
public class ProTrabalho12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*12.Escreva um programa que determine se dois arrays unidimensionais de números
        inteiros são iguais. Crie dois arrays de tamanho 5, leia 5 itens para cada array
        e depois compare-os.
        */
       
        // Criando os arrays vet1 e vet2 de tamanho 5
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];

        System.out.println("Informe os valores para o primeiro array:");
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor " + (i + 1) + " para o primeiro array:"));
        }

        System.out.println("Informe os valores para o segundo array:");
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor " + (i + 1) + " para o segundo array:"));
        }

        
        boolean saoIguais = true;
        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i] != vet2[i]) {
                saoIguais = false;
                break; 
            }
        }

        if (saoIguais) {
            System.out.println("Os arrays são iguais.");
        } else {
            System.out.println("Os arrays não são iguais.");
        }
    }
}

    