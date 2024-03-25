package classe;

import java.util.Objects;
import java.util.Scanner;

public class conta_Banc {
     private int id;
    private String codBarras;
    private double valor;
    private double valorDeposito;

    public conta_Banc() {
        this.id = -1;
        this.codBarras = "";
        this.valor = 0.0;
        this.valorDeposito = 0.0;
    }

    public conta_Banc(int id, String codBarras, double valor, double valorDeposito) {
        this.id = id;
        this.codBarras = codBarras;
        this.valor = valor;
        this.valorDeposito = valorDeposito;
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("--------Conta Bancaria--------");
        System.out.println("ID :");
        this.id = leitor.nextInt();
        System.out.println("Codigo de Barras :");
        this.codBarras = leitor.next();
        System.out.println("Valor da Conta :");
        this.valorDeposito = leitor.nextDouble();
        System.out.println("-------------------------------");
    }
    
    public void copy(conta_Banc outra){
        this.id = outra.getId();
        this.codBarras = outra.getCodBarras();
        this.valor = outra.getValor();    
        this.valorDeposito = outra.getValorDeposito();
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
     
    public void depositar(double valorDeposito) {
    this.valor += valorDeposito;
    }



    @Override
    public String toString() {
        return "conta_Banc{" + "id=" + id + ", codBarras=" + codBarras + ", valor=" + valor + ", valorDeposito=" + valorDeposito + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.codBarras);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.valorDeposito) ^ (Double.doubleToLongBits(this.valorDeposito) >>> 32));
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
        final conta_Banc other = (conta_Banc) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorDeposito) != Double.doubleToLongBits(other.valorDeposito)) {
            return false;
        }
        return Objects.equals(this.codBarras, other.codBarras);
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }
    
    

    public int getId() {
        return id;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public double getValor() {
        return valor;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }
    
    
}
