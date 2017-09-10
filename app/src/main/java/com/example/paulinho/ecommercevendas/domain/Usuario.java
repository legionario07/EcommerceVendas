package com.example.paulinho.ecommercevendas.domain;

/**
 *
 * @author Paulo Dias <paulinho.legionario07@gmail.com>
 */
public class Usuario extends EntidadeDominio{

    private String nome;
    private String login;
    private String senha;
    private Perfil perfil;

    public Usuario(Long id){
        setId(id);
    }
    
    public Usuario(){
        this.perfil = new Perfil();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}

