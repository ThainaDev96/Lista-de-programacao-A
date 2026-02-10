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
public class exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*10. Faça um programa que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a
média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente. */

String n1_s, n2_s, n3_s;
int nota1, nota2, nota3;
float media, somaProduto = 0, peso1 = 2, peso2 = 3, peso3 = 5;

n1_s = JOptionPane.showInputDialog(null, "Informe a nota número 1:");
nota1 = Integer.parseInt(n1_s);

n2_s = JOptionPane.showInputDialog(null, "Informe a nota número 2:");
nota2 = Integer.parseInt(n2_s);

n3_s = JOptionPane.showInputDialog(null, "Informe a nota número 3:");
nota3 = Integer.parseInt(n3_s);

somaProduto = (peso1 * nota1) + (peso2 * nota2) + (peso3 * nota3);
media = somaProduto / (peso1 + peso2 + peso3);

JOptionPane.showMessageDialog(null, "Sua média é: " + media);
    }
}

  

