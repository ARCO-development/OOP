/**
 * Classe da aplicacao
 */
public class ACMEImport {
    // Estoque de produtos importados
    private Estoque estoque;

    /**
     * Construtor da aplicacao
     */
    public ACMEImport() {
        estoque = new Estoque(1000);
    }

    /**
     * Execucao da aplicacao
     */
    public void executaAplicacao() {
        cadastraAlgunsProdutos();
        System.out.println("Produtos cadastrados: ");
        System.out.println(estoque.consultaTudo());
    }

    /**
     * Cadastramento previo de alguns produtos no estoque
     */
    private void cadastraAlgunsProdutos() {
        System.out.println("Cadastrando alguns produtos...");

    }

}
