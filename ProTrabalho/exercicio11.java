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
public class exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*11. Faça um programa que leia o tempo de duração de um evento em uma fábrica expressa em segundos e 
mostre-o expresso em horas, minutos e segundos.*/

String tempoSegundos_s;
int tempoS;
int tempoHoras, tempoMinutos, tempoSegundos;

tempoSegundos_s = JOptionPane.showInputDialog(null, "Informe o tempo em segundos:");
tempoS = Integer.parseInt(tempoSegundos_s);

tempoHoras = tempoS / 3600;
tempoMinutos = (tempoS % 3600) / 60;
tempoSegundos = (tempoS % 3600) % 60;

JOptionPane.showMessageDialog(null, "Tempo total: " + tempoHoras + " horas, " + tempoMinutos + " minutos e " + tempoSegundos + " segundos.");
    }
}

    
