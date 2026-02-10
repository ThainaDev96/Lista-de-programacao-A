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
public class Exercicio2_pro_trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*2. Faça um programa que leia dois valores e calcula o resto da divisão do segundo pelo primeiro.*/
        
                
String n1_s,n2_s;
int nro1,nro2;
float restoDiv;

n1_s=JOptionPane.showInputDialog(null, "Informe o número 1:");
nro1=Integer.parseInt(n1_s);

n2_s=JOptionPane.showInputDialog(null, "Informe o número 2:");
nro2=Integer.parseInt(n2_s);

restoDiv= (float) nro2 % nro1;
JOptionPane.showMessageDialog(null, "O resto da divisao do segundo pelo primeiro eh:"+restoDiv);

    }
}
    

