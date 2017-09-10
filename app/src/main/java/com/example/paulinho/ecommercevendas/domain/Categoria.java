
package com.example.paulinho.ecommercevendas.domain;

/**
 *
 * @author Paulo Dias <paulinho.legionario07@gmail.com>
 */
public class Categoria extends EntidadeDominio {
    
    private String categoria;
    
    public Categoria(Long id){
        setId(id);
    }
    
    public Categoria(){
        
    }
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return categoria;
    }
    
    
    
}
