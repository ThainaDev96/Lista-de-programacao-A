
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
public class Protrabalho3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* 3.   Ler o estado civil de quinze pessoas e mostrar a quantidade de pessoas casadas. */
   
        String[] estadosCivis = new String[15]; // Array para armazenar os estados civis das 15 pessoas
        int pessoasCasadas = 0; // Variável para contar quantas pessoas estão casadas
        
        // Entrada de dados
        for (int i = 0; i < estadosCivis.length; i++) {
            estadosCivis[i] = JOptionPane.showInputDialog(null, "Informe seu estado civil:(1 - Solteiro 2 - Casado)");
        }
        
        // Contagem de pessoas casadas
        for (int i = 0; i < estadosCivis.length; i++) {
            if (estadosCivis[i].equals("2")) { 
                pessoasCasadas++;
            }
        }
        
        // Saída de dados
        System.out.println("Quantidade de pessoas casadas: " + pessoasCasadas);
    }
}

