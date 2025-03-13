package com.example.avaliacao_pbe.model;

public class Cliente {
    private long idCliente;
    private String nome;
    private long cpf;
    private int telefone;
    private long email;

    public Cliente(long idCliente, String nome, long cpf, int telefone, long email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public long getId() {
        return idCliente;
    }

    public void setId(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public long getEmail() {
        return email;
    }

    public void setEmail(long email) {
        this.email = email;
    }
}
