public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo()+limite)
        {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", limite= R$ " + limite; 
    }
}