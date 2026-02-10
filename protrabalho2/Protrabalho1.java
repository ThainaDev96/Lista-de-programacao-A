
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Protrabalho1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             
/*1.   Uma  certa empresa  fez uma pesquisa de mercado para saber se as pessoas gostaram de um novo produto 
lançado no mercado. Para isso, forneceu o sexo do entrevistado e sua resposta (S/N). 
Sabendo-se que foram entrevistadas 20 pessoas, fazer um algoritmo que calcule qual a porcentagem de mulheres e de
homens que gostaram do produto. */
        String[] vetor;
        vetor = new String[20];
        int i;
        int feminino = 0;
        int masculino = 0;

        // Entrada de dados
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = JOptionPane.showInputDialog(null, "Informe se você gostou do produto (S-sim N-nao)");
            String genero = JOptionPane.showInputDialog(null, "Informe seu gênero (F-feminino M-masculino)");

            // Contagem de mulheres e homens que gostaram do produto
            if (vetor[i].equalsIgnoreCase("S")) {
                if (genero.equalsIgnoreCase("F")) {
                    feminino++;
                } else if (genero.equalsIgnoreCase("M")) {
                    masculino++;
                }
            }
        }

        // Cálculo da porcentagem
        float porcentagemFeminino = (float) feminino / vetor.length * 100;
        float porcentagemMasculino = (float) masculino / vetor.length * 100;

        // Saída de dados
        System.out.println("Resultados da pesquisa:");
        System.out.println("Porcentagem de mulheres que gostaram do produto: " + porcentagemFeminino + "%");
        System.out.println("Porcentagem de homens que gostaram do produto: " + porcentagemMasculino + "%");
    }
}
