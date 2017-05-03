/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaLista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Gui Freitas
 */
public class Lista2 {

    public static void main(String[] args) {
        String arquivo = "C:\\Users\\ManaimTI\\Documents\\Lista\\produto.csv";
        Produto prod[] = new Produto[20];
        lerProduto(prod, arquivo);
        insercao(prod);
        imprimir(prod);
        remove(prod, arquivo);
    }

    public static void lerProduto(Produto lista[], String arq) {
        try {
            FileReader fr = new FileReader(arq);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            int i = 0;
            while ((linha = br.readLine()) != null) {
                String[] dados;
                dados = linha.split(";");
                Produto obj = new Produto();
                obj.setCodigo(Integer.parseInt(dados[0]));
                obj.setDescricao(dados[1]);
                obj.setPreco(Float.parseFloat(dados[2]));
                lista[i] = obj;
                i++;
            }

        } catch (Exception e) {
            System.out.println("Erro ao abrir o arquivo!");
        }
    }

    //ordena pelo método da inserção direta
    public static void insercao(Produto vet[]) {
        int i;
        Produto aux;
        for (int j = 1; j < vet.length; j++) {
            aux = vet[j];
            i = j - 1;
            while (i >= 0 && vet[i].getDescricao().compareToIgnoreCase(aux.getDescricao()) > 0) {
                vet[i + 1] = vet[i];
                i--;
            }
            vet[i + 1] = aux;
        }
    }

    public static void imprimir(Produto a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void remove(Produto lista[], String arq) {
        try {
            
            System.out.println("Teste");

        } catch (Exception e) {
            System.out.println("Erro ao abrir o arquivo!");
        }
    }

}
