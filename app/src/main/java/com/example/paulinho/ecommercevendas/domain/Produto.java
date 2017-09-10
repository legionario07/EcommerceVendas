package com.example.paulinho.ecommercevendas.domain;

import java.math.BigDecimal;

/**
 *
 * @author Paulo Dias <paulinho.legionario07@gmail.com>
 */
public class Produto extends EntidadeDominio{
    
    private BigDecimal valorCompra;
    private BigDecimal valorVenda;
    private String descricao;
    private Categoria categoria;
    private Taxa taxa;

    public Produto(){
        categoria = new Categoria();
        valorCompra = new BigDecimal("0.0");
        valorVenda = new BigDecimal("0.0");
        taxa = new Taxa();
    }
    
    public Produto(Long id){
        this.setId(id);
    }
    
    
    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }
    

    public Taxa getTaxa() {
        return taxa;
    }

    public void setTaxa(Taxa taxa) {
        this.taxa = taxa;
    }
    
          @Override
    public String toString() {
       return descricao;
    }
    
}
