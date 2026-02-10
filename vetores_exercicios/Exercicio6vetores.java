/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Exercicio6vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     /*6) Faça um programa que calcule o produto escalar de dois vetores de double, isto
     é,  multiplique  cada  elemento  pelo  seu  respectivo  no  outro  vetor  e  some  os
     resultados.*///produto escalar é a multiplicação dos elementos
     
    // Definindo os vetores de double
        double[] vetor1 = { 1.5, 2.0, 3.5, };
        double[] vetor2 = { 0.5, 2.0, 1.0, };

        //0.0 + (1.5 * 0.5) = 0.75
        //0.75 + (2.0 * 2.0) = 4.75
        //4.75 + (3.5 * 1.0) = 8.25 (resultado final)
        // Verificando se os vetores têm o mesmo tamanho
        if (vetor1.length != vetor2.length) {
            System.out.println("Os vetores têm tamanhos diferentes. Produto escalar não pode ser calculado.");
            return;
        }

        // Calculando o produto escalar
        double produtoEscalar = 0.0;//variavel
        for (int i = 0; i < vetor1.length; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
//Cada iteração do loop, o produto dos elementos vetor1[i] e vetor2[i] é calculado e adicionado ao produtoEscalar
        }

        // Exibindo o resultado
        System.out.println("Produto Escalar dos vetores:"+produtoEscalar);
        
    }
}

        
    
    
