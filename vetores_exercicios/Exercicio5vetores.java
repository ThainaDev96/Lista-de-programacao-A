/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Exercicio5vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //dados dois vetores quaiquer de booleanos compare-os e informe se ambos são identicos, para serem
        //identicos os vetores devem possuir o mesmo tamanho e os mesmos elementos em cada posição
        
        boolean[] vetor = new boolean[2];
        boolean[] vetor1 = new boolean[2];
        
        vetor[0] = true; 
        vetor[1] = false;
        
        vetor1[0] = true;
        vetor1[1] = false;
        
        boolean saoIguais = true; // Assumimos que são iguais até encontrar diferença
        
        // Verificar se os vetores são idênticos
        if (vetor.length == vetor1.length) { // Verifica se têm o mesmo tamanho
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] != vetor1[i]) {
                    saoIguais = false;
                    break; // Se encontrar uma diferença, para a comparação
                }
            }
        } else {
            saoIguais = false; // Se tamanhos são diferentes, não são iguais
        }
        
        if (saoIguais) {
            JOptionPane.showMessageDialog(null, "Os vetores são idênticos.");
        } else {
            JOptionPane.showMessageDialog(null, "Os vetores são diferentes.");
        }
    }
}

    
    

   
        //
        