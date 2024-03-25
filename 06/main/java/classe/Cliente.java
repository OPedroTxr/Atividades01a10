package classe;


import java.util.Scanner;

public class Cliente {
    private String nome;
    private conta_Banc conta;

    public Cliente(String nome, conta_Banc conta) {
        this.nome = nome;
        this.conta =  new conta_Banc();
    }
    
    public Cliente(){
        this.nome = "";
        this.conta = new conta_Banc();
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("-------Cliente-------");
        System.out.println("Nome do cliente :");
        this.nome = leitor.next();
        System.out.println("Conta Bancaria :");
        this.conta.preencher();
        System.out.println("----------------------");

    }
    public void imprimir(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", conta=" + conta + '}';
    }
    
    public void deposit() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor do deposito: ");
        double deposito = leitor.nextDouble();
        this.conta.depositar(deposito);
    }

    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(conta_Banc conta) {
        this.conta = conta;
    }
    
    

    public String getNome() {
        return nome;
    }

    public conta_Banc getConta() {
        return conta;
    }
    
}   
    

