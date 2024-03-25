package carro;

//imports
import classes.Proprietario;
import classes.Carro;
import classes.Roda;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import menu.Menus;

public class main {

    public static void imprimeLista(List<Proprietario> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + 1 + " - ");
            list.get(i).imprimir();
        }
    }

    public static void menuUsuarios(Proprietario prop, List<Proprietario> list, Menus menu) {
        Scanner ler = new Scanner(System.in);
        int opcao, opcaoRemover ,opcaoBusca;

        do {
            menu.getMenuProp(prop);
            
            System.out.print("Deseja selecionar qual opcao? \n ->");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    prop.addCarro();
                    break;
                case 2:
                    prop.imprimirListaDeCarros();
                    System.out.print("Qual deseja remover? \n ->");
                    opcaoRemover = ler.nextInt();
                    prop.removerCarro(opcaoRemover - 1);
                    break;
                case 3:
                    imprimeLista(list);
                    System.out.print("Deseja comparar com quem? \n ->");
                    opcaoBusca = ler.nextInt();
                    prop.comparaMarcas(list.get(opcaoBusca-1));
                    break;
                default:
            }
        } while (opcao != 0);
    }

    public static void main(String[] args) {
        List<Proprietario> proprietarios = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        int opcao;
        Menus menu = new Menus();
        boolean temUsuario;

        do {
            if (proprietarios.size() > 0) {
                temUsuario = true;
            } else {
                temUsuario = false;
            }
            menu.getMenu(temUsuario);

            System.out.print("Deseja selecionar qual opcao? \n ->");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    Proprietario prop = new Proprietario();
                    prop.preencher();
                    proprietarios.add(prop);
                    break;
                case 2:
                    if (temUsuario) {
                        imprimeLista(proprietarios);
                        System.out.print("Deseja selecionar qual proprietario? \n ->");
                        int opcaoProp = ler.nextInt();

                        menuUsuarios(proprietarios.get(opcaoProp - 1),proprietarios, menu);

                    }
                    break;
                default:
                    System.out.println("Tchau w.w");
            }
        } while (opcao != 0);

    }

}
