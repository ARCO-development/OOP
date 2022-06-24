import java.util.Scanner;

public class ACMEAuto {
    private Frota frota;
    private Scanner entrada;

    public ACMEAuto(){
        frota = new Frota();
        entrada = new Scanner(System.in);
    }

    public void executa(){
        apresentaMenu();
        String opcao = entrada.nextLine();
        switch(opcao) {
            case "0": break;
            case "1": mostrarTodosCarros();
        }
    }

    private void mostrarTodosCarros(){
        System.out.println(frota.consultaTodosCarros());
    }

    private void apresentaMenu(){
        System.out.println("Opcoes: ");
        System.out.println("[0] Sair do sistema");
        System.out.println("[1] Mostra todos os carros");
        System.out.print("Opcao desejada: ");
    }

    public void teste(){
        System.out.println("Estou vivo!");

        if(frota.criarCarro("AAA-1A11", 11111.11,2011))
        {
            System.out.println("Sucesso!");
            System.out.println(frota.consultaTodosCarros());
        }
        else
        {
            System.out.println("Erro!");
        }

        if(frota.criarCarro("BBB-1A11", 11111.11,2011))
        {
            System.out.println("Sucesso!");
            System.out.println(frota.consultaTodosCarros());
        }
        else
        {
            System.out.println("Erro!");
        }

    }
}
