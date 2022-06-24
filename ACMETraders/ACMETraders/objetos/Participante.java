package objetos;

public class Participante {

	private int codigo;
	private String email;
	private Veiculo[] itens = new Veiculo[100];
	private int itensCounter = 0;

	public Participante() {
		this.codigo = 0;
		this.email = "";
	}

	public Participante(int codigo, String email) {
		this.codigo = codigo;
		this.email = email;
	}

	public Veiculo addVeiculo(String marca, String modelo, int ano, String cor) {
		Veiculo veiculo = new Veiculo(marca, modelo, ano, cor);
		this.itens[itensCounter] = veiculo;
		itensCounter++;
		return veiculo;
	}

	public int getItensCounter() {
		return itensCounter;
	}

	public Veiculo getVeiculo(int i) {
		return itens[i];
	}

	public String getMarcaItem(int i) {
		return itens[i].getMarca();
	}

	public String getModeloItem(int i) {
		return itens[i].getModelo();
	}

	public int getCodigo() {
		return codigo;
	}

	public String getEmail() {
		return email;
	}


	public String toString() {
		String format = "";
		format = "\nPARTICIPANTE\n" +
				 "Código: " + codigo + "\n" +
				 "Email: " + email + "\n";
		return format;
	}

}
