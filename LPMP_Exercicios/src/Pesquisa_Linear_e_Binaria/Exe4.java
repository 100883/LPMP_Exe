/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa_Linear_e_Binaria;

import java.util.Random;

/**
 *
 * @author Gui Freitas
 */
public class Exe4 {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10);
        }
        ordena(vetor);

        int numAleatorio = random.nextInt(10);
        System.out.println("\n\nNúmero selecionado: " + numAleatorio + "\n");

        int compLinear = pesquisaLinear(vetor, numAleatorio);
        int compBinaria = pesquisaBinaria(vetor, numAleatorio);

        System.out.println("comparações da Pesquisa Linear = " + compLinear);
        System.out.println("comparações da Pesquisa Binaria = " + compBinaria);
    }

    private static void ordena(int[] vetor) {
        int aux;
        for (int i = vetor.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "] ");
        }
    }

    public static int pesquisaLinear(int[] vetor, int elemento) {
        int comp = 0;

        for (int indice = 0; indice < vetor.length; indice++) {
            comp++;
            if (vetor[indice] == elemento) {
                return comp;
            }
        }

        return comp;
    }

    public static int pesquisaBinaria(int vetor[], int elemento) {
        int baixo = 0;
        int alto = vetor.length - 1;
        int meio = (baixo + alto + 1) / 2;
        int local = -1; // -1 se não localizado
        int comp = 0;

        do {
            comp++;
            //se o elemento for localizado no meio
            if (elemento == vetor[meio]) {
                local = meio;
                return comp++;
            } //se o elemento do meio é muito alto
            else if (elemento < vetor[meio]) {
                comp++;
                alto = meio - 1; //elemina a metade mais alta
            } else //elemento do meio é muito baixo
            {
                baixo = meio + 1;//elimina a metade mais alta
            }
            meio = (baixo + alto + 1) / 2;//recalcula o meio
        } while ((baixo <= alto) && (local == - 1));

        return comp++;
    }

}
