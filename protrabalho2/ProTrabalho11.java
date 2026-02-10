
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
public class ProTrabalho11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*11.Escreva um main Java que solicita 5 valores ao usuário, armazena esses valores em
        um array chamado vet1 de inteiros. Depois, copia o conteúdo desse array para um segundo
        array chamado vet1. O programa deve imprimir os dois arrays na tela.
        */
        
        int[] vet1 = new int[5];
        
        int[] vet2 = new int[vet1.length];
   
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os valores" + (i + 1) + ":"));
           
        }
        
        for (int i = 0; i < vet1.length; i++) {
            vet2[i] = vet1[i];
        }
        
          System.out.print("Elementos do array vet1: ");
        for (int i = 0; i < vet1.length; i++) {
            System.out.print(vet1[i] + " ");
        }
        System.out.println(); // Quebra de linha
        
      
        System.out.print("Cópia de vet1): ");
        for (int i = 0; i < vet2.length; i++) {
            System.out.print(vet2[i] + " ");
        }
        System.out.println(); 
    }
}
            
            


        
    

       
    
    

