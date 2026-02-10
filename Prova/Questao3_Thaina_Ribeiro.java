/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provathainaribeiro;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiro
 */
public class Questao3_Thaina_Ribeiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*3)Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 25%. Após o aumento, desconte 8%
        de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.*/
        
        
String salario_s, aumento_s, desconto_s,resposta_s;
float salario_inicial = 0, aumento = 0.25f, desconto =0.08f, salario_aumento = 0, salario_final = 0;
int resposta=1;

while(resposta ==1){
resposta_s = JOptionPane.showInputDialog(null, "informe 1 para para continuar ou 2 para encerrar ");
resposta = Integer.parseInt(resposta_s);

if(resposta==2)
    break;

salario_s = JOptionPane.showInputDialog(null, "Informe seu salário:");
salario_inicial = Float.parseFloat(salario_s);


aumento = salario_inicial * aumento;
salario_aumento = salario_inicial + aumento;

desconto = salario_aumento * desconto;
salario_final = salario_aumento - desconto;


JOptionPane.showMessageDialog(null, "O salário inicial é de : " + salario_inicial);
JOptionPane.showMessageDialog(null, "O salário com aumento é: " + salario_aumento);
JOptionPane.showMessageDialog(null, "O salário final é: " + salario_final);
    }
    }
}




   



