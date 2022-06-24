package objetos;

public class Veiculo {

	private String marca;
	private String modelo;
	private int ano;
	private String cor;

	public Veiculo() 
	{
		this.marca = "desconhecido";
		this.modelo = "desconhecido";
		this.ano = 0;
		this.cor = "desconhecido";
	}

	public Veiculo(String marca, String modelo, int ano, String cor) 
	{
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}


	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public String getCor() {
		return cor;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String toString() {
		String format = "";
		format = "VEÍCULO\n" +
				 "Marca: " + marca + "\n" +
				 "Modelo: " + modelo + "\n" +
				 "Ano: " + ano + "\n" + 
				 "Cor: " + cor + "\n\n";
		return format;
	}

}
