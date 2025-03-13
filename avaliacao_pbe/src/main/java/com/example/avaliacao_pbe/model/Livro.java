package com.example.avaliacao_pbe.model;

public class Livro {

    private long idLivro;
    private String nomeLivro;
    private String autor;
    private String genero;

    public Livro(long idLivro, String nomeLivro, String autor, String genero) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.genero = genero;
    }

    public long getidLivro() {
        return idLivro;
    }

    public void setidLivro(long idLivro) {
        this.idLivro = idLivro;
    }

    public String getNome() {
        return nomeLivro;
    }

    public void setNome(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
