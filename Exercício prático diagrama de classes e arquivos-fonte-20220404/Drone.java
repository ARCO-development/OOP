public class Drone extends Produto {
    
    private int  numHelice;

    public Drone(String nome, double valor, int numHelice) {
        super(nome, valor);
        this.numHelice = numHelice;
    }

    @Override
    public double calculaImposto() {
        return 0;
    }
}