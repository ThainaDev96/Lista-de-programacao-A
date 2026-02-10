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
public class exercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*25. Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do ano. Esqueça a 
questão dos anos bissextos e considere sempre que um mês possui 30 dias. */

String dia_s, mes_s;
int dia = 0, mes = 0, quantDias = 0, quantDias_totais;

dia_s = JOptionPane.showInputDialog(null, "Informe o dia:");
dia = Integer.parseInt(dia_s);

mes_s = JOptionPane.showInputDialog(null, "Informe o mês:");
mes = Integer.parseInt(mes_s);

quantDias = 30 * mes; 
quantDias_totais = quantDias - dia; 

JOptionPane.showMessageDialog(null, "A quantidade de dias que se passaram desde o início do ano até a data atual é: " + quantDias_totais);
}
}

