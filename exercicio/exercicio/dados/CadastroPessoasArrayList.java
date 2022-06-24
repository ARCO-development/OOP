import java.util.ArrayList;

public class CadastroPessoasArrayList implements CadastroPessoas{

    private ArrayList<Pessoa> pessoas = new ArrayList<>(); 

    /**
     * Adiciona uma nova pessoa na colecao
     * @param p Pessoa a ser adicionada
     * @return true de houve insercao, false em caso contrario
     */
    public boolean adicionaPessoa(Pessoa p) {

    }


    /**
     * Consulta pessoa com o nome indicado
     * @param nome nome da pessoa a ser consultada
     * @return Pessoa com o nome indicado, null em caso contrario
     */
    public Pessoa consultaPorNome(String nome) {

    }


    /**
     * Remove pessoa com o nome indicado
     * @param nome nome da pessoa a ser removida
     * @return true se houve remocao, false em caso contrario
     */
    public boolean removePessoaPorNome(String nome) {

    }


    /**
     * Consulta a quantidade de pessoas cadastradas
     * @return quantidade de pessoas cadastradas
     */
    public int quantidadeAtual() {
        return pessoas.size();
    }


    /**
     * Remove todas as pessoas cadastradas
     */
    public void limpar() {

    }


    /**
     * Consulta colecao de pessoas
     * @return copia da colecao de pessoas
     */
    public Pessoa[] getColecao() {

    }
}