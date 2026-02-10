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
public class exercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*26. Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida 
respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a quantidade de 
camisetas pequenas, médias e grandes referentes a uma venda, e a máquina informe quanto será o valor 
arrecadado.*/

String quantP_s, quantM_s, quantG_s;
int quantP = 0, quantM = 0, quantG = 0;
float valorP = 10.0f, valorM = 12.0f, valorG = 15.0f;
float valorArrecadado;

quantP_s = JOptionPane.showInputDialog(null, "Informe o número de camisetas vendidas do tamanho P:");
quantP = Integer.parseInt(quantP_s);

quantM_s = JOptionPane.showInputDialog(null, "Informe o número de camisetas vendidas do tamanho M:");
quantM = Integer.parseInt(quantM_s);

quantG_s = JOptionPane.showInputDialog(null, "Informe o número de camisetas vendidas do tamanho G:");
quantG = Integer.parseInt(quantG_s);

valorArrecadado = (quantP * valorP) + (quantM * valorM) + (quantG * valorG);
JOptionPane.showMessageDialog(null, "O valor arrecadado das vendas eh: " + valorArrecadado);

    }
    
}
