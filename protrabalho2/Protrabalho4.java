
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
public class Protrabalho4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
       /*4.Escreva um algoritmo para ler um valor N(validar para aceitar apenas valores positivos).
        Imprima a seguir "PROGRAMA" N vezes.
        */
       
        String[] valor = new String[6]; 
     
        int nroPositivos = 0; 
        int num = 0;
        
        do {
            for (int i = 0; i < valor.length; i++) {
                String num_s = JOptionPane.showInputDialog(null, "Informe um valor inteiro e positivo:");
                num = Integer.parseInt(num_s);
                
                if (num <= 0) {
                    JOptionPane.showMessageDialog(null, "Valor inválido! Informe um valor positivo.");
                    break; 
                }
                
                nroPositivos++;
                valor[i] = "PROGRAMA";
            }
        } while (num <= 0);

     
        for (int i = 0; i < valor.length; i++) {
            System.out.println("PROGRAMA: " + valor[i]);
        }
    }
}


