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
public class exercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*19. A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as dimensões de um 
terreno e depois exibir a área do terreno. */

String largura_s, comprimento_s;
float largura =0 , comprimento = 0, area = 0;

largura_s = JOptionPane.showInputDialog(null, "Informe a largura do terreno (em metros):");
largura = Float.parseFloat(largura_s);

comprimento_s = JOptionPane.showInputDialog(null, "Informe o comprimento do terreno (em metros):");
comprimento = Float.parseFloat(comprimento_s);

if (largura >= 0 && comprimento >= 0) {
area = largura * comprimento;
 } else {
       JOptionPane.showMessageDialog(null, "As dimensões nao sao validas para um terreno retangular.");
        }
JOptionPane.showMessageDialog(null, "A area do terreno eh: " + area + " metros quadrados.");
    }
}

    

