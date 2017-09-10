package com.example.paulinho.ecommercevendas.domain;
import java.math.BigDecimal;

/**
 *
 * @author Paulo Dias <paulinho.legionario07@gmail.com>
 */
public class ItemPedido extends EntidadeDominio{
    
    private Integer quantidade;
    private BigDecimal valorItemPedido;
    private Produto produto;
    
    public ItemPedido(Long id){
        setId(id);
    }
    
    public ItemPedido(){
        valorItemPedido = new BigDecimal("0.0");
        produto = new Produto();
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorItemPedido() {
        return valorItemPedido;
    }

    public void setValorItemPedido(BigDecimal valorItemPedido) {
        this.valorItemPedido = valorItemPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
