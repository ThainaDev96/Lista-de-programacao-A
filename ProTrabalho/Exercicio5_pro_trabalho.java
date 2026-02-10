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
public class Exercicio5_pro_trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*5. Faça um programa que leia dois valores do tipo float e calcule +, -, *, / e o %.  */ 
        
        String valor1_s,valor2_s,escolha_s;
        float valor1=0,valor2=0,resultado=0;
        int escolha=0;
        
        valor1_s = JOptionPane.showInputDialog(null, "informe o valor 1");
        valor1 = Float.parseFloat(valor1_s);
        
        valor2_s =JOptionPane.showInputDialog(null, "informe o valor 2");
        valor2 = Float.parseFloat(valor2_s);
        escolha_s= JOptionPane.showInputDialog(null,"1 = soma, 2 = subtracao,3 = multiplicacao,4 = resto da divisao");
        escolha= Integer.parseInt(escolha_s);
        
        if (escolha==1)
        {
            resultado = (valor1 + valor2);
        }
        if (escolha==2)
        {
            resultado = (valor1 - valor2);
        }
        
        if (escolha==3)
        {
            resultado = (valor1 * valor2);
        }
        if (escolha==4)
        {
            resultado = (valor1 % valor2);
        }
    
        JOptionPane.showMessageDialog(null,"o total = "+resultado);
        System.out.println("o resultado eh: "+ resultado);
    
    }

    }
    


