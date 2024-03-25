
package classes;

import entity.Autor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Livro {
    private String titulo;
    private int anoPublicacao;
    private List<Autor> autores;
    
    public Livro(){
        this.titulo = "";
        this.anoPublicacao = 0;
        
        this.autores = new ArrayList<>();        
    }

    public Livro(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
       
        this.autores = new ArrayList<>();
    }

    public void imprimir(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Livro{" 
                + "titulo=" + titulo 
                + ", anoPublicacao=" + anoPublicacao 
                + ", autores=" + autores 
                + '}';
    }
    
    public void copiar(Livro outro){
        this.titulo = outro.getTitulo();
        this.anoPublicacao = outro.getAnoPublicacao();
          
        for(int i=0; i<= outro.autores.size()-1; i++){
            Autor ai = outro.autores.get(i);
            
            Autor novo = new Autor();
            novo.copiar(ai);                    
            
            this.autores.add(novo);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + this.anoPublicacao;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (this.anoPublicacao != other.anoPublicacao) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autores, other.autores);
    }
    
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

 
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public void addAutor(Autor autor){
        this.autores.add(autor);        
    }
                                                                                
    public void removeAutor(String nomeAutor){
        Autor autor = this.findAutor(nomeAutor);
        this.autores.remove(autor);
    }
    
    public Autor findAutor(String nomeAutor){
        for(Autor autor: this.autores){
            if(autor.getNome().equals(nomeAutor)){
                return autor;
            }
        }
        return null;
    }
    
    public List<Autor> findAuthorByCity(String nomeCidade){
        List<Autor> autoresEncontrados = new ArrayList<>();
        
        for(Autor autor: this.autores){
            if(autor.getCidadeNatal().equals(nomeCidade)){
                autoresEncontrados.add(autor);
            }
        }
        
        return autoresEncontrados;
    
    }
    
    
}

