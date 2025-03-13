package com.example.avaliacao_pbe.view;

import com.example.avaliacao_pbe.controller.EmprestimoController;
import com.example.avaliacao_pbe.model.Cliente;
import com.example.avaliacao_pbe.model.Emprestimo;
import com.example.avaliacao_pbe.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Emprestimo")
public class ViewEmprestimo {
    EmprestimoController controll = new EmprestimoController();
    @GetMapping
    public List<Emprestimo> mostrarTodos(){
        return controll.encontrarTodos();
    }

    @GetMapping("/{dataFinal}")
    public Emprestimo pegarPorData(@PathVariable long dataFinal){
        return controll.getByDatafinal(dataFinal);
    }
    @PostMapping("/{idLivro}")
    public boolean insert(@RequestBody Emprestimo emprestimo, @PathVariable long idLivro){
        return controll.inserir(emprestimo,idLivro);
    }

    @PostMapping("/livro")
    public boolean criatLivro(@RequestBody Livro livro){
        return controll.criarLivro(livro);
    }

    @PostMapping("/{idEmprestimo}/livro/{idLivro}")
    public Emprestimo insertLivro( @PathVariable long idEmprestimo, @RequestBody Livro livro, @PathVariable long idLivro){
        return controll.inserirLivro(idEmprestimo, livro, idLivro);
    }

    @PutMapping("/{dataEmprestimo}")
    public boolean updDataFinal(@RequestBody Emprestimo emprestimo,@PathVariable long dataEmpretimo){
        return controll.updEmprestimoDatafinal(dataEmpretimo, emprestimo);
    }

    @PutMapping("/{idEmprestimo}/emprestimo/cliente")
    public boolean updEmprestimoCliente(@PathVariable long idEmpretimo,@RequestBody Emprestimo emprestimo, @RequestBody Cliente cliente){
        return controll.updEmprestimoCliente(idEmpretimo, emprestimo, cliente);
    }

    @DeleteMapping("/{idEmprestimo}/delete")
    public boolean removeCurso(@PathVariable int idEmprestimo) {
        return controll.removeEmprestimo(idEmprestimo);
    }
}
