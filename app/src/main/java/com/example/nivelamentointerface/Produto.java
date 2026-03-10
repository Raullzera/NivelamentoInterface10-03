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
    public void incluir() {
        Log.i(API.TAG, "incluir: Produto ");
    }

    @Override
    public void alternar() {
        Log.i(API.TAG, "alternar: Produto ");
    }

    @Override
    public void deletar() {
        Log.i(API.TAG, "deletar: Produto ");
    }

    @Override
    public void listar() {
        Log.i(API.TAG, "listar   : Produto ");
    }
}
