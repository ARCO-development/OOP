package App;
import Enum.Classe;
import Enum.Tipo;
import objetos.*;
import java.util.Scanner;

public class ACMEFinancas {

	private Cadastro cadastro = new Cadastro();
	private Scanner inputScanner = new Scanner(System.in);

	public void inicializa() {
		// Instanciacoes de Cobraveis (subclasses)
		Veiculo v1 = new Veiculo(12345, "Mustang", 20000.00, Classe.esportivo);
		Servico s1 = new Servico(45678, "Home automation", 45000.00, Tipo.pessoal);
		Servico s2 = new Servico(34567, "Cleaning Business", 650.00, Tipo.empresarial);
		Servico s3 = new Servico(23456, "Cleaning Business", 350.00, Tipo.pessoal);

		cadastro.adiciona(v1);
		cadastro.adiciona(s1);
		cadastro.adiciona(s2);
		cadastro.adiciona(s3);

	}

	// Programa cíclico de interacao com usuário
	// INICIO ------------------------------------------------------------------------------------------------------------------------------
	public void executa() {
		String op = "";
		do {
			printMenu();
			op = inputScanner.nextLine();
			switch (op) {
				case "1":
					cadastrarItem();
					break;
				case "2":
					mostrarTudo();
					break;
				case "3":
					System.out.print("Digite o nome: ");
					String nome = inputScanner.nextLine();
					pesquisaPorNome(nome);
					break;
				case "4":
					try {
						System.out.print("Digite o identificador: ");
						int id = inputScanner.nextInt();
						inputScanner.nextLine();
						calculaImpostoId(id);
					} catch (Exception e) {
						System.out.println("\n(!) -> Erro de entrada\n");
						e.printStackTrace();
						inputScanner.nextLine();
					}
					break;
				case "5":
					System.out.print("Digite nome do arquivo: ");
					String nomeArquivo = inputScanner.nextLine();
					salvarArquivo(nomeArquivo);
					break;
				case "0":
					// Sair
					break;
				default:
					System.out.println("Escolha uma opção válida (tente novamente)");
					break;
			}
		} while (!(op.equals("0")));
	}
	// FIM ------------------------------------------------------------------------------------------------------------------------------





	// Escreve menu no terminal
	public void printMenu() {
		System.out.println("\n........MENU........");
		System.out.println("(1) Cadastrar item cobrável");
		System.out.println("(2) Mostrar todas as informações do cadastro");
		System.out.println("(3) Pesquisar item por nome");
		System.out.println("(4) Calcular imposto de item");
		System.out.println("(5) Salvar arquivos de dados");
		System.out.println("(0) Sair");
	}

	// Cadastrar item no objeto cadastro
	public void cadastrarItem() {
		System.out.println("Escolha o tipo do item:");
		System.out.println("(1) Veículo");
		System.out.println("(2) Serviço");
		System.out.println("(3) Cancelar");
		String op = inputScanner.nextLine();
		switch (op) {
			case "1":
				try {	
					System.out.println("Digite ID do veículo:");
					int identificador = inputScanner.nextInt();
					System.out.println("Digite Nome do veículo:");
					inputScanner.nextLine();
					String nome = inputScanner.nextLine();
					System.out.println("Digite valor do veículo:");
					double valorBase = inputScanner.nextDouble();
					Classe classe = null;
					System.out.println("Escolha a classe do veículo:");
					System.out.println("(1) Popular");
					System.out.println("(2) Básico");
					System.out.println("(3) Esportivo");
					inputScanner.nextLine();
					String op2 = inputScanner.nextLine();
					switch (op2) {
						case "1":
							classe = Classe.popular;
							break;
						case "2":
						classe = Classe.basico;
							break;
						case "3":
							classe = Classe.esportivo;
								break;
						default:
							System.out.println("\nEscolha uma opção válida (tente novamente)\n");
							break;
					}
					Veiculo new_veiculo = new Veiculo(identificador, nome, valorBase, classe);
					if (!cadastro.adiciona(new_veiculo))
					System.out.println("\n(!) -> Não foi possível adicionar o veículo, identificador já em uso\n");
					else
					System.out.println("\nSucesso, Item cadastrado.\n");
				} catch (Exception e) {
					System.out.println("\n(!) -> Erro de entrada\n");
					e.printStackTrace();
					inputScanner.nextLine();
				}
				break;
			case "2":
				try {	
					System.out.println("Digite ID do Serviço:");
					int identificador = inputScanner.nextInt();
					System.out.println("Digite Nome do Serviço:");
					inputScanner.nextLine();
					String nome = inputScanner.nextLine();
					System.out.println("Digite valor do Serviço:");
					double valorBase = inputScanner.nextDouble();
					Tipo tipo = null;
					System.out.println("Escolha o tipo do serviço:");
					System.out.println("(1) Empresarial");
					System.out.println("(2) Pessoal");
					inputScanner.nextLine();
					String op2 = inputScanner.nextLine();
					switch (op2) {
						case "1":
							tipo = Tipo.empresarial;
							break;
						case "2":
							tipo = Tipo.pessoal;
							break;
						default:
							System.out.println("\nEscolha uma opção válida (tente novamente)\n");
							break;
					}
					Servico new_servico = new Servico(identificador, nome, valorBase, tipo);
					if (!cadastro.adiciona(new_servico))
					System.out.println("\n(!) -> Não foi possivel adicionar o serviço, identificador já em uso\n");
					else
					System.out.println("\nSucesso, Item cadastrado.\n");
				} catch (Exception e) {
					System.out.println("\n(!) -> Erro de entrada\n");
					e.printStackTrace();
					inputScanner.nextLine();
				}
				break;
			case "3":
				// Cancelar 
				break;
			default:
				System.out.println("\nEscolha uma opção válida (tente novamente)\n");
				break;
		}
	}



	// Mostra todos dos itens cadastrados e seus impostos
	public void mostrarTudo() {
		for (int i = 0; i < cadastro.getArrayList().size(); i++)
		{
			System.out.print(cadastro.getArrayList().get(i).toString());
			System.out.print("Valor do Imposto: $" + cadastro.getArrayList().get(i).calculaImposto() + "\n");

		}
	}


	// Pesquisa item por nome
	public void pesquisaPorNome(String nome) {
		Cobravel[] busca = cadastro.pesquisa(nome);
		if (busca[0] == null)
		System.out.println("\nNenhum item foi localizado com este nome.\n");
		else 
		{
			int i = 0;
			while (busca[i] != null)
			{
				System.out.println(busca[i].toString());
				System.out.print("Valor do Imposto: $" + busca[i].calculaImposto() + "\n");
				i++;
			}
		}
	}


	// Calcula imposto por identificador
	public void calculaImpostoId(int identificador) {
		double imposto = cadastro.calculaImpostoItem(identificador);
		if (imposto < 0)
		System.out.println("Nenhum item foi localizado com este identificador");
		else
		System.out.println("Valor do Imposto: $" + imposto);
	}

	public void salvarArquivo(String nomeArquivo) {
		cadastro.salvaArquivoTexto(nomeArquivo);
	}

}
