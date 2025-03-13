package com.example.avaliacao_pbe.model;

import java.util.ArrayList;

public class Emprestimo {
    private long idEmprestimo;
    private long dataInicio;
    private long dataFinal;
    private Cliente cliente;
    private ArrayList <Livro> livros;

    public Emprestimo(long idEmprestimo, long dataInicio, long dataFinal, Cliente cliente, ArrayList<Livro> livros) {
        this.idEmprestimo = idEmprestimo;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.cliente = cliente;
        this.livros = livros;
    }

    public long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public long getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(long dataInicio) {
        this.dataInicio = dataInicio;
    }

    public long getdataFinal() {
        return dataFinal;
    }

    public void setdataFinal(long dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
}
