public class Carro {
    private String placa;
    private double valor;
    private int ano;

    public Carro(String placa, double valor, int ano) {
        this.placa = placa;
        this.valor = valor;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public double getValor() {
        return valor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", valor=" + valor +
                ", ano=" + ano +
                '}';
    }
}
