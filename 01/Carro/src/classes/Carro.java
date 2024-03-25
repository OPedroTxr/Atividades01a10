package classes;

import java.util.Scanner;

public class Carro {
    private Scanner ler = new Scanner(System.in);
    private String fabricante;
    private String modelo;
    private double motor;
    private String cor;
    private Roda rodas;

    public Carro(String fabricante, String modelo, double motor, String cor, Roda rodas) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.motor = motor;
        this.cor = cor;
        this.rodas = rodas;
    }
    
    public Carro(Carro outro){
        this.fabricante = outro.getFabricante();
        this.modelo = outro.getModelo();
        this.motor = outro.getMotor();
        this.cor = outro.getCor();
        this.rodas = outro.getRodas();
    }

    public Carro() {

        this.fabricante = "";
        this.modelo = "";
        this.motor = 0;
        this.cor = "";
        this.rodas = new Roda();
    }
    
    //setters
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(Roda rodas) {
        this.rodas = rodas;
    }
    
    //getters
    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getMotor() {
        return motor;
    }

    public String getCor() {
        return cor;
    }

    public Roda getRodas() {
        return rodas;
    }
    
    public void preencher(){
        System.out.println("---------- Preencha o novo carro ----------");
        System.out.print("Fabricante: ");
        this.fabricante = ler.nextLine();
        System.out.print("Modelo: ");
        this.modelo = ler.nextLine();
        System.out.print("Motor: ");
        this.motor = Double.parseDouble(ler.nextLine());
        System.out.print("Cor: ");
        this.cor = ler.nextLine();
        
        rodas.preencher();
    }
    
    public void imprimir(){
        System.out.println("Fabricante: " + fabricante + ", modelo: " + modelo + ", motor: " + motor + ", cor: " + cor);
    }
    
    public void copiar(Carro outro){
        this.fabricante = outro.getFabricante();
        this.modelo = outro.getModelo();
        this.motor = outro.getMotor();
        this.cor = outro.getCor();
        this.rodas = outro.getRodas();
    }

}
