/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provathainaribeiro;

import static javafx.scene.input.KeyCode.S;
import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Questao1_Thaina_Ribeiro_Bairros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*1) Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida
        respectivamente por 25, 35 e 45 reais. Construa um algoritmo em que o usuário forneça a quantidade de
        camisetas pequenas, médias e grandes referentes a uma venda, e a máquina informe quanto será o valor
        arrecadado. Implementar com while para solicitar para usuário se ele quer continuar*/
        
String quantP_s, quantM_s, quantG_s,resposta_s;
int quantP = 0, quantM = 0, quantG = 0;
float valorP = 0.25f, valorM = 0.35f, valorG = 0.45f;
float valorArrecadado;
int resposta = 1;



while(resposta ==1 ){
resposta_s = JOptionPane.showInputDialog(null, "informe 1 para continuar ou 2 para encerrar ");
resposta = Integer.parseInt(resposta_s);

if(resposta==2)
    break;

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
    }



    


