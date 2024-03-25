package motoristacarro;

import classes.Carro;
import classes.Motorista;
import java.util.Scanner;

public class MotoristaCarro {

    public static void main(String[] args) {
        
        Carro meuCarro = new Carro("Opala", 1970, "preto");

        Motorista motorista = new Motorista();
        motorista.setNome("Pedro Lindo");
        motorista.setCarro(meuCarro);

        
        motorista.dirigir();
        motorista.imprimir();
        
        
        
        Scanner scanner = new Scanner(System.in);
        Motorista motorista2 = criarPreencherMotorista(scanner);
        motorista2.dirigir();
        motorista2.imprimir();
    }
    
    
    public static Motorista criarPreencherMotorista(Scanner scanner) {
        System.out.println("------ Preenchendo o motorista -----");

        System.out.print("Nome:");
        String nome = scanner.next();
        
        Carro carro = criarPreencherCarro(scanner);
        
        Motorista motorista = new Motorista(nome, carro);
        return motorista;
    }
    
     public static Carro criarPreencherCarro(Scanner scanner) {
        System.out.println("------ Preenchendo os dados do Carro -----");

        System.out.print("Modelo:");
        String modelo = scanner.next();

        System.out.print("Ano de fabricacao:");
        int ano = scanner.nextInt();

        System.out.print("Cor:");
        String cor = scanner.next();
        
        Carro carro = new Carro(modelo, ano, cor);
        return carro;
    }
}
