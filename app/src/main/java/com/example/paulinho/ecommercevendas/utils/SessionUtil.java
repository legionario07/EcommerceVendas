package com.example.paulinho.ecommercevendas.utils;

import com.example.paulinho.ecommercevendas.domain.EntidadeDominio;
import com.example.paulinho.ecommercevendas.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PauLinHo on 10/09/2017.
 */

public class SessionUtil {

    private static SessionUtil instance = new SessionUtil();
    private Usuario usuario;
    private List<EntidadeDominio> produtos;
    private List<EntidadeDominio> categorias;
    private List<EntidadeDominio> compras;
    private List<EntidadeDominio> entradas;
    private List<EntidadeDominio> retiradas;
    private List<EntidadeDominio> taxas;
    private List<EntidadeDominio> vendas;

    private SessionUtil() {

        usuario = new Usuario();
        produtos = new ArrayList<>();
        categorias = new ArrayList<>();
        compras = new ArrayList<>();
        entradas = new ArrayList<>();
        retiradas = new ArrayList<>();
        taxas = new ArrayList<>();
        vendas = new ArrayList<>();
        
        
    }

    public static SessionUtil getInstance() {
        return instance;
    }


    public void clear(){
        usuario = new Usuario();
        produtos.clear();
        categorias.clear();
        compras.clear();
        entradas.clear();
        retiradas.clear();
        taxas.clear();
        vendas.clear();
                
    }

    public static void setInstance(SessionUtil instance) {
        SessionUtil.instance = instance;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<EntidadeDominio> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<EntidadeDominio> produtos) {
        this.produtos = produtos;
    }

    public List<EntidadeDominio> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<EntidadeDominio> categorias) {
        this.categorias = categorias;
    }

    public List<EntidadeDominio> getCompras() {
        return compras;
    }

    public void setCompras(List<EntidadeDominio> compras) {
        this.compras = compras;
    }

    public List<EntidadeDominio> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<EntidadeDominio> entradas) {
        this.entradas = entradas;
    }

    public List<EntidadeDominio> getRetiradas() {
        return retiradas;
    }

    public void setRetiradas(List<EntidadeDominio> retiradas) {
        this.retiradas = retiradas;
    }

    public List<EntidadeDominio> getTaxas() {
        return taxas;
    }

    public void setTaxas(List<EntidadeDominio> taxas) {
        this.taxas = taxas;
    }

    public List<EntidadeDominio> getVendas() {
        return vendas;
    }

    public void setVendas(List<EntidadeDominio> vendas) {
        this.vendas = vendas;
    }
}
