/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa_Linear_e_Binaria;

import java.util.Scanner;

/**
 *
 * @author Gui Freitas
 */
public class Exe4PesquisaTeste {

    public static void main(String[] args) {
        Scanner mensagem = new Scanner(System.in);

        int pesquisa;//chave de pesquisa
        int posicao;//localização da chave de pesquisa no array

        Exe4Pesquisa pesquisaLista = new Exe4Pesquisa(10);
        System.out.println(pesquisaLista);

        //Obtem a entrada de usuario
        System.out.print("Entre com um numero inteiro(-1 para sair): ");
        pesquisa = mensagem.nextInt();
        System.out.println();

        while (pesquisa != -1) {
            posicao = pesquisaLista.PesquisaBinaria(pesquisa);

            if (posicao == -1)//inteiro nao foi localizado
            {
                System.out.println("O inteiro " + pesquisa + " não foi encontrato.\n");
            } else//inteiro foi localizado
            {
                System.out.println("O inteiro " + pesquisa + " foi encontrato na posição " + posicao + ".\n");
            }

            System.out.print("Entre com um numero inteiro(-1 para sair): ");
            pesquisa = mensagem.nextInt();
        }
    }

}
