package com.mycompany.pedidos_clien_prod;

import classe.Cliente;
import classe.GerenciadorLoja;
import classe.Produto;

public class Pedidos_Clien_Prod {

    public static void main(String[] args) {
        Produto p1= new Produto("ARROZ", "43245", 24.0);
        Cliente c1 = new Cliente("Carlos","23412");
        
        
        
       GerenciadorLoja gerencia = new GerenciadorLoja();
       
       gerencia.numeroDePedidos();
       gerencia.valorTotal();
    }
}
