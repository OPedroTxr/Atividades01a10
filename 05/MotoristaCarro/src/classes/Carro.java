package classes;

import java.util.Objects;
import java.util.Scanner;

public class Carro {

    private String modelo;
    private int ano;
    private String cor;

    // construtor
    public Carro() {
        this.modelo = "";
        this.ano = 0;
        this.cor = "";
    }

    // construtor
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

   

    public void imprimir() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "("+ "modelo:" + modelo + ", ano:" + ano + ", cor:" + cor + ')';
    }

    //método buzinar
    public void buzinar() {
        System.out.println("O carro " + this.modelo + " esta buzinando!");
        System.out.println("BAAMMMMM!!!");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.modelo);
        hash = 37 * hash + this.ano;
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
        final Carro other = (Carro) obj;
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.cor, other.cor);
    }
    
    
    // getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

