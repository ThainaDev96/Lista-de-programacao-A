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
public class exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*14. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por 
ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
informar o seu nome, o salário fixo e salário no final do mês. */

String nome;
String salario_s, totalVendas_s;
float salario = 0, total_vendas = 0, comissao = 0.15f, salario_final;

nome = JOptionPane.showInputDialog(null, "Informe o seu nome:");

salario_s = JOptionPane.showInputDialog(null, "Informe o seu salario fixo:");
salario = Float.parseFloat(salario_s);

totalVendas_s = JOptionPane.showInputDialog(null, "Informe o valor em dinheiro das vendas:");
total_vendas = Float.parseFloat(totalVendas_s);

salario_final = salario + (comissao * total_vendas);

JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSalário Fixo: R$ " + salario + "\nSalário Final: R$ " + salario_final);
    }
}

