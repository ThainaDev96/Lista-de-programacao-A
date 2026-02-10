/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provathainaribeirobairros;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Questao2_Thaina_Ribeiro_Bairros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*2)Uma fábrica controla o tempo de trabalho sem acidentes pela quantidade de dias. Faça um algoritmo para
        converter este tempo em anos, meses e dias. Assuma que cada mês possui sempre 28 dias.*/
        
String quantDias_s,resposta_s;
int quantDias = 0, anos = 0, meses = 0, diasRestantes = 0;
int resposta = 1;


while(resposta ==1){
resposta_s = JOptionPane.showInputDialog(null, "informe 1 para continuar ou 2 para encerrar ");
resposta = Integer.parseInt(resposta_s);

if(resposta==2)
    break;

quantDias_s = JOptionPane.showInputDialog(null, "Informe a quantidade de dias sem acidentes:");
quantDias = Integer.parseInt(quantDias_s);

anos = quantDias / 365;  
diasRestantes = quantDias % 365;

meses = diasRestantes / 28;  
diasRestantes = diasRestantes % 28;

JOptionPane.showMessageDialog(null, "Anos: " + anos);
JOptionPane.showMessageDialog(null, "Meses: " + meses);
JOptionPane.showMessageDialog(null, "Dias: " + diasRestantes);
    }
    }
}


        
 
