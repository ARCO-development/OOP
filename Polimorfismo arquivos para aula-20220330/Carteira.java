public class Carteira {
    private final int MAX = 100;
    private Conta[] cadastro;
    private int contadorContas;

    public Carteira() {
        cadastro = new Conta[MAX];
        contadorContas = 0;
    }

    public boolean addConta(Conta conta) {
        if(contadorContas < MAX) {
            cadastro[contadorContas] = conta;
            contadorContas++;
            return true;
        }
        return false;
    }

    public Conta consultaConta(int numero) {
        for(int i=0; i<contadorContas; i++) {
            Conta aux = cadastro[i];
            if(aux.getNumero() == numero)
                return aux;
        }
        return null;
    }

    public String consultaTudo() {
        String txt = "";
        for(int i=0; i<contadorContas; i++) {
            Conta c = cadastro[i];
            txt += c.toString() + "\n";
        }
        return txt;
    }

}
