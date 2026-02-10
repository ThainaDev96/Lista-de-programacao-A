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
public class exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*13. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total
percorrida pelo automóvel e o total de combustível gasto.*/

String distanciaPercorrida_s, combustivelGasto_s;
float distanciaPercorrida, combustivelGasto, consumoMedio;

distanciaPercorrida_s = JOptionPane.showInputDialog(null, "Informe a distância percorrida em km:");
distanciaPercorrida = Float.parseFloat(distanciaPercorrida_s);

combustivelGasto_s = JOptionPane.showInputDialog(null, "Informe o combustível gasto em litros:");
combustivelGasto = Float.parseFloat(combustivelGasto_s);

consumoMedio = distanciaPercorrida / combustivelGasto;

JOptionPane.showMessageDialog(null, "O consumo médio do automóvel é de " + consumoMedio + " km/l.");
    }
}

  
