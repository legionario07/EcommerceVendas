package com.example.paulinho.ecommercevendas.utils;

/**
 * Created by PauLinHo on 10/09/2017.
 */

public class WebServiceUtil {

    private static final String URL_USUARIO_SAVE = getUrl() + "usuario/save";
    private static final String URL_USUARIO_UPDATE = getUrl() + "usuario/update";
    private static final String URL_USUARIO_DELETE = getUrl() + "usuario/delete";
    private static final String URL_USUARIO_FIND = getUrl() + "usuario/find";
    private static final String URL_USUARIO_FINDALL = getUrl() + "usuario/findAll";

    private static final String URL_CAIXA_SAVE = getUrl() + "caixa/save";
    private static final String URL_CAIXA_UPDATE = getUrl() + "caixa/update";
    private static final String URL_CAIXA_DELETE = getUrl() + "caixa/delete";
    private static final String URL_CAIXA_FIND = getUrl() + "caixa/find";
    private static final String URL_CAIXA_FINDALL = getUrl() + "caixa/findAll";

    private static final String URL_CATEGORIA_SAVE = getUrl() + "categoria/save";
    private static final String URL_CATEGORIA_UPDATE = getUrl() + "categoria/update";
    private static final String URL_CATEGORIA_DELETE = getUrl() + "categoria/delete";
    private static final String URL_CATEGORIA_FIND = getUrl() + "categoria/find";
    private static final String URL_CATEGORIA_FINDALL = getUrl() + "categoria/findAll";

    private static final String URL_COMPRA_SAVE = getUrl() + "compra/save";
    private static final String URL_COMPRA_UPDATE = getUrl() + "compra/update";
    private static final String URL_COMPRA_DELETE = getUrl() + "compra/delete";
    private static final String URL_COMPRA_FIND = getUrl() + "compra/find";
    private static final String URL_COMPRA_FINDALL = getUrl() + "compra/findAll";

    private static final String URL_ENTRADA_SAVE = getUrl() + "entrada/save";
    private static final String URL_ENTRADA_UPDATE = getUrl() + "entrada/update";
    private static final String URL_ENTRADA_DELETE = getUrl() + "entrada/delete";
    private static final String URL_ENTRADA_FIND = getUrl() + "entrada/find";
    private static final String URL_ENTRADA_FINDALL = getUrl() + "entrada/findAll";

    private static final String URL_ITEMCOMPRA_SAVE = getUrl() + "itemCompra/save";
    private static final String URL_ITEMCOMPRA_UPDATE = getUrl() + "itemCompra/update";
    private static final String URL_ITEMCOMPRA_DELETE = getUrl() + "itemCompra/delete";
    private static final String URL_ITEMCOMPRA_FIND = getUrl() + "itemCompra/find";
    private static final String URL_ITEMCOMPRA_FINDALL = getUrl() + "itemCompra/findAll"; 
    
    private static final String URL_ITEMVENDA_SAVE = getUrl() + "itemVenda/save";
    private static final String URL_ITEMVENDA_UPDATE = getUrl() + "itemVenda/update";
    private static final String URL_ITEMVENDA_DELETE = getUrl() + "itemVenda/delete";
    private static final String URL_ITEMVENDA_FIND = getUrl() + "itemVenda/find";
    private static final String URL_ITEMVENDA_FINDALL = getUrl() + "itemVenda/findAll";

    private static final String URL_PERFIL_SAVE = getUrl() + "perfil/save";
    private static final String URL_PERFIL_UPDATE = getUrl() + "perfil/update";
    private static final String URL_PERFIL_DELETE = getUrl() + "perfil/delete";
    private static final String URL_PERFIL_FIND = getUrl() + "perfil/find";
    private static final String URL_PERFIL_FINDALL = getUrl() + "perfil/findAll";

