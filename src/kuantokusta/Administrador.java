
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuantokusta;

/**
 *
 * @author user
 */
public class Administrador {
    private String nome;
    private String email;
    private String password;

    public Administrador (String nome, String email, String password){
    this.nome = nome;
    this.email = email;
    this.password = password;

    }

    public boolean autenticar() {
    if ( email == email && password == password){
        return true;
    }
    else {
        return false;
    }
    }

    public void setEmail (String email){
        this.email = email;
    }
    public void setPassword (String password){
        this.password = password;
    }

    public String getNome() {
    return nome;
    }

     public String getEmail() {
    return email;
    }

}
