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
public class Exercicio7_pro_trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*7. Crie um programa que leia 5 números inteiros e apresente a soma de todos os números lidos*/
    
String n1_s,n2_s,n3_s,n4_s,n5_s;
int nro1,nro2,nro3,nro4,nro5;
float soma;

n1_s=JOptionPane.showInputDialog(null, "Informe o numero 1:");
nro1=Integer.parseInt(n1_s);

n2_s=JOptionPane.showInputDialog(null, "Informe o numero 2:");
nro2=Integer.parseInt(n2_s);

n3_s=JOptionPane.showInputDialog(null, "Informe o numero 3:");
nro3=Integer.parseInt(n3_s);

n4_s=JOptionPane.showInputDialog(null, "Informe o numero 4:");
nro4=Integer.parseInt(n3_s);

n5_s=JOptionPane.showInputDialog(null, "Informe o numero 5:");
nro5=Integer.parseInt(n3_s);
    
soma = nro1+nro2+nro3+nro4+nro5;

JOptionPane.showMessageDialog(null, "O resultado da soma eh: " + soma);
    
    }
    
}