    private static final String URL_PRODUTO_SAVE = getUrl() + "produto/save";
    private static final String URL_PRODUTO_UPDATE = getUrl() + "produto/update";
    private static final String URL_PRODUTO_DELETE = getUrl() + "produto/delete";
    private static final String URL_PRODUTO_FIND = getUrl() + "produto/find";
    private static final String URL_PRODUTO_FINDALL = getUrl() + "produto/findAll";

    private static final String URL_RETIRADA_SAVE = getUrl() + "retirada/save";
    private static final String URL_RETIRADA_UPDATE = getUrl() + "retirada/update";
    private static final String URL_RETIRADA_DELETE = getUrl() + "retirada/delete";
    private static final String URL_RETIRADA_FIND = getUrl() + "retirada/find";
    private static final String URL_RETIRADA_FINDALL = getUrl() + "retirada/findAll";

    private static final String URL_TAXA_SAVE = getUrl() + "taxa/save";
    private static final String URL_TAXA_UPDATE = getUrl() + "taxa/update";
    private static final String URL_TAXA_DELETE = getUrl() + "taxa/delete";
    private static final String URL_TAXA_FIND = getUrl() + "taxa/find";
    private static final String URL_TAXA_FINDALL = getUrl() + "taxa/findAll";

    private static final String URL_VENDA_SAVE = getUrl() + "venda/save";
    private static final String URL_VENDA_UPDATE = getUrl() + "venda/update";
    private static final String URL_VENDA_DELETE = getUrl() + "venda/delete";
    private static final String URL_VENDA_FIND = getUrl() + "venda/find";
    private static final String URL_VENDA_FINDALL = getUrl() + "venda/findAll";

    /**
     * Method that returns the beginning of the webservice URL
     *
     * @return
     */
    private static String getUrl() {

        String URL = "http://omniatechnology.com.br/EcommerceVendasWS/webresources/";

        return URL;

    }

    public static String getUrlUsuarioSave() {
        return URL_USUARIO_SAVE;
    }

    public static String getUrlUsuarioUpdate() {
        return URL_USUARIO_UPDATE;
    }

    public static String getUrlUsuarioDelete() {
        return URL_USUARIO_DELETE;
    }

    public static String getUrlUsuarioFind() {
        return URL_USUARIO_FIND;
    }

    public static String getUrlUsuarioFindall() {
        return URL_USUARIO_FINDALL;
    }

    public static String getUrlCaixaSave() {
        return URL_CAIXA_SAVE;
    }

    public static String getUrlCaixaUpdate() {
        return URL_CAIXA_UPDATE;
    }

    public static String getUrlCaixaDelete() {
        return URL_CAIXA_DELETE;
    }

    public static String getUrlCaixaFind() {
        return URL_CAIXA_FIND;
    }

    public static String getUrlCaixaFindall() {
        return URL_CAIXA_FINDALL;
    }

    public static String getUrlCategoriaSave() {
        return URL_CATEGORIA_SAVE;
    }

    public static String getUrlCategoriaUpdate() {
        return URL_CATEGORIA_UPDATE;
    }

    public static String getUrlCategoriaDelete() {
        return URL_CATEGORIA_DELETE;
    }

    public static String getUrlCategoriaFind() {
        return URL_CATEGORIA_FIND;
    }

    public static String getUrlCategoriaFindall() {
        return URL_CATEGORIA_FINDALL;
    }

    public static String getUrlCompraSave() {
        return URL_COMPRA_SAVE;
    }

    public static String getUrlCompraUpdate() {
        return URL_COMPRA_UPDATE;
    }

    public static String getUrlCompraDelete() {
        return URL_COMPRA_DELETE;
    }

    public static String getUrlCompraFind() {
        return URL_COMPRA_FIND;
    }

    public static String getUrlCompraFindall() {
        return URL_COMPRA_FINDALL;
    }

    public static String getUrlEntradaSave() {
        return URL_ENTRADA_SAVE;
    }

