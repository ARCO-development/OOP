package exercicio3;

import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.Scanner;

public class App {
    private ProcessaArquivosTextoEstruturados arquivos;

    public App() {
        arquivos = new ProcessaArquivosTextoEstruturados();
    }

    public void executa() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o codigo do cliente: ");
        String codigo = entrada.nextLine();
        boolean achou = false;
        try {
            achou = arquivos.leArquivoTextoEstruturado(codigo);
        }
        catch (IOException e) {
            System.err.format("Erro de leitura do arquivo de clientes: %s%n", e);
        }
        if(achou) {
            double somatorio=0;
            try {
                somatorio = arquivos.consultaSomatorioVendas(codigo);
                System.out.println("Somatorio de vendas do cliente: " + somatorio);
                arquivos.gravaArquivoTexto(codigo,somatorio);
            }
            catch(NumberFormatException e) {
                System.err.format("Erro de formato de dado: %s%n", e);
            } catch(FileSystemException e) {
                System.err.format("Erro de gravacao do arquivo de relatorio: %s%n", e);
            } catch (IOException e) {
                System.err.format("Erro de leitura do arquivo de vendas: %s%n", e);
            }
        }
        else System.out.println("Codigo de cliente invalido.");
    }
}
