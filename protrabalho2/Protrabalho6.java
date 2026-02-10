
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
public class Protrabalho6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*6.Escreva que leia um array de inteiros e retorna a quantidade de elementos do array
        que são números negativos*/
        
        String[] nInteiros = new String[5];
        int nNegativos=0;
        
        for (int i = 0; i < nInteiros.length; i++) {
            nInteiros[i] = JOptionPane.showInputDialog(null, "Informe numeros inteiros)");
        
            
            int num = Integer.parseInt(nInteiros[i]);
            if (num < 0) {
                nNegativos++;
                
            }
        }
        // Saída de dados
         System.out.print("Números inteiros: ");
        for (int i = 0; i < nInteiros.length; i++) {
            System.out.print(nInteiros[i] + " ");
        }
        
        System.out.println("Quantidade de numeros negativos: " + nNegativos);
         
    }
    
}
