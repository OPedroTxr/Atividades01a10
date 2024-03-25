
package com.oo.proj_bbtlivroautor.entity;

import java.util.Objects;

/**
 *
 * @author noteifet
 */
public class Autor {
    
    private String nome;
    private String cidadeNatal;

    public Autor() {
        this.nome = "";
        this.cidadeNatal = "";
    }

    public Autor(String nome, String cidadeNatal) {
        this.nome = nome;
        this.cidadeNatal = cidadeNatal;
    }
        
    public void imprimir(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Autor{" 
                + "nome=" + nome 
                + ", cidadeNatal=" + cidadeNatal 
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cidadeNatal);
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
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.cidadeNatal, other.cidadeNatal);
    }
    
    
    
    public void copiar(Autor outro) {
        this.nome = outro.getNome();        
        this.cidadeNatal = outro.getCidadeNatal();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cidadeNatal
     */
    public String getCidadeNatal() {
        return cidadeNatal;
    }

    /**
     * @param cidadeNatal the cidadeNatal to set
     */
    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }
    
    
    
}
