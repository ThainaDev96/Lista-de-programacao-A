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
public class Questao6_Thaina_Ribeiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*6)Um funcionário recebe um salário fixo mais 8% de comissão sobre as vendas. Faça um programa que receba
        o salário fixo de um funcionário e o valor de suas vendas, calcule e mostre a comissão e o salário final do
        funcionário.*/
        
String salario_s, valorVendas_s,resposta_s;
float salario = 0, valor_vendas = 0, comissao = 0.08f, salario_final;
int resposta=1;

while(resposta ==1){
resposta_s = JOptionPane.showInputDialog(null, "informe 1 para para continuar ou 2 para encerrar ");
resposta = Integer.parseInt(resposta_s);

if(resposta==2)
    break;

salario_s = JOptionPane.showInputDialog(null, "Informe o salario fixo do funcionario:");
salario = Float.parseFloat(salario_s);

valorVendas_s = JOptionPane.showInputDialog(null, "Informe o valor das vendas do funcionario:");
valor_vendas = Float.parseFloat(valorVendas_s);

salario_final = salario + (comissao * valor_vendas);

JOptionPane.showMessageDialog(null, "O salario final do funcionario eh: R$ " + salario_final);
    }
    }
}

    


