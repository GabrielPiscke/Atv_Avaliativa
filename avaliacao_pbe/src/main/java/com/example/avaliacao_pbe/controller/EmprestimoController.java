package com.example.avaliacao_pbe.controller;

import com.example.avaliacao_pbe.banco.EmprestimoBd;
import com.example.avaliacao_pbe.model.Cliente;
import com.example.avaliacao_pbe.model.Emprestimo;
import com.example.avaliacao_pbe.model.Livro;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class EmprestimoController {
   EmprestimoBd repository = new EmprestimoBd();
    public List<Emprestimo> encontrarTodos() {
        return repository.findALl();
    }

    public Emprestimo getByDatafinal(long dataFinal){
        return repository.getByDatafinal(dataFinal);
    }
    public boolean inserir(Emprestimo emprestimo, long idLivro) {
        return repository.insert(emprestimo, idLivro);
    }
    public boolean criarLivro(Livro livro) {
        return repository.makeLivro(livro);
    }
    public Emprestimo inserirLivro(Long idEmprestimo, Livro livro, long idLivro) {
        return repository.insertLivro(idEmprestimo, livro,idLivro);
    }

    public boolean updEmprestimoDatafinal(long dataEmprestimo, Emprestimo emprestimo) {
        return repository.updEmprestimoDatafinal(dataEmprestimo, emprestimo);
    }
    public boolean updEmprestimoCliente(long idEmprestimo, Emprestimo emprestimo, Cliente cliente) {
        return repository.updEmprestimoCliente(idEmprestimo, emprestimo, cliente);
    }
    public boolean removeEmprestimo(long idEmprestimo){
        return repository.removeEmprestimo(idEmprestimo);
    }
}
