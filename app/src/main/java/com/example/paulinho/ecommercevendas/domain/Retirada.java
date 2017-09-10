package com.example.paulinho.ecommercevendas.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Dias <paulinho.legionario07@gmail.com>
 */
public class Retirada extends EntidadeDominio {
    
    private BigDecimal valor;
    private Date data;
    private String descricao;
    private Usuario usuario;
    
    public Retirada(Long id){
        setId(id);
    }
    
    public Retirada(){
        this.valor = new BigDecimal("0.0");
        this.usuario = new Usuario();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}