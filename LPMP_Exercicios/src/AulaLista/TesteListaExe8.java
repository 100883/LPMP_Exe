/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaLista;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gui Freitas
 */
public class TesteListaExe8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Lista lista = new Lista();
        
        Produto prod;
        int cod;
        String desc;
        float preco;

        for (int i = 0; i < 2; i++) {
            System.out.println("Codigo: ");
            cod = entrada.nextInt();
            System.out.println("Descrição: ");
            desc = entrada.next();
            System.out.println("Preço: ");
            preco = entrada.nextFloat();
            prod = new Produto(cod, desc, preco, null);
            lista.addOrdenado(prod);
        }
        lista.mostraLista();
        System.out.println("Digite o Produto a ser removido");
        int codigo = entrada.nextInt();
        prod = lista.remove(codigo);
        if (prod == null) {
            System.out.println("Produto com codigo " + codigo + " não existe na lista");
        } else {
            System.out.println("Dados do produto removdo: " + prod);
        }
        lista.mostraLista();

    }
}
