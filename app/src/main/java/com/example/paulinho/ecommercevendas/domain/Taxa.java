package com.example.paulinho.ecommercevendas.domain;
/**
 *
 * @author Paulo Dias <paulinho.legionario07@gmail.com>
 */
public class Taxa extends EntidadeDominio {

    private String descricao;
    private Double taxa;

    public Taxa(){
    }
    
    public Taxa(Long id){
        setId(id);
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
