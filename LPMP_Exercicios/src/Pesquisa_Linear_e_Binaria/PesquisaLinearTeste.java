/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa_Linear_e_Binaria;

import java.util.Scanner;
import javax.swing.text.html.HTML;

/**
 *
 * @author ManaimTI
 */
public class PesquisaLinearTeste {

    public static void main(String[] args) {
        // cria o objeto Scanner para inserir dados
        Scanner mensagem = new Scanner(System.in);

        int pesquisa;//chave de pesquisa
        int posicao;//localização da chave de pesquisa no array

        PesquisaLinear pesquisaLista = new PesquisaLinear(10);
        System.out.println(pesquisaLista + "\n");

        //Obtem a entrada de usuario
        System.out.print("Entre com um numero inteiro(-1 para sair): ");
        pesquisa = mensagem.nextInt();

        while (pesquisa != -1) {
            posicao = pesquisaLista.PesquisaLinear(pesquisa);

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
