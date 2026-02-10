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
public class exercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*23. Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o preço do litro 
da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no tanque. */

String valor_reais_s, precoGasolina_s;
float valor_reais = 0, precoGasolina = 0, quantLitros = 0;

valor_reais_s = JOptionPane.showInputDialog(null, "Informe o quanto você tem de dinheiro para por de gasolina:");
valor_reais = Float.parseFloat(valor_reais_s);

precoGasolina_s = JOptionPane.showInputDialog(null, "Informe o valor em reais da gasolina:");
precoGasolina = Float.parseFloat(precoGasolina_s);

quantLitros = valor_reais / precoGasolina;

JOptionPane.showMessageDialog(null, "A quantidade em litros colocados no seu tanque é: " + quantLitros);
}
}

    
