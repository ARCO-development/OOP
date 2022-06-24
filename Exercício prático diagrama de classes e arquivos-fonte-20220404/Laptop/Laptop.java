public class Laptop extends Produto {

	private String processador;

	public Laptop(String nome, double valor, String processador) {
		super(nome, valor);
		this.processador = processador;
	}

	public double calculaImposto() {
		
		if (this.processador.equalsIgnoreCase("AMD"))
		{
			return getValor() * 0.25;
		}
		else if (this.processador.equalsIgnoreCase("Intel"))
		{
			return getValor() * 0.30;
		}
		return 1;
	}


}
