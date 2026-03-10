package com.example.nivelamentointerface;

import android.util.Log;

public class Cliente implements iSCCP {
    private String nome;

    private String email;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;


    }

    @Override
    public void incluir() {
        Log.i(API.TAG, "incluir: Cliente ");
    }

    @Override
    public void alternar() {
        Log.i(API.TAG, "alternar: Cliente ");
    }

    @Override
    public void deletar() {
        Log.i(API.TAG, "deletar: Cliente ");
    }

    @Override
    public void listar() {
        Log.i(API.TAG, "listar: Cliente ");
    }
}
