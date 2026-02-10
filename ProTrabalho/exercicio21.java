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
public class exercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*21. A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada 
pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a 
venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado). 
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as 
quantidades de pães e de broas, e depois calcular os dados solicitados. */

String qtdePao_s, qtdeBroa_s;
int quantPao,quantBroa;
float vTotal=0,poupanca=0;

qtdePao_s=JOptionPane.showInputDialog(null, "Informe a quantidade de paes:");
quantPao=Integer.parseInt(qtdePao_s);

qtdeBroa_s=JOptionPane.showInputDialog(null, "Informe a quantidade de broas:");
quantBroa=Integer.parseInt(qtdeBroa_s);


 vTotal = (quantPao* 0.12f)+(quantBroa * 1.50f);
 JOptionPane.showMessageDialog(null, "O valor arrecadado de paes e broas eh: " + vTotal);

poupanca = (float) (vTotal * 0.10f);
JOptionPane.showMessageDialog(null, "O valor arrecadado para poupanca eh : " + poupanca);
}
}
    
