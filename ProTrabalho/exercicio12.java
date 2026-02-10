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
public class exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*12. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e 
dos impostos (aplicados ao custo de fábrica). Supondo que a porcentagem do distribuidor seja de 28% e os 
impostos de 45%, escrever um programa que leia o custo de fábrica de um carro e escreva o custo ao 
consumidor. */


String custo_fabrica_s;
float custo_fabrica = 0, comissao_distribuidor = 0.28f, impostos = 0.45f, soma = 0;

custo_fabrica_s = JOptionPane.showInputDialog(null, "Informe o custo de fábrica do carro:");
custo_fabrica = Float.parseFloat(custo_fabrica_s);

comissao_distribuidor = custo_fabrica * comissao_distribuidor;
impostos = custo_fabrica * impostos;

soma = custo_fabrica + comissao_distribuidor + impostos;

JOptionPane.showMessageDialog(null, "O custo final do carro para o consumidor é: R$ " + soma);
    }
}

    