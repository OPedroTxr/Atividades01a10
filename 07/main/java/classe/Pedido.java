package classe;


import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> listaProd = new ArrayList<>();
    private Cliente cliente = new Cliente();
    private double valorTotal;

    public Pedido(Cliente cliente) {
        //this.listaProd = listaProd;
        this.cliente = new Cliente();
    }
    
    public void addProduto(Produto prodt){
        this.listaProd.add(prodt);
    }
    
    public void removeProduto(Produto prodt){
        this.listaProd.remove(prodt);
    }
    
    
    public double valorTotal(){
        double soma=0.0;
        for(Produto p: listaProd){
            soma = soma + p.getPreco();
        }
        return soma;
    }
    
    public void imprimir(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Pedido{" + "listaProd=" + listaProd + ", cliente=" + cliente + '}';
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
    public List<Produto> getListaProd() {
        return listaProd;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setListaProd(List<Produto> listaProd) {
        this.listaProd = listaProd;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
