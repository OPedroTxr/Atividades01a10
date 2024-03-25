package classe;

import java.util.Objects;
import java.util.Scanner;

public class Telefone {
    private String ddd;
    private String num;
    private String descricao;
    private String operadora;

    public Telefone(String ddd, String num, String descricao, String operadora) {
        this.ddd = "";
        this.num = "";
        this.descricao = "";
        this.operadora = "";
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira as informacoes do seu numero de telefone:");
        System.out.println("DDD do telefone:");
        this.setDdd(leitor.next());
        System.out.println("Numero do telefone:");
        this.setNum(leitor.next());
        System.out.println("Descricao do telefone:");
        this.setDescricao(leitor.next());
        System.out.println("Operadora do telefone:");
        this.setOperadora(leitor.next());
    }
    
    public void copiar(Telefone outro){
        this.ddd = outro.getDdd();
        this.num = outro.getNum();
        this.descricao = outro.getDescricao();
        this.operadora = outro.getOperadora();
        
    }
    
    public void imprimir(){
        System.out.println("\t TELEFONE \n\n");
        System.out.println("DDD: " + this.getDdd());
        System.out.println("Numero: " + this.getNum());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Operadora: " + this.getOperadora());
    }


    public String getDdd() {
        return ddd;
    }

    public String getNum() {
        return num;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public String toString() {
        return "Telefone{" + "ddd=" + ddd + ", num=" + num + ", descricao=" + descricao + ", operadora=" + operadora + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.ddd);
        hash = 89 * hash + Objects.hashCode(this.num);
        hash = 89 * hash + Objects.hashCode(this.descricao);
        hash = 89 * hash + Objects.hashCode(this.operadora);
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
        final Telefone other = (Telefone) obj;
        if (!Objects.equals(this.ddd, other.ddd)) {
            return false;
        }
        if (!Objects.equals(this.num, other.num)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.operadora, other.operadora);
    }
    
    
    
    
    
    
}
