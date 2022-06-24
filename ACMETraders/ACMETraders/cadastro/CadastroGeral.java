package cadastro;
import objetos.Participante;
import objetos.Veiculo;

public class CadastroGeral {

	private Participante[] participante = new Participante[100];
	private Veiculo[] veiculo = new Veiculo[100];
	
	private int participanteCounter = 0;
	private int veiculoCounter = 0;

	public boolean cadastra(Participante novoParticipante) {
		this.participante[participanteCounter] = novoParticipante;
		participanteCounter++;
		return true;
	}

	public boolean cadastra(Veiculo item) {
		this.veiculo[veiculoCounter] = item;
		veiculoCounter++;
		return true;
	}

	public String pesquisaTudo() {
		String tudo = toString();
		return tudo;
	}

	public Participante pesquisa(int codigo) {

		Participante hold = null;
		for (int i = 0; i < participante.length; i++)
		{
			if (participante[i] == null)
			{
				return null;
			}
			else if (participante[i].getCodigo() == codigo)
			{
				hold = participante[i];
				break;
			}
		}
		return hold;
	}

	public Veiculo pesquisa(String nome) {
		
		Veiculo hold = null;

		for (int i = 0; i < veiculo.length; i++)
		{
			if (veiculo[i] == null)
			{
				return null;
			}
			else
			{
				boolean isEqual = false;
				int length1 = 0;
				int length2 = 0;
				//DECIDE MAX LENGTH COMPARISON
				if (nome.length() > veiculo[i].getMarca().length())
				{
					length1 = veiculo[i].getMarca().length();
				}
				else
				{
					length1 = nome.length();
				}
				if (nome.length() > veiculo[i].getModelo().length())
				{
					length2 =  veiculo[i].getModelo().length();
				}
				else
				{
					length2 =  nome.length();
				}
				//COMPARE
				if (nome.substring(0, length1).equalsIgnoreCase(veiculo[i].getMarca().substring(0, length1)) == true)
				{
					isEqual = true;
				}
				else if (nome.substring(0, length2).equalsIgnoreCase(veiculo[i].getModelo().substring(0, length2)) == true)
				{
					isEqual = true;
				}
				else
				{
					isEqual = false;
				}
				
				if (isEqual == true)
				{
					hold = veiculo[i];
					return hold;
				}
			}
		}
		return hold;
	}
	
	public boolean checarNome(String nome) {
		for (int i = 0; i < nome.length(); i++) 
		{
			if (nome.charAt(i) >= 48 && nome.charAt(i) <= 57)
			{
				return true;
			}
		}
		return false;
	}

	public boolean checarCodigo(String code) {
		for (int i = 0; i < code.length(); i++) 
		{
			if (code.charAt(i) >= 65 && code.charAt(i) <= 90 || code.charAt(i) >= 97 && code.charAt(i) <= 122)
			{
				return true;
			}
		}
		return false;
	}

	public Participante getParticipanteDonoVeiculo(Veiculo veiculo) {
		
		Participante dono = null;

		for (int i = 0; i < participante.length; i++)
		{
			if (participante[i] != null) {
			
				for (int j = 0; j < participante[i].getItensCounter(); j++)
				{
					if (participante[i].getVeiculo(j) != null)
					{
						if (participante[i].getVeiculo(j).equals(veiculo) == true)
						{
							dono = participante[i];
						}
					}
				}
			}
		}
		return dono;
	}

	public String toString() {
		String format = "";
		
		format += "\n------------------------------------" + "\n[Participantes] \n";
		for (int i = 0; i < participante.length; i++) 
		{
			if (participante[i] != null)
			{
				format += participante[i].toString();
			}
			else
			{
				break;
			}
		}

		format += "\n------------------------------------" + "\n[Veículos] \n\n";
		for (int j = 0; j < veiculo.length; j++) 
		{
			if (veiculo[j] != null)
			{
				format += veiculo[j].toString();
			}
			else
			{
				break;
			}
		}
		return format;
	}

}
