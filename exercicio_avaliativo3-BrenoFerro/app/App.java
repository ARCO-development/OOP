package app;

import dados.Cadastro;
import objetos.Receita;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    // Attributes
    private Cadastro cadastro;
    private Scanner in = new Scanner(System.in);

    // Methods
    public void inicializar() {
        cadastro = new Cadastro();
    }

    public void cyclicProgram() {
        String option = "";
        while (true)
        {
            // App run -----------------------------------------------------
            menu();
            option = getOption();
            switchOptions(option);

            if (option.equals("x") || option.equals("X"))
            {
                in.close();
                break;
            }
            // -------------------------------------------------------------
        }
    }

    public void menu() {
        System.out.println("\nMENU");
        System.out.println("x)  Sair");
        System.out.println("1)  Carregar dados abertos");
        System.out.println("2)  Classificar dados por data");
        System.out.println("3)  Consultar todos os dados");
        System.out.println("4)  Consultar dados de uma determinada data");
        System.out.println("5)  Salvar os dados da consulta em arquivo");
        System.out.print("Escolha uma opcao: ");
    }

    public String getOption() {
        String opt = in.nextLine();
        return opt;
    }

    public void switchOptions(String key) {
        switch (key) {
            // -----------------------------------------------------------------------------------------------------------------------
            case "x": // Sair
                System.out.println("...Fim do programa.");
                break;
            // -----------------------------------------------------------------------------------------------------------------------
            case "1": // Carregar arquivo
                cadastro.emptyList();
                System.out.print("Digite o nome do arquivo: ");
                String filename = getOption();
                if (cadastro.carregar_dados_abertos(filename))
                {
                    System.out.println(":) Os dados foram carregados com sucesso");
                }
                else
                {
                    System.out.println("(!) Não foi Possível carregar os dados");
                }
                break;
            // -----------------------------------------------------------------------------------------------------------------------
            case "2": // Classificar por data
                if (cadastro.size() == 0)
                    {
                        System.out.println("(!) Ainda não foi carregado nenhum dado");
                        break;
                    }
                    while (true)
                    {
                        System.out.println("1)  mais antiga -> mais nova");
                        System.out.println("2)  mais nova -> mais antiga");
                        System.out.print("Digite uma opcao: ");
                        String opt = getOption();
                        ArrayList<Receita> arrayCrescente = cadastro.classificar_dados_por_data_crescente();
                        ArrayList<Receita> arrayDecrescente = cadastro.classificar_dados_por_data_descrescente();
                        switch (opt) {
                            case "1":
                                while (true)
                                {
                                    System.out.println("\n1)  Mostrar algumas receitas");
                                    System.out.println("2)  Mostrar todas as receitas");
                                    System.out.print("Digite uma opcao: ");
                                    String option = getOption();
                                    switch (option) {
                                        case "1":
                                            for (int i = 0; i <= 10; i++)
                                            {
                                                Receita receita = null;
                                                if ((receita = arrayCrescente.get(i)) != null && receita.getNumReceita() != 0)
                                                    System.out.println(receita);
                                            }
                                            break;
                                        case "2":
                                            for (int i = 0; i < cadastro.size(); i++)
                                            {
                                                Receita receita = null;
                                                if ((receita = arrayCrescente.get(i)) != null && receita.getNumReceita() != 0)
                                                    System.out.println(receita);
                                            }
                                            break;
                                        default:
                                            System.out.println("(!) Digite uma opcao valida");
                                            break;
                                    }
                                    if (option.equals("1") || option.equals("2"))
                                    {
                                        break;
                                    }
                                }
                                break;
                            case "2":
                                while (true)
                                {
                                    System.out.println("\n1)  Mostrar algumas receitas");
                                    System.out.println("2)  Mostrar todas as receitas");
                                    System.out.print("Digite uma opcao: ");
                                    String option = getOption();
                                    switch (option) {
                                        case "1":
                                            for (int i = 0; i <= 10; i++)
                                            {
                                                Receita receita = null;
                                                if ((receita = arrayDecrescente.get(i)) != null && receita.getNumReceita() != 0)
                                                    System.out.println(receita);
                                            }
                                            break;
                                        case "2":
                                            for (int i = 0; i < cadastro.size(); i++)
                                            {
                                                Receita receita = null;
                                                if ((receita = arrayCrescente.get(i)) != null && receita.getNumReceita() != 0)
                                                    System.out.println(receita);
                                            }
                                            break;
                                        default:
                                            System.out.println("(!) Digite uma opcao valida");
                                            break;
                                    }
                                    if (option.equals("1") || option.equals("2"))
                                    {
                                        break;
                                    }
                                }
                                break;
                            default:
                                System.out.println("(!) Digite uma opcao valida");
                                break;
                        }
                        if (opt.equals("1") || opt.equals("2"))
                        {
                            break;
                        }
                    }
                    break;
            // -----------------------------------------------------------------------------------------------------------------------
            case "3": // Mostrar todos os dados
                if (cadastro.size() == 0)
                {
                    System.out.println("(!) Ainda não foi carregado nenhum dado");
                    break;
                }
                cadastro.setCountNextDadoToOne();
                while (true)
                {
                    System.out.println("\n1)  Mostrar primeiras 10 receitas");
                    System.out.println("2)  Mostrar todas as receitas");
                    System.out.print("Digite uma opcao: ");
                    String opt = getOption();
                    switch (opt) {
                        case "1":
                            for (int i = 0; i < 10; i++)
                            {
                                System.out.println(cadastro.getNextDado());
                            }
                            break;
                        case "2":
                            for (int i = 1; i < cadastro.size(); i++)
                            {
                                System.out.println(cadastro.getNextDado());
                            }
                            break;
                        default:
                            System.out.println("(!) Digite uma opcao valida");
                            break;
                    }
                    if (opt.equals("1") || opt.equals("2"))
                    {
                        break;
                    }
                }
                break;
            // -----------------------------------------------------------------------------------------------------------------------
            case "4": // Buscar por data
                if (cadastro.size() == 0)
                {
                    System.out.println("(!) Ainda não foi carregado nenhum dado");
                    break;
                }
                String date = null;
                while (true)
                {
                    System.out.print("Digite a Data (formato: yyyy-mm-dd):");
                    date = getOption();
                    if (date.length() == 10)
                    {
                        break;
                    }
                }
                ArrayList<Receita> arrayPesquisa = cadastro.consultar_dados_por_data(date);
                if (arrayPesquisa.isEmpty())
                {
                    System.out.println("Não há receitas com essa data.");
                    break;
                }
                while (true)
                {
                    System.out.println("\n1)  Mostrar primeiras 10 receitas");
                    System.out.println("2)  Mostrar todas as receitas");
                    System.out.print("Digite uma opcao:");
                    String opt = getOption();
                    switch (opt) {
                        case "1":
                            for (int i = 0; i < 9; i++)
                            {
                                System.out.println(arrayPesquisa.get(i));
                            }
                            break;
                        case "2":
                            for (int i = 0; i < cadastro.size(); i++)
                            {
                                System.out.println(arrayPesquisa.get(i));
                            }
                            break;
                        default:
                            System.out.println("(!) Digite uma opcao valida");
                            break;
                    }
                    if (opt.equals("1") || opt.equals("2"))
                    {
                        break;
                    }
                }
                arrayPesquisa = null;
                break;
            // -----------------------------------------------------------------------------------------------------------------------
            case "5": // Salvar arquivo
            if (cadastro.size() == 0)
                {
                    System.out.println("(!) Ainda não foi carregado nenhum dado");
                    break;
                }
                System.out.print("Digite o nome do arquivo:");
                String filename_save = getOption();
                if (cadastro.salvar_dados_em_arquivo(filename_save))
                {
                    System.out.println(":) Arquivo salvo.");
                }
                else
                {
                    System.out.println(":( Não foi possível salvar arquivo");
                }
                break;
            // -----------------------------------------------------------------------------------------------------------------------
            default:
                System.out.println("(!) Digite uma das opçoes disponivies.");
                break;
        }
    }


}