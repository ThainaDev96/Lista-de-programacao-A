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
public class exercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*16. Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. 
Considere fixo o juro da poupança em 0,70% a. m. */

String valorDepositado_s;
float valorDepositado = 0, rendimento = 0 , valorTotal=0;

valorDepositado_s = JOptionPane.showInputDialog(null, "Informe o valor depositado:");
valorDepositado = Float.parseFloat(valorDepositado_s);

rendimento = (float) (valorDepositado * (0.70 / 100));
valorTotal = valorDepositado + rendimento;

JOptionPane.showMessageDialog(null, "O valor com rendimento após um mês é de: R$ " + valorTotal);
    }
    
}
