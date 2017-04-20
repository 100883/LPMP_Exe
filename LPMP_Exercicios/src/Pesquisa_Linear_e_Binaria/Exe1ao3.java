/*
1. Criar um vetor com 100000 números inteiros aleatórios no intervalo de 0 até 1000000.
2. Ordenar o vetor do item 1(vetor com os elementos repetidos).
3. Criar um outro vetor com os elementos do vetor anterior eliminando os elementos repetidos.

 */
package Pesquisa_Linear_e_Binaria;

import java.util.Random;

/**
 *
 * @author Gui Freitas
 */
public class Exe1ao3 {

    public static void main(String[] args) {
        
        /*EXE1<<<<<<<<<<<<<<<*/
        int numero[] = new int[10];

        Random gerador = new Random();

        for (int i = 0; i < numero.length; i++) {
            numero[i] = gerador.nextInt(100);
        }
        
        /*EXE2<<<<<<<<<<<<<<<*/
        int aux;
        for (int i = numero.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numero[j] > numero[j + 1]) {
                    aux = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = aux;
                }

            }
        }

        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }

        System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++++++\n\n");

        /*EXE3<<<<<<<<<<<<<<<*/
        int[] vet2 = new int[numero.length];

        int qtd = 0;
        for (int i = 0; i < numero.length; i++) {
            boolean existe = false;
            for (int j = 0; j < qtd; j++) {
                if (vet2[j] == numero[i]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                vet2[qtd++] = numero[i];
            }
        }

        for (int i = 0; i < vet2.length; i++) {
            System.out.println(vet2[i]);
        }
    }

}

