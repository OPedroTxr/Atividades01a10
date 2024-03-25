package classe;

import java.util.Objects;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private String email;
    private String curso;
    private Telefone[] fone = new Telefone[2];

    public Aluno(String nome, String matricula, String email, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.curso = curso;
        
        for(int i =0; i<2; i++){
            this.fone[i]= new Telefone();
        }
    }
    
    

    public Aluno() {
        this.nome = "";
        this.matricula = "";
        this.email = "";
        this.curso = "";
        for(int i =0; i< 2; i++){
        this.fone()[i] = new Telefone();
    }
    }        
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("..........Cadastro do Aluno..........");
        System.out.println("Nome :");
        this.setNome(leitor.next());
        System.out.println("Matricula :");
        this.setMatricula(leitor.next());
        System.out.println("Email :");
        this.setEmail(leitor.next());
        System.out.println("Curso :");
        this.setCurso(leitor.next());
        System.out.println("Telefone :");
        for(int i = 0; i<2; i++){
            this.getFone()[i].preencher();
            
        }
        
    }
    
    public void copiar(Aluno outro){
        this.nome = outro.nome;
        this.email = outro.email;
        this.matricula = outro.matricula;
        this.curso = outro.curso;
        
        for(int i = 0; i<2; i++){
            Telefone t1 = outro.getFone()[i];
             this.getFone()[i].copiar(t1);
        }
       
    }
    
     public void imprimir(){
        System.out.println("\tOs trem ai\n\n");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Curso: " + this.getCurso());
        
        for(Telefone ti: this.getFone()){
            ti.imprimir();
        }
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public String getCurso() {
        return curso;
    }

    public Telefone[] getFone() {
        return fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setFone(Telefone[] fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", email=" + email + ", curso=" + curso + ", fone=" + fone + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.matricula);
        hash = 67 * hash + Objects.hashCode(this.email);
        hash = 67 * hash + Objects.hashCode(this.curso);
        hash = 67 * hash + Objects.hashCode(this.fone);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        return Objects.equals(this.fone, other.fone);
    }
    
    
}
