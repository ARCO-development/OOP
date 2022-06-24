/**
 * Classe abstrata de produto com atributos e metodos obrigatorios
 */
public abstract class Produto {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Calcula o valor do imposto do produto
     * @return valor de imposto do produto
     */
    public abstract double calculaImposto();

    @Override
    public String toString() {
        return "Nome=" + nome +
                ", Valor=R$ " + valor +
                ", Imposto=R$ " + calculaImposto();
    }

}
