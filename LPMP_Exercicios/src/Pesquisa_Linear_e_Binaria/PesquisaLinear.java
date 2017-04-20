/*
4. implementar os métodos de busca binária e sequencial,	 mostrando a 
quantidade de comparações utilizadas para encontrar um dado elemento.
 */
package Pesquisa_Linear_e_Binaria;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Gui Freitas
 */
public class PesquisaLinear {

    private int[] vetor;
    private static final Random gerador = new Random();

    public PesquisaLinear(int tamanho) {
        vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++)
            vetor[i] = 10 + gerador.nextInt(90);
        }
    

    public int PesquisaLinear(int chave) {
        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] == chave) {
                return indice;
            }
        }

        return -1;
    }

    public String toString() {
        return Arrays.toString(vetor);
    }

}
