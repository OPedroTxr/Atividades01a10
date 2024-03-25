package classes;

import classes.PessoaFisica;
import classes.ContaAPagar;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorPessoaFisica {
    private List<PessoaFisica> listaPessoas;
    

    public GerenciadorPessoaFisica() {
        listaPessoas = new ArrayList<>();       
    }

    public void inserirPessoa(PessoaFisica pessoaFisica) {
        listaPessoas.add(pessoaFisica);
        System.out.println("Inserção feita com sucesso!");
    }

    public void removerPessoa(String nomePessoa) {
        for (PessoaFisica pessoaFisica: listaPessoas) {
            if (pessoaFisica.getNome().equals(nomePessoa)) {
                listaPessoas.remove(pessoaFisica);
                
                System.out.println("Remoção realizada com sucesso!");
                break;            
            }
        }
    }
    
    public void inserirContaEmPessoa(String nomeProcurado, ContaAPagar novaConta) {
        boolean encontrou = false;

        for (PessoaFisica pf : listaPessoas) {
            if (pf.getNome().equals(nomeProcurado)) {
                encontrou = true;
                
                pf.getListaContas().add(novaConta);
                break; 
            }
        }

        if (!encontrou) {
            System.out.println("Não existe ninguém com este nome.");
        }
    }

    public PessoaFisica pesquisarPessoaPorCPF(String cpfProcurado) {       
        for (PessoaFisica pessoa : listaPessoas) {
            if (pessoa.getCpf().equals(cpfProcurado)) {
               return pessoa;
            }
        }
        return null;
    }

    public PessoaFisica pesquisarPessoaPorNome(String nomeProcurado) {
        for (PessoaFisica pessoa : listaPessoas) {
            if (pessoa.getNome().equals(nomeProcurado)) {
               return pessoa;
            }
        }
        return null;
    }

    public PessoaFisica pessoaComMaiorDevedor() {
        double maiorDivida = 0;
        PessoaFisica pessoaMaiorDivida = new PessoaFisica();

        for (PessoaFisica pessoaFisica : listaPessoas) {
            double total  = pessoaFisica.contabilizaDividaTotal();
            
            if(total > maiorDivida){
                maiorDivida = total;
                pessoaMaiorDivida.copiar(pessoaFisica);
            }           
        }
        return pessoaMaiorDivida;
    }

    public double totalDevido() {
        double totalDividas = 0.0;

        for (PessoaFisica pessoaFisica : listaPessoas) {
            totalDividas += pessoaFisica.contabilizaDividaTotal();
        }
        return totalDividas;
    }
}

