
package com.mycompany.clie_contaban;

import classe.Cliente;
import classe.conta_Banc;


public class Clie_ContaBan {

    public static void main(String[] args){
        Cliente cliente = new Cliente();
        
        cliente.preencher();
        cliente.imprimir();
        cliente.deposit();
        cliente.imprimir();
    }
    }

