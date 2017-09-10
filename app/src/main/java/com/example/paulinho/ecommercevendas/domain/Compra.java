package com.example.paulinho.ecommercevendas.domain;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Paulo Dias <paulinho.legionario07@gmail.com>
 */
public class Compra extends EntidadeDominio {
    
    private Date data;
    private BigDecimal valor;
    private List<ItemPedido> itens;

    public Compra(Long id){
        setId(id);
    }
    
    public Compra(){
        valor = new BigDecimal("0.0");
        itens = new ArrayList<>();
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
    
}
