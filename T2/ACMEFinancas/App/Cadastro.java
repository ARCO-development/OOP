package App;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import objetos.Cobravel;

public class Cadastro {

	// Atributos de Cadastro
	private ArrayList<Cobravel> cobraveis = new ArrayList<Cobravel>();

	/**
	 * Adiciona Cobravel no cobraveis array
	 * @param item Cobravel
	 * @return boolean (true/false)
	 */
	public boolean adiciona(Cobravel item) {
		if (!containId(item.getID())) {
			cobraveis.add(item);
			return true;
		}
		return false;
	}

	/**
	 * Pesquisa itens no ArrayList cobraveis 
	 * conforme argumento nome e retorna
	 * array com todos os itens correspondentes
	 * @return Cobravel[] arrayPesquisa
	 */
	public Cobravel[] pesquisa(String nome) {
		Cobravel[] arrayPesquisa = new Cobravel[cobraveis.size()];
		int posicao = 0;
		for (int i = 0; i < cobraveis.size(); i++)
		{
			if (cobraveis.get(i).getNome().toLowerCase().contains(nome.toLowerCase()))
			{
				arrayPesquisa[posicao] = cobraveis.get(i);
				posicao++;
			}
		}
		return arrayPesquisa;
	}

	public Cobravel[] pesquisa() {
		// nao foi necessário
		return null;
	}


	/**
	 * Retorna valor do imposto de um item
	 * @param int identificador
	 * @return double valor_do_imposto
	 */
	public double calculaImpostoItem(int identificador) {
		for (int i = 0; i < cobraveis.size(); i++)
		{
			if (cobraveis.get(i).getID() == identificador)
			return cobraveis.get(i).calculaImposto();
		}
		return -1;
	}


	// Salva cobraveis cadastrados em arquivo .csv
	public void salvaArquivoTexto(String nomeArquivo) {
		String conteudo = "";
		for (int i = 0; i < cobraveis.size(); i++)
		{
			conteudo += cobraveis.get(i).toCsv() + "\n";
		}
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("csv_files/"+ nomeArquivo + ".csv"));
			writer.write(conteudo);
			writer.close();
			System.out.println("\nArquivo salvo com sucesso.");
		} catch (IOException e) {
			System.out.println("\n(!) -> Não foi possível criar arquivo (tente novamente)\n");
			e.printStackTrace();
		}
	}

	/**
	 * Retorna ArrayList cobraveis
	 * @return double valor_do_imposto
	 */
	public ArrayList<Cobravel> getArrayList() {
		return cobraveis;
	}

	/**
	 * Verifica se identificador ja existe no cabraveis
	 * @param int identificador
	 * @return boolean (true/false)
	 */
	public boolean containId(int identificador) {
		for (int i = 0; i < cobraveis.size(); i++)
		{
			if (cobraveis.get(i).getID() == identificador)
			return true;
		}
		return false;
	}
	
}
