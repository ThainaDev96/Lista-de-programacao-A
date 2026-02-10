
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @authorThainaRibeiroBairros
 */
public class ProTrabalho19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*19.Array Bidmensional implemente um jogo da velha,com as seguintes caracteristicas:
        A.O tabuleiro é formado por um array bidimensional, onde as posições são numeradas conforme 
        abaixo:   0|1|2
                  3|4|5
                  6|7|8
        B.Para jogar, os jogadores devem digitar o número correspondente ao quadro que desejam jogar.
        Caso o quadro esteja ocupado, ou o valor digitado pelo usuário não seja o número de 0 a 8, o 
        programa deve acusar a jogada inválida e pedir que o jogador digite novamente.
        
        2.O programa deve considerar dois jogadores(que podem ser nomeados jogadorX e jogadorO), 
        e utilizar dois símbolos distintos para representar a cada um deles.
        A. O programa deve perguntar alternadamente a próxima jogada, ou seja, primeiro pergunta
        a jogada do jogadorX, depois do jogadorO e assim sucessivamente.
        
        3.A cada nova jogada o programa deve mostrar o tabuleiro com a situação atual do jogo 
        (seja criativo).Por exemplo :
        
        4. O  --  --                      [O] []  []
           X  --  X             OU        [X] [X] []
           -- -- --                       []  []  []
        
        Dica:você pode usar os caracteres \t para gerar as tabulações tela de impressão, e o \n
        para gerar linhas em branco entre os tabuleiros.
        
        5.Se um dos jogadores ganhar, o sistema deve mostrar uma mensagem de vitória. Se houver empate,
        o programa deve emitir a respectiva mensagem "Parabéns! Meu amigo Charlie Brown". 
        
                
       */
        
      String[][] jogo_da_velha = new String[3][3];
        String jogador= "X";
        int quantJogadas = 0;
        int linha, coluna;
       //inicia o tabuleiro com espaços em branco
        for (int x = 0; x < jogo_da_velha.length; x++) {
            for (int y = 0; y < jogo_da_velha[x].length; y++) {
                jogo_da_velha[x][y] = " ";
            }
        }
        //loop para serem realizados nove jogadas
        while (quantJogadas < 9) {
   
            linha = Integer.parseInt(JOptionPane.showInputDialog(null, jogador + ", informe a linha "));
            coluna = Integer.parseInt(JOptionPane.showInputDialog(null, jogador + ", informe a coluna"));
                //verifica se a posição não está ocupada
                if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || !jogo_da_velha[linha][coluna].equals(" ")) {
                    JOptionPane.showMessageDialog(null, "Jogada inválida!");
                }
            
             // Marca a posição escolhida pelo jogador com o símbolo x ou o
            jogo_da_velha[linha][coluna] = jogador;
            quantJogadas++;

           //exibe o tabuleiro
            String tabuleiro = "";
            for (int x = 0; x < jogo_da_velha.length; x++) {
                for (int y = 0; y < jogo_da_velha[x].length; y++) {
                    tabuleiro += "[" + jogo_da_velha[x][y] + "]";
                }
            }

            // Verifica vitória
            boolean vencedor = true;
            for (int i = 0; i < 3; i++) {//linha
                if (jogo_da_velha[i][0].equals(jogador) && jogo_da_velha[i][1].equals(jogador) && jogo_da_velha[i][2].equals(jogador)) {
                    vencedor = false; // Se uma linha completa for do mesmo jogador.
    
                }
                if (jogo_da_velha[0][i].equals(jogador) && jogo_da_velha[1][i].equals(jogador) && jogo_da_velha[2][i].equals(jogador)) {
                    vencedor = false;// Se uma coluna completa for do mesmo jogador.
    
                }
            }//coluna
            if (jogo_da_velha[0][0].equals(jogador) && jogo_da_velha[1][1].equals(jogador) && jogo_da_velha[2][2].equals(jogador)) {
                vencedor = false;// Se a diagonal principal for do mesmo jogador.
            }
            if (jogo_da_velha[0][2].equals(jogador) && jogo_da_velha[1][1].equals(jogador) && jogo_da_velha[2][0].equals(jogador)) {
                vencedor = false;//Se a diagonal secundária for do mesmo jogador.
            }

            if (vencedor) {
                JOptionPane.showMessageDialog(null, "Jogador " + jogador + " venceu!");
            } else if (quantJogadas == 9) {
                JOptionPane.showMessageDialog(null, "Empate.Parabéns! Meu amigo Charlie Brown");
              
            }

            
        }
    }
}
        