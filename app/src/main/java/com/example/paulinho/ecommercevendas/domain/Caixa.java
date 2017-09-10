
package com.example.paulinho.ecommercevendas.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paulo Dias <paulinho.legionario07@gmail.com>
 */
public class Caixa extends EntidadeDominio{
    
    private BigDecimal valor;
    private List<Compra> compras;
    private List<Venda> vendas;
    private List<Entrada> entradas;
    private List<Retirada> retiradas;

    public Caixa(Long id){
        setId(id);
    }
    
    public Caixa(){
        this.valor = new BigDecimal("0.0");
        compras = new ArrayList<>();
        vendas = new ArrayList<>();
        entradas = new ArrayList<>();
        retiradas = new ArrayList<>();
    }
    
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }


    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public List<Retirada> getRetiradas() {
        return retiradas;
    }

    public void setRetiradas(List<Retirada> retiradas) {
        this.retiradas = retiradas;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
    
}
