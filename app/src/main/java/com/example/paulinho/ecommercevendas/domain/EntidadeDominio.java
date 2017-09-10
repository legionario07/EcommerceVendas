package com.example.paulinho.ecommercevendas.domain;

import java.io.Serializable;

/**
 *
 * @author PauLinHo
 */
public class EntidadeDominio implements Serializable {
    
    private Long id;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
}
