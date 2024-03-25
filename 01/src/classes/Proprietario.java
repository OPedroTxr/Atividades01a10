package classes;

//imports
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Proprietario {

    private Scanner ler = new Scanner(System.in);
    private String nome;
    private String cpf;
    private String email;
    private List<Carro> listaDeCarros;

    public Proprietario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.listaDeCarros = new ArrayList<>();
    }

    public Proprietario() {
        this.nome = "";
        this.cpf = "";
        this.email = "";
        this.listaDeCarros = new ArrayList<>();
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarros(List<Carro> listaDeCarros) {
        this.listaDeCarros = listaDeCarros;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public List<Carro> getCarros() {
        return listaDeCarros;
    }

    public void preencher() {
        System.out.println("---------- Preencha as informacoes ----------");
        System.out.print("Nome: ");
        this.nome = ler.nextLine();
        System.out.print("Cpf: ");
        this.cpf = ler.nextLine();
        System.out.print("Email: ");
        this.email = ler.nextLine();
    }

    public String getFabricante(int i) {
        Carro _carro = listaDeCarros.get(i);
        return _carro.getFabricante();
    }

    public void addCarro() {
        Carro _carro = new Carro();
        _carro.preencher();
        listaDeCarros.add(_carro);
    }

    public void addCarro(Carro outro) {
        listaDeCarros.add(outro);
    }

    public int getTam() {
        return listaDeCarros.size();
    }

    public void comparaMarcas(Proprietario outro) {
        int qnt = 0;

        for (int i = 0; i < outro.listaDeCarros.size(); i++) {
            Carro car1 = listaDeCarros.get(i);
            
            for (int j = 0; j < outro.listaDeCarros.size(); j++) {
                Carro car2 = outro.getCarros().get(j);
                /* Scanner
                System.out.println( j+1 + " Rodada");
                System.out.println("Carro do felipe: " + car1.getModelo());
                System.out.println("Carro do Gleisson: " + car2.getModelo());
                */
                if(car1.getModelo() == car2.getModelo()){
                    
                    qnt++;
                }
            }
        }

        System.out.println("O " + this.nome + " tem " + qnt + " carros da mesma marca de " + outro.getNome());
    }
    
    public void imprimirListaDeCarros(){
        for (int i = 0; i < listaDeCarros.size(); i++) {
            System.out.println(i+1 + " - ");
            listaDeCarros.get(i).imprimir();
        }
    }
    
    public void removerCarro(int carro){
        listaDeCarros.remove(carro);
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome
                + ", cpf:  " + this.cpf
                + ", email: " + this.email
                + ", tem " + listaDeCarros.size()
                + " carros.");
    }
    
    public void copiar(Proprietario outro){
        this.nome = outro.getNome();
        this.cpf = outro.getCpf();
        this.email = outro.getEmail();
        this.listaDeCarros = outro.getCarros();
    }
}
