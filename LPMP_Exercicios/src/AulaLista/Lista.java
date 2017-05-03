/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaLista;

/**
 *
 * @author Gui Freitas
 */
public class Lista {

    private Produto primeiro;
    private Produto ultimo;

    public Lista() {
        primeiro = null;
        ultimo = null;
    }

    public boolean eVazia() {
        return primeiro == null;
    }

    //insere objeto Produto no inicio da lista
    public void addInicio(Produto ob) {
        //é primeiro?
        ob.setProximo(null);
        if (eVazia()) {
            primeiro = ob;
            ultimo = ob;
        } else {
            ob.setProximo(primeiro);
            primeiro = ob;
        }
    }

    //insere objeto Produto no fim da lista
    public void addFim(Produto ob) {
        //é primeiro?
        ob.setProximo(null);
        if (eVazia()) {
            primeiro = ob;
            ultimo = ob;
        } else {
            ultimo.setProximo(ob);
            ultimo = ob;
        }
    }

    //insere ordenado
    public void addOrdenado(Produto ob) {
        ob.setProximo(null);
        if (eVazia()) {
            addInicio(ob);
            return;
        }
        //na lista tem elementos
        Produto ant = null;
        Produto atual = primeiro;
        while (atual != null && atual.getCodigo()< ob.getCodigo()) {
            ant = atual;
            atual = atual.getProximo();
        }
        //insere no inicio da lista
        if (ant == null) {
            addInicio(ob);
            return;
        }
        //insere no inicio da lista
        if (atual == null) {
            addFim(ob);
            return;
        }
        //inser no meio
        ant.setProximo(ob);
        ob.setProximo(atual);
    }

    //remove no inicio da lista
    public Produto remInicio(int cod) {
        if (eVazia()) {
            return null;
        }
        Produto retorno = primeiro;
        primeiro = primeiro.getProximo();
        retorno.setProximo(null);
        if (primeiro == null) {
            ultimo = null;
        }
        return retorno;
    }
    //remove no inicio da lista

    public Produto remove(int cod) {
        if (eVazia()) {
            return null;
        }
        Produto retorno = primeiro;
        Produto aux = null;
        while (retorno != null && retorno.getCodigo()!= cod) {
            aux = retorno;
            retorno = retorno.getProximo();
        }
        if (retorno == null) {
            return null;
        }
        if (retorno == primeiro) {
            retorno = remInicio(cod);
            return retorno;
        }
        aux.setProximo(retorno.getProximo());
        if (retorno == ultimo) {
            ultimo = aux;
        }
        retorno.setProximo(null);
        return retorno;

    }

    //mostra a lista
    public void mostraLista() {
        if (eVazia()) {
            System.out.println("Não existe elemento na lista");
            return;
        }
        System.out.println("Elementos da lista");
        Produto aux = primeiro;
        while (aux != null) {
            System.out.println(aux);
            aux = aux.getProximo();
        }
    }
}
