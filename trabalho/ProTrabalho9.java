
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThainaRibeiro
 */
public class ProTrabalho9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamanhoX = 0;
        // TODO code application logic here
        
     /*9.Crie um programa que leia o número de pessoas e armazene na variável x.Declare e crie
        um array de tamanho x do tipo String.Faça um laço de repetição que executa um bloco de
        codigo x vezes, solicita um nome completo ao usuário e insere no array, preenchendo
        todas as posições dele.*/
        
        String tamanho_s = JOptionPane.showInputDialog(null, "Informe o número de pessoas:");
        tamanhoX = Integer.parseInt(tamanho_s);

        if (tamanhoX > 0) {
            String[] pessoas = new String[tamanhoX];//definir o tamanho antes de criar o vetor 

            for (int i = 0; i < pessoas.length; i++) {
                pessoas[i] = JOptionPane.showInputDialog(null, "Informe o nome completo da pessoa " + (i + 1) + ":");
            }

            System.out.println("Nomes completos inseridos:");
            for (int i = 0; i < pessoas.length; i++) {
                System.out.println((i + 1) + ". " + pessoas[i]);
            }
        } 
        }
    }







