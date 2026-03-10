package com.example.nivelamentointerface;

import android.util.Log;

public class Produto implements iSCCP {
    private String fornecedor;
    private String nome;

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public void procurar() {

    }

    @Override
    public void apagar() {
        Log.i(API.TAG, "apagar: Produto ");
    }

}
