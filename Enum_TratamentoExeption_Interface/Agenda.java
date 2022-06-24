package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import dados.CadastroPessoas;
import dados.Pessoa;

public class Agenda {
    private Scanner entrada;
    private CadastroPessoas cadastro;

    /**
     * Construtor
     * @param cadastro Colecao de pessoas
     */
    public Agenda(CadastroPessoas cadastro) {
        entrada = new Scanner(System.in);
        this.cadastro = cadastro;
    }

    /**
     * Execucao da interface com o usuario
     */
    public void executa() {
        int opcao;
        do {
            apresentaMenuOpcoes();
            System.out.print("Digite a opcao desejada: ");
            opcao = entrada.nextInt();
            System.out.println("*************************************************");
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    try {
                        cadastrarPessoa();
                    } catch (InputMismatchException e) {
                        System.out.println("Passe um número válido (tente novamente)");
                    }
                    break;
                case 2:
                    consultarPessoa();
                    break;
                case 3:
                    removerPessoa();
                    break;
                case 4:
                    consultarQuantidadePessoas();
                    break;
                case 5:
                    removeTodasPessoas();
                    break;
                case 6:                     // Easter egg
                    mostraCadastro();
                    break;
                case 7:
                    inicializaCadastro();   // Easter egg
                    break;
                default:
                    System.out.println("Opcao invalida. Redigite.");
            }
        } while (opcao != 0);
    }

    /**
     * Menu de opcoes
     */
    private void apresentaMenuOpcoes() {
        System.out.println("=================================================");
        System.out.println("AGENDA - OPCOES:");
        System.out.println("[0] Sair");
        System.out.println("[1] Cadastrar pessoa");
        System.out.println("[2] Consultar pessoa");
        System.out.println("[3] Remover pessoa");
        System.out.println("[4] Consultar quantidade de pessoas cadastradas");
        System.out.println("[5] Remover todas as pessoas");
    }

    /**
     * Cadastra uma pessoa
     */
    private void cadastrarPessoa() {
        System.out.println("Cadastro de pessoa");
        System.out.print("Digite o nome da pessoa: ");
        String nome = entrada.nextLine();
        nome = entrada.nextLine();
        System.out.print("Digite o numero de telefone: ");
        int numero = entrada.nextInt();
        Pessoa p = new Pessoa(nome, numero);
        boolean status = cadastro.adicionaPessoa(p);
        if (status)
            System.out.println("Pessoa cadastrada.");
        else
            System.out.println("Erro no cadastro de pessoa.");
    }

    /**
     * Consulta dados de uma pessoa pelo seu nome
     */
    private void consultarPessoa() {
        System.out.println("Consulta de pessoa");
        System.out.print("Digite o nome da pessoa: ");
        String nome = entrada.nextLine();
        Pessoa p = cadastro.consultaPorNome(nome);
        if (p != null) {
            System.out.println("Pessoa encontrada:");
            System.out.println("Nome: " + p.getNome());
            System.out.println("Telefone: " + p.getTelefone());
        } else
            System.out.println("Nome nao encontrado.");
    }

    /**
     * Remove uma pessoa pelo seu nome
     */
    private void removerPessoa() {
        System.out.println("Remocao de pessoa");
        System.out.print("Digite o nome da pessoa: ");
        String nome = entrada.nextLine();
        nome = entrada.nextLine();
        boolean ok = cadastro.removePessoaPorNome(nome);
        if (ok)
            System.out.println("Pessoa removida.");
        else
            System.out.println("Nome nao encontrado.");
    }

    /**
     * Consulta a quantidade de pessoas cadastradas
     */
    private void consultarQuantidadePessoas() {
        System.out.println("Consulta de quantidade de pessoas cadastradas");
        int quantidade = cadastro.quantidadeAtual();
        System.out.println("Quantidade de pessoas cadastradas: " + quantidade);
    }

    /**
     * Remove todas as pessoas cadastradas
     */
    private void removeTodasPessoas() {
        System.out.println("Remocao de todas as pessoas cadastradas");
        System.out.print("Deseja realmente remover todas as pessoas? (S)im / (N)ao: ");
        String resp = entrada.nextLine();
        resp = entrada.nextLine().toUpperCase();
        if(resp.equals("S")) {
            cadastro.limpar();
            System.out.println("Todas as pessoas foram removidas.");
        }
    }

    /**
     * Mostra os dados de todas as pessoas
     */
    private void mostraCadastro() {
        System.out.println("Pessoas cadastradas:");
        Pessoa[] colecao = cadastro.getColecao();
        for (Pessoa p : colecao) {
            if(p != null)
                System.out.println(p);
        }
    }

    /**
     * Insere algumas pessoas no cadastro
     */
    private void inicializaCadastro() {
        cadastro.adicionaPessoa(new Pessoa("Maria", 33333333));
        cadastro.adicionaPessoa(new Pessoa("Pedro", 22222222));
        cadastro.adicionaPessoa(new Pessoa("Mario", 11111111));
        cadastro.adicionaPessoa(new Pessoa("Laura", 44444444));
        System.out.println("Pessoas adicionadas no cadastro.");
    }

}
