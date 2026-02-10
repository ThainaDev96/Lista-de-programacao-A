
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
public class ProTrabalho10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*10.Escrever um main Java que lê 20 números reis e armazena esses valores em um array.
        O programa deve calcular a média aritmética dos valores do vetor e imprimir todos os valores
        menores do que a média calculada*/
      
        int[] vetor = new int[20];
        int soma = 0;
        float media = 0;
        
        // Entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número " + (i + 1) + ":"));
            soma += vetor[i]; 
        }

        media = (float) soma / vetor.length;
        System.out.println("A média dos valores é: " + media);

        
        System.out.println("Valores menores que a média:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
    }
}
    

       