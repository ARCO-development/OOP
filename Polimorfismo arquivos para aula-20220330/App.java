public class App {

    private Carteira carteira;

    public App() {
        carteira = new Carteira();
    }

    public void executar() {
        Conta conta;
        conta = new Conta(1,1000.00);
        carteira.addConta(conta);
        conta = new Conta(2,2000.00);
        carteira.addConta(conta);
        conta = new Conta(3,3000.00);
        carteira.addConta(conta);
        System.out.println("Contas cadastradas: ");
        System.out.println(carteira.consultaTudo());
        System.out.println("===========================");
        conta = carteira.consultaConta(2);
        if(conta != null)
            conta.sacar(2000.00);
        System.out.println("Contas cadastradas: ");
        System.out.println(carteira.consultaTudo());
        System.out.println("===========================");

        ContaEspecial ce = new ContaEspecial(4, 4000,  4000);
        System.out.println(ce);
        ce.sacar(6000.00);
        System.out.println(ce);

        System.out.println("===========================");
        System.out.println();
        carteira.addConta(ce);
        System.out.println("Contas cadastradas");
        System.out.println(carteira.consultaTudo());


    }
}
