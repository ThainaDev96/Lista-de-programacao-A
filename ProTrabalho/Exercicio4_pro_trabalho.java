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
public class Exercicio4_pro_trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        /*4. Leia três notas de um aluno e calcule sua média aritmética.*/
        
String n1_s,n2_s,n3_s;
int nota1,nota2,nota3;
float media = 0,soma = 0;

n1_s=JOptionPane.showInputDialog(null, "Informe a nota número 1:");
nota1=Integer.parseInt(n1_s);

n2_s=JOptionPane.showInputDialog(null, "Informe a nota número 2:");
nota2=Integer.parseInt(n2_s);

n3_s=JOptionPane.showInputDialog(null, "Informe a nota numero 3:");
nota3=Integer.parseInt(n3_s);

soma = (nota1+nota2+nota3);
media = soma/3;

JOptionPane.showMessageDialog(null, "Sua media eh: " + media );
    }
    
}
