package classes;

//imports
import java.util.Scanner;

public class Roda {

    private Scanner ler = new Scanner(System.in);
    private double raio;
    private String material;
    private double peso;
    private double suporteMax;

    public Roda() {
        this.raio = 0;
        this.material = "";
        this.peso = 0;
        this.suporteMax = 0;
    }

    public Roda(double raio, String material, double peso, double suporteMax) {
        this.raio = raio;
        this.material = material;
        this.peso = peso;
        this.suporteMax = suporteMax;
    }
    
    public Roda(Roda outra) {
        this.raio = outra.getRaio();
        this.material = outra.getMaterial();
        this.peso = outra.getPeso();
        this.suporteMax = outra.getSuporteMax();
    }

    //setters
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSuporteMax(double suporteMax) {
        this.suporteMax = suporteMax;
    }

    //getters
    public double getRaio() {
        return raio;
    }

    public String getMaterial() {
        return material;
    }

    public double getPeso() {
        return peso;
    }

    public double getSuporteMax() {
        return suporteMax;
    }

    public void preencher() {
        System.out.println("----- Informacoes da roda -----");
        System.out.print("Raio: ");
        this.raio = Double.parseDouble(ler.nextLine());
        System.out.print("Material: ");
        this.material = ler.nextLine();
        System.out.print("Peso: ");
        this.raio = Double.parseDouble(ler.nextLine());
        System.out.print("Suporte Maximo: ");
        this.raio = Double.parseDouble(ler.nextLine());
    }

    public void imprimir() {
        System.out.println("Raio: " + raio + ", material: " + material + ", peso: " + peso + ", Suporte Maximo: " + suporteMax);
    }

    public void copiar(Roda outra) {
        this.raio = outra.getRaio();
        this.material = outra.getMaterial();
        this.peso = outra.getPeso();
        this.suporteMax = outra.getSuporteMax();
    }
}