    public static String getUrlEntradaUpdate() {
        return URL_ENTRADA_UPDATE;
    }

    public static String getUrlEntradaDelete() {
        return URL_ENTRADA_DELETE;
    }

    public static String getUrlEntradaFind() {
        return URL_ENTRADA_FIND;
    }

    public static String getUrlEntradaFindall() {
        return URL_ENTRADA_FINDALL;
    }

    public static String getUrlItemcompraSave() {
        return URL_ITEMCOMPRA_SAVE;
    }

    public static String getUrlItemcompraUpdate() {
        return URL_ITEMCOMPRA_UPDATE;
    }

    public static String getUrlItemcompraDelete() {
        return URL_ITEMCOMPRA_DELETE;
    }

    public static String getUrlItemcompraFind() {
        return URL_ITEMCOMPRA_FIND;
    }

    public static String getUrlItemcompraFindall() {
        return URL_ITEMCOMPRA_FINDALL;
    }

    public static String getUrlItemvendaSave() {
        return URL_ITEMVENDA_SAVE;
    }

    public static String getUrlItemvendaUpdate() {
        return URL_ITEMVENDA_UPDATE;
    }

    public static String getUrlItemvendaDelete() {
        return URL_ITEMVENDA_DELETE;
    }

    public static String getUrlItemvendaFind() {
        return URL_ITEMVENDA_FIND;
    }

    public static String getUrlItemvendaFindall() {
        return URL_ITEMVENDA_FINDALL;
    }

    public static String getUrlPerfilSave() {
        return URL_PERFIL_SAVE;
    }

    public static String getUrlPerfilUpdate() {
        return URL_PERFIL_UPDATE;
    }

    public static String getUrlPerfilDelete() {
        return URL_PERFIL_DELETE;
    }

    public static String getUrlPerfilFind() {
        return URL_PERFIL_FIND;
    }

    public static String getUrlPerfilFindall() {
        return URL_PERFIL_FINDALL;
    }

    public static String getUrlProdutoSave() {
        return URL_PRODUTO_SAVE;
    }

    public static String getUrlProdutoUpdate() {
        return URL_PRODUTO_UPDATE;
    }

    public static String getUrlProdutoDelete() {
        return URL_PRODUTO_DELETE;
    }

    public static String getUrlProdutoFind() {
        return URL_PRODUTO_FIND;
    }

    public static String getUrlProdutoFindall() {
        return URL_PRODUTO_FINDALL;
    }

    public static String getUrlRetiradaSave() {
        return URL_RETIRADA_SAVE;
    }

    public static String getUrlRetiradaUpdate() {
        return URL_RETIRADA_UPDATE;
    }

    public static String getUrlRetiradaDelete() {
        return URL_RETIRADA_DELETE;
    }

    public static String getUrlRetiradaFind() {
        return URL_RETIRADA_FIND;
    }

    public static String getUrlRetiradaFindall() {
        return URL_RETIRADA_FINDALL;
    }

    public static String getUrlTaxaSave() {
        return URL_TAXA_SAVE;
    }

    public static String getUrlTaxaUpdate() {
        return URL_TAXA_UPDATE;
    }

    public static String getUrlTaxaDelete() {
        return URL_TAXA_DELETE;
    }

    public static String getUrlTaxaFind() {
        return URL_TAXA_FIND;
    }

    public static String getUrlTaxaFindall() {
        return URL_TAXA_FINDALL;
    }

    public static String getUrlVendaSave() {
        return URL_VENDA_SAVE;
    }

    public static String getUrlVendaUpdate() {
        return URL_VENDA_UPDATE;
    }

    public static String getUrlVendaDelete() {
        return URL_VENDA_DELETE;
    }

    public static String getUrlVendaFind() {
        return URL_VENDA_FIND;
    }

    public static String getUrlVendaFindall() {
        return URL_VENDA_FINDALL;
    }
}