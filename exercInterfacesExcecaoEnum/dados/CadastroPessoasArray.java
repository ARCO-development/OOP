package dados;

public class CadastroPessoasArray implements CadastroPessoas {

private final int ARRAY_SIZE = 1000;
private Pessoa[] pessoas = new Pessoa[ARRAY_SIZE];
private int count = 0;

@Override
public boolean adicionaPessoa(Pessoa p) {
    for (int i = 0; i < ARRAY_SIZE; i++) 
    {
        if (pessoas[i] == null)
        {
            pessoas[i] = p;
            count++;
            return true;
        }
    }
    return false;
}

@Override
public Pessoa consultaPorNome(String nome) {
    Pessoa pessoa = null;
    int i = 0; 
    while (pessoas[i] != null)
    {
        if (pessoas[i].getNome().equals(nome))
        {
            return pessoas[i];
        }
        i++;
    }
    return pessoa;
}

@Override
public boolean removePessoaPorNome(String nome) {
    int i = 0; 
    while (pessoas[i] != null)
    {
        if (pessoas[i].getNome().equals(nome))
        {
            pessoas[i] = null;
            count--;
            return true;
        }
        i++;
    }
    return false;
}

@Override
public int quantidadeAtual() {
    return count;
}

@Override
public void limpar() {
    for (Pessoa pessoa : pessoas) {
        if (pessoa != null)
        {
            pessoa = null;
        }
    }
    count += -count;
}

@Override
public Pessoa[] getColecao() {
    Pessoa[] copia = new Pessoa[ARRAY_SIZE];
    for (int i = 0; i < count; i++)
    {
        if (pessoas[i] != null)
        {
            copia[i] = pessoas[i];
        }
    }
    return copia;
}




}