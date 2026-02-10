
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
public class Protrabalho7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     /*7.Faça um programa que leia um array de 10 valores de inteiros chamando A e um valor 
     inteiro x e mostre a quantidade de vezes que x aparece no array A */
     
     String[] A = new String[10];
     int cont=0;
     int valorX=2;
     
     for (int i = 0; i < A .length; i++) {
            A [i] = JOptionPane.showInputDialog(null, "Informe valores inteiros)");
     }
   
     
      for (int i = 0; i < A .length; i++){
          if (A[i].equalsIgnoreCase("2")) {
                 cont++;
      
        }
    }
     System.out.print("Números inteiros: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A [i] + " "); 
            
        }
     System.out.println("Quantidade de vezes que o valor numero 2 aparece no array : " + cont);
        
     
     
     
    }
    
}
