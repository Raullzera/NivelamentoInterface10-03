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
    public void procurar() {
        Log.i(API.TAG, "procurar: Cliente ");
    }

    @Override
    public void apagar() {

    }


}
