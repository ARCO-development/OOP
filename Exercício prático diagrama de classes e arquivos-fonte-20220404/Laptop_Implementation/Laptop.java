public class Laptop extends Produto {

	private String processador;

	public Laptop(String nome, double valor, String processador) {
		super(nome, valor);
		this.processador = processador;
	}

	public double calculaImposto() {
		
		double imposto = 0;
		
		if (this.processador.equalsIgnoreCase("AMD"))
		{
			imposto = getValor() * 0.25;
		}
		else if (this.processador.equalsIgnoreCase("Intel"))
		{
			imposto = getValor() * 0.30;
		}
		return imposto;
	}


}
