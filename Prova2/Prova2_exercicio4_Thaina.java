
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
public class Prova2_exercicio4_Thaina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*4) Escrever um programa que lê um vetor X(10) e o escreve. Leia um valor inteiro e diga se este valor encontra-
        se em X e quantas vezes.*/
      
        int[] valorX = new int[10]; 
        int X = 2; 
        int contador = 0;
        for (int i = 0; i < valorX.length; i++) {
            valorX[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe valores de 0-10"));
        }
  
        for (int i = 0; i < valorX.length; i++) {
            if (valorX[i] == X) {
                contador++;
            }
        }
        System.out.print("Vetor X: ");
        for (int i = 0; i < valorX.length; i++) {
            System.out.print(valorX[i] + " ");
        }
        System.out.println();

     
        System.out.println("Quantidade de vezes que o valor " + X + " ocorre no vetor X: " + contador);
 
    }
}

    

    