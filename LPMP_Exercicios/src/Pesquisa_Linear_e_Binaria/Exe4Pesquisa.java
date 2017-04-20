/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa_Linear_e_Binaria;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Gui Freitas
 */
public class Exe4Pesquisa {

    private int[] vetor;
    private static final Random gerador = new Random();

    public Exe4Pesquisa(int tamanho) {
        vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = 10 + gerador.nextInt(90);
        }

        Arrays.sort(vetor);
    }

    public int PesquisaBinaria(int elemento) {
        int baixo = 0;
        int alto = vetor.length - 1;
        int meio = (baixo + alto + 1) / 2;
        int local = -1; // -1 se não localizado

        do {
            //Imprime os elementos do vetor
            System.out.print(restanteVetor(baixo, alto));

            //se o elemento for localizado no meio
            if (elemento == vetor[meio]) {
                local = meio;
            } //se o elemento do meio é muito alto
            else if (elemento < vetor[meio]) {
                alto = meio - 1; //elemina a metade mais alta
            } else //elemento do meio é muito baixo
            {
                baixo = meio + 1;//elimina a metade mais alta
            }
            meio = (baixo + alto + 1) / 2;//recalcula o meio
        } while ((baixo <= alto) && (local == - 1));

        return local;//retorna a localização da chave de pesquisa
    }

    //metodo que gera a saida dos valores no vetor
    public String restanteVetor(int baixo, int alto) {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < baixo; i++) {
            temp.append(" ");
        }

        for (int i = baixo; i <= alto; i++) {
            temp.append(vetor[i] + " ");
        }

        temp.append("\n");
        return temp.toString();
    }

    //saida de valores
    public String toString() {
        return restanteVetor(0, vetor.length - 1);
    }

}
