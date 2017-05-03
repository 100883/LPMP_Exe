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
public class Produto {
    private int codigo;
    private String descricao;
    private float preco;
    private Produto proximo;
    
    public Produto(){
        
    }
    
    public Produto(int codigo, String desc, float preco, Produto proximo){
        this.codigo = codigo;
        this.descricao = desc;
        this.preco = preco;
        this.proximo = proximo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    

    @Override
    public String toString() {
        return String.format("%d - %s - R$ %.0f", codigo, descricao, preco);
    } 

    public Produto getProximo() {
        return proximo;
    }

    public void setProximo(Produto proximo) {
        this.proximo = proximo;
    }
    
}
