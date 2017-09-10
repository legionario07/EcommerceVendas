package com.example.paulinho.ecommercevendas.domain;
/**
 *
 * @author Paulo Dias <paulinho.legionario07@gmail.com>
 */
public class Perfil extends EntidadeDominio{
    
    
    private String perfil;
    
    public Perfil(Long id){
        setId(id);
    }

    public Perfil(){
        
    }
    
    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return perfil;
    }
    
    
    
}
