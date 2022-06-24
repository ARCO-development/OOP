package app;

import java.util.Scanner;

import cadastro.CadastroGeral;
import objetos.*;

public class ACMETraders {

	public void preCadastrar() {
		
		//PRÉ-CADASTRO
		CadastroGeral cg1 = new CadastroGeral();

		Participante participante1 = new Participante(1, "participante1@gmail.com");
		cg1.cadastra(participante1);
		Participante participante2 = new Participante(2, "participante2@gmail.com");
		cg1.cadastra(participante2);
		Participante participante3 = new Participante(3, "participante3@gmail.com");
		cg1.cadastra(participante3);

		cg1.cadastra(participante1.addVeiculo("Tesla", "Model X Plaid", 2022, "azul"));
		cg1.cadastra(participante1.addVeiculo("McLaren", "720s Spider", 2022, "laranja"));
		cg1.cadastra(participante1.addVeiculo("Lamborghini", "Urus", 2022, "verdeNeon"));

		cg1.cadastra(participante2.addVeiculo("Ferrari", "F8 Tributto", 2022, "vermelho"));
		cg1.cadastra(participante3.addVeiculo("Porsche", "911 Turbo S", 2022, "Cinza"));
		
		//VARIÁVEIS DE OPÇÃO
		String op = "";
		int opInt;

		//PRINT DO MENU
		do {	// <-- ITERA PROGRAMA ATÉ USUÁRIO SAIR
			System.out.println("Menu");
			System.out.println("(1) Mostrar todas as informações cadastradas");
			System.out.println("(2) Pesquisar participante pelo código");
			System.out.println("(3) Pesquisar item de troca pelo nome");
			System.out.println("(4) Sair");
			Scanner in = new Scanner(System.in);

			//GARANTE A ENTRADA STRING (op)
			do
			{
				System.out.print("opção: ");
				op = in.nextLine();
			} while (cg1.checarCodigo(op) == true || Integer.parseInt(op) < 1 ||  Integer.parseInt(op) > 4);
			opInt = Integer.parseInt(op);

			//SWITCH CASE
			switch (opInt) {
				// PESQUISAR TUDO
				case 1:
					System.out.println(cg1.pesquisaTudo());
					break;

				// PESQUISAR COM CÓDIGO
				case 2:
					String code = "";
					do {
						System.out.print("Código do Participante: ");
						code = in.nextLine();

					} while (cg1.checarCodigo(code) == true);
					
					Participante pesquisaParticipante = cg1.pesquisa(Integer.parseInt(code));
					if (pesquisaParticipante == null)
					{
						System.out.println("\n" + "------------------------------------" +
										   "\n" + "Nenhum participante encontrado com este codigo.\n");
					}
					else 
					{
						System.out.println("\n" +"------------------------------------" + 
										   pesquisaParticipante.toString());
					}
					break;

				// PESQUISAR PELO NOME
				case 3:
					String nome = "";
						
					System.out.print("Nome do Veiculo: ");
					nome = in.nextLine();
					
					Veiculo pesquisaVeiculo = cg1.pesquisa(nome);
					Participante dono = null;
					if (pesquisaVeiculo != null) 
					{
						dono = cg1.getParticipanteDonoVeiculo(pesquisaVeiculo);
					}
					
					if (pesquisaVeiculo == null)
					{
						System.out.println("\n" + "------------------------------------" +
											"\n" + "Nenhum item de troca encontrado com este nome.\n");
					}
					else 
					{
						System.out.println("\n" +"------------------------------------" +
										   "\n" + pesquisaVeiculo.toString() +
										   "[DONO]\n" + dono + "\n");
					}
					break;
					
				// Sair
				case 4:
				System.out.println("\n------------------------------------");
				System.out.println("Task Ended.\n");
				break;
			}
			//FIM DO SWITCH
		} while (opInt != 4);
	//FIM DO preCadastrar()
	}

}
