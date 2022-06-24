package exercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeituraArquivoTexto {

    /**
     * Le as linhas do arquivo-texto e apresenta-as na tela
     */
    public void leArquivoTexto() {
        Path path = Paths.get("NOMES.TXT");
        try (BufferedReader br = Files.newBufferedReader(path, Charset.defaultCharset())) {
            String linha;
            linha = br.readLine();
            while(linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro de E/S: " + e);
        }
    }
}
