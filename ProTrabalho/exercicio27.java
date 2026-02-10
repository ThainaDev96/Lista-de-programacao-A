/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_pro_trabalho;
 
import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class exercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*27. Uma fábrica controla o tempo de trabalho sem acidentes pela quantidade de dias. Faça um algoritmo para
converter este tempo em anos, meses e dias. Assuma que cada mês possui sempre 30 dias.*/


String quantDias_s;
int quantDias = 0, anos = 0, meses = 0, diasRestantes = 0;

quantDias_s = JOptionPane.showInputDialog(null, "Informe a quantidade de dias sem acidentes:");
quantDias = Integer.parseInt(quantDias_s);

anos = quantDias / 365;  
diasRestantes = quantDias % 365;

meses = diasRestantes / 30;  
diasRestantes = diasRestantes % 30;

JOptionPane.showMessageDialog(null, "Anos: " + anos);
JOptionPane.showMessageDialog(null, "Meses: " + meses);
JOptionPane.showMessageDialog(null, "Dias: " + diasRestantes);
    }
}
    
