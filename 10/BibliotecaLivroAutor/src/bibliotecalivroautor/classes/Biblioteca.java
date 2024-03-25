package com.oo.proj_bbtlivroautor.classes;

import com.oo.proj_bbtlivroautor.entity.Autor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class Biblioteca {

    private List<Livro> lista;

    public Biblioteca() {
        this.lista = new ArrayList<>();
    }

    public void addBook(Livro livro) {
       this.lista.add(livro);
    }
  
    public void removeBook(String titulo) {
        Livro livro = this.findBookByTitle(titulo);
        this.lista.remove(livro);
    }

    public Livro findBookByTitle(String titulo) {
        for (Livro livro: this.lista) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro findBookByAuthor(String nomeAutor) {
        for (Livro livro: lista) {
            Autor autor = livro.findAutor(nomeAutor);
            
            if(autor != null)
                return livro;
        }
        return null;
    }

    public List<Autor> findAuthorByCity(String cidade) {
        List<Autor> lstCompletaAutores = new ArrayList<>();
        
        for (Livro livro: lista) {
            //Busco os autores do livro de acordo com a cidade
            List<Autor> lstAutoresEncontrados = livro.findAuthorByCity(cidade);
            
            //Adiciono na lista completa
            lstCompletaAutores.addAll(lstAutoresEncontrados);            
        }
        return lstCompletaAutores;
    }
    
    public List<Livro> findAllBooks() {        
        return this.lista;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "lista=" + lista + '}';
    }        

}
