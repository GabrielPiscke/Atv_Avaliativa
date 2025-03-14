package com.example.avaliacao_pbe.banco;

import com.example.avaliacao_pbe.model.Cliente;
import com.example.avaliacao_pbe.model.Emprestimo;
import com.example.avaliacao_pbe.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoBd {
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;
    public EmprestimoBd(){this.emprestimos = new ArrayList<>();}
    public void LivroBd(){this.livros = new ArrayList<>();}

    public List<Emprestimo> findALl() {
        return new ArrayList<>(emprestimos);
    }
    public boolean insert(Emprestimo emprestimo, long idLivro) {
        Livro livroBd = getByidLivro(idLivro);
        if (livroBd == null) {
            return false;
        } else {
            emprestimos.add(emprestimo);
            return true;
        }
    }

    public boolean makeLivro(Livro livro) {
        livros.add(livro);
        return true;
    }
    public Livro getByidLivro(long idLivro){
        return livros.stream()
                .filter(obj -> obj.getidLivro() == idLivro)
                .findFirst()
                .orElse(null);
    }


    public Emprestimo getByidEmprestimo(long idEmprestimo){
        return emprestimos.stream()
                .filter(obj -> obj.getIdEmprestimo() == idEmprestimo)
                .findFirst()
                .orElse(null);
    }

    public Emprestimo getByDatafinal(long dataFinal){
        return emprestimos.stream()
                .filter(obj -> obj.getdataFinal() == dataFinal)
                .findFirst()
                .orElse(null);
    }

    public Emprestimo insertLivro(long idEmprestimo, Livro livro, long idLivro) {
      Emprestimo emprestimoBd = getByidEmprestimo(idEmprestimo);
      Livro livroBd = getByidLivro(idLivro);
        if (emprestimoBd == null || livroBd == null) {
            return null;
        }else{
        emprestimoBd.getLivros().add(livroBd);
        return emprestimoBd;
        }
    }
    public boolean updEmprestimoDatafinal(long dataEmprestimo, Emprestimo emprestimo) {
       Emprestimo emprestimoBd = emprestimos.stream()
               .filter(objeto -> objeto.getdataFinal() == dataEmprestimo)
               .findFirst()
               .orElse(null);
        if (emprestimoBd == null){
            return false;
        }
        emprestimoBd.setdataFinal(emprestimo.getdataFinal());
        return true;
    }
    public boolean updEmprestimoCliente(long idEmprestimo, Emprestimo emprestimo, Cliente cliente) {
        Emprestimo emprestimoBd = emprestimos.stream()
                .filter(objeto -> objeto.getIdEmprestimo() == idEmprestimo)
                .findFirst()
                .orElse(null);
        if (emprestimoBd == null){
            return false;
        }
        emprestimoBd.setdataFinal(emprestimo.getdataFinal());
        return true;
    }
    public boolean removeEmprestimo(long idEmprestimo) {
        return emprestimos.removeIf(emp -> emp.getIdEmprestimo() == (idEmprestimo));
    }
}
