/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String [][] frases = new String [5];//array vetor
        //String [][] tabela = new String [5] [15];//array matrizes
       

//solicitar ao usuario a posicao de armazenamento do x
//valide se a posição armazenada ja foi ocupada.
        String [][]jogo_da_velha = new String [3][3];
        System.out.println("Tamanho da Matriz"+jogo_da_velha.length);
        int linha=0;
        int coluna=0;
                
         for( int x = 0; x<jogo_da_velha.length; x++){//entrada de dados
              for(int y = 0; y< jogo_da_velha.length; y++){
                  
                  linha = Integer.parseInt(JOptionPane.showInputDialog(null,"insira a linha"));
                  coluna = Integer.parseInt(JOptionPane.showInputDialog(null,"insira a coluna "));
                  jogo_da_velha [linha][coluna] = (JOptionPane.showInputDialog(null,"informe o x"));
              }
         }
                  
              
              //processamento
        for(int x = 0 ; x < jogo_da_velha.length ; x++){
            for(int y = 0; y< jogo_da_velha.length; y++){
                System.out.println("x = "+ x+ " y = " + y);
           
                    jogo_da_velha [x][y] = "x";   
                    
        }//validacao
            
        for(int x = 0 ; x < jogo_da_velha.length ; x++){
            for(int y = 0; y< jogo_da_velha.length; y++){
               while(linha > jogo_da_velha.length ){
                          System.out.println("Essa posicao esta ocupada");
                          
               while(coluna > jogo_da_velha.length ){
                        System.out.println("Essa posicao esta ocupada");
                      }
                      }
            }
        }
            
            
    }//saida de dados
     for(int x = 0 ; x < jogo_da_velha.length ; x++){
            for(int y = 0; y< jogo_da_velha.length; y++){
                System.out.println("x = "+ x+ " y = " + y);
                    System.out.println("o valor armazenado    "+jogo_da_velha[x][y]);
                    
                    
        }
     }
    }
}
        
    
    

