package classe;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorLoja {
     private List<Pedido> pedidos;

    public GerenciadorLoja() {
        this.pedidos = new ArrayList<>();
    }
    
    public int numeroDePedidos(){
        int soma = 0;
        for(Pedido p : pedidos){
            soma++;
        }
        return soma;
    }
    public double valorTotal(){
        
        double valorTotal = 0.0;
        for(Pedido p : pedidos){
            valorTotal = valorTotal + p.valorTotal();
        }
        return valorTotal;
    }
    
    
}
