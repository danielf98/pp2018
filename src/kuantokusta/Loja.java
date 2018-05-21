/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuantokusta;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Loja {
    public static ArrayList <Produto> lista_produtos;
    private String nome;
    private String email;
    private String pass;
    public int cliques;
    public int cliquesDisponiveis;
    
    
 public Loja (String nome,String email,String pass){
 this.nome = nome;
 this.email = email;
 this.pass = pass;
 lista_produtos = new ArrayList();
 
 }
 
 public String novoProduto(Produto p,int preco){
    String s = "";
    p.preco = preco;
    lista_produtos.add(p);
    return s;
     
 }
 public void aumentarCliques(){
     this.cliques = cliques + 1;
 }
 public void cliquesDisponiveis(int extra){
 this.cliquesDisponiveis = cliquesDisponiveis + extra;
 }
 
}
