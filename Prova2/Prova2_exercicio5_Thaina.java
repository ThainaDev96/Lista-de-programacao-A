
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Prova2_exercicio5_Thaina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*5) Escreva um main Java que solicita 8 inteiros ao usuário e guarda esses valores em um array. Depois o
         programa deve descobrir e exibir qual a posição do elemento de maior valor.*/
        
        int[] valores = new int[8]; 
        int maiorValor = valores[0];
        int posicaoMaior = 0;
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor inteiro " + (i + 1)));
        }

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
                posicaoMaior = i;
            }
        }
        System.out.print("Valores digitados: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();

        System.out.println("O maior valor eh " + maiorValor + " e está na posição " + posicaoMaior);
    }
}



        
   


    
