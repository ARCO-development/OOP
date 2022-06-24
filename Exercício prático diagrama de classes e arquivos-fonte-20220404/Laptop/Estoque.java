/**
 * Classe catalogos de produtos
 */
public class Estoque {
    private Produto[] produtos;
    private int contaProdutos;
    private int quantidadeMaxima;

    /**
     * Construtor com quantidade maxima definida
     * @param quantidade Quantidade maxima de produtos
     */
    public Estoque(int quantidade) {
        quantidadeMaxima = quantidade;
        produtos = new Produto[quantidadeMaxima];
        contaProdutos = 0;
    }

    /**
     * Construtor vazio
     * Cria um estoque para ate 100 produtos
     */
    public Estoque() {
        quantidadeMaxima = 100;
        produtos = new Produto[quantidadeMaxima];
        contaProdutos = 0;
    }

    /**
     * Adiciona um novo produto no estoque
     * @param produto Novo produto
     */
    public void adicionaProduto(Produto produto) {
        if (contaProdutos < quantidadeMaxima) {
            produtos[contaProdutos] = produto;
            contaProdutos++;
        }
    }

    /**
     * Monta uma String com todos os dados dos produtos
     * @return String com os dados dos produtos
     */
    public String consultaTudo() {
        String texto = "";
        for(int i=0; i< contaProdutos; i++) {
            Produto p = produtos[i];
            texto += p.toString() + '\n';
        }
        return texto;
    }

}
