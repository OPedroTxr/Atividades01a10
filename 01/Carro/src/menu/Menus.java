package menu;

import carro.main;
import classes.Proprietario;

public class Menus {

    public Menus() {

    }

    public void getMenu(boolean temUsuario) {
        if (temUsuario) {
            System.out.println("----- Menu -----");
            System.out.println("1- Add proprietario");
            System.out.println("2- Lista de Proprietarios");
            System.out.println("0- Sair do programa");
        }else{
            System.out.println("----- Menu -----");
            System.out.println("1- Add proprietario");
            System.out.println("0- Sair do programa");
        }
    }
    
    public void getMenuProp(Proprietario prop){
        System.out.println("----- Menu do " + prop.getNome() + " -----");
        System.out.println("1- Add Carro");
        System.out.println("2- Remover Carro");
        System.out.println("3- Comparar carros");
        System.out.println("0- Sair do menu de proprietarios");
    }
}
