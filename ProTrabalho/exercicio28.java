/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_pro_trabalho;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiro
 */
public class exercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*28. Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 15%. Após o aumento, desconte 8% 
de impostos. Imprima o salário inicial, o salário com o aumento e o salário final. */

String salario_s, aumento_s, desconto_s;
float salario_inicial = 0, aumento = 0, desconto = 0, salario_aumento = 0, salario_final = 0;

salario_s = JOptionPane.showInputDialog(null, "Informe seu salário:");
salario_inicial = Float.parseFloat(salario_s);

aumento_s = JOptionPane.showInputDialog(null, "Informe quantos porcentos irá aumentar seu salário:");
aumento = Float.parseFloat(aumento_s);

desconto_s = JOptionPane.showInputDialog(null, "Informe os descontos do salário:");
desconto = Float.parseFloat(desconto_s);

aumento = salario_inicial * (aumento / 100);
salario_aumento = salario_inicial + aumento;

desconto = salario_aumento * (desconto / 100);
salario_final = salario_aumento - desconto;


JOptionPane.showMessageDialog(null, "O salário inicial é de : " + salario_inicial);
JOptionPane.showMessageDialog(null, "O salário com aumento é: " + salario_aumento);
JOptionPane.showMessageDialog(null, "O salário final é: " + salario_final);
    }
}




    
