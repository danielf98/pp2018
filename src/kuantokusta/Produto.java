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
public class Produto {
   String nome;
   String marca;
   String modelo;
   int preco;
   int id;
   
   
   
   
   public Produto (String nome){
   this.nome = nome;
   
   }
   
   public String getNome(){
   return nome;
   }
   
   public int getPreco(){
   return preco;
   }
   public void setNome(String nome){
   this.nome = nome;
   }

}
