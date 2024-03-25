package classe;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
    private String nome;
    private String iD;
    private List<Pedido> pedido = new ArrayList<>();

    public Cliente(String nome, String iD) {
        this.nome = nome;
        this.iD = iD;
        this.pedido = new ArrayList<>();
    }
    
    public Cliente() {
        this.nome = "";
        this.iD = "";
        //this.pedido = new ArrayList<>();
    }
    
  
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }
   
    public String getNome() {
        return nome;
    }

    public String getiD() {
        return iD;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", iD=" + iD + ", pedido=" + pedido + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.iD);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.iD, other.iD);
    }
    
    
    
    
    
    
}
