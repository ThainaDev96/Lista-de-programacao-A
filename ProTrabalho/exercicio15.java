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
public class exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*15. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em 
dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares 
disponíveis com o usuário.*/

String valorCotacao_s, quantDolares_s;
float valorCotacao = 0, quantDolares = 0, valorReais;

valorCotacao_s = JOptionPane.showInputDialog(null, "Informe o valor da cotação:");
valorCotacao = Float.parseFloat(valorCotacao_s);

quantDolares_s = JOptionPane.showInputDialog(null, "Informe a quantidade de dólares que você possui:");
quantDolares = Float.parseFloat(quantDolares_s);

valorReais = valorCotacao * quantDolares;
JOptionPane.showMessageDialog(null, "A conversão de dólares para reais é: R$" + valorReais);

    }
    
}
