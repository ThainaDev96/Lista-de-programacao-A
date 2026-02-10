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
public class exercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*20. Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados 
para um haras. */


String cavalos_s;
int cavalos = 0, quant_ferraduras;

cavalos_s = JOptionPane.showInputDialog(null, "Informe quantos cavalos foram comprados:");
cavalos = Integer.parseInt(cavalos_s);

quant_ferraduras = cavalos * 4;

JOptionPane.showMessageDialog(null, "Foram comprados " + cavalos + " cavalos. Serão necessárias " + quant_ferraduras + " ferraduras para equipar todos.");
    }
}

    

