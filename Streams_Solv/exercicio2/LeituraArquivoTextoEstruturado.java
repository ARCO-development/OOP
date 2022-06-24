package exercicio2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LeituraArquivoTextoEstruturado {

    /**
     * Le campos do arquivo-texto e apresenta-os linha a linha
     * @param nomeArquivo Nome do arquivo-texto
     */
    public void leArquivoTextoEstruturado(String nomeArquivo) {
        Path path = Paths.get(nomeArquivo);
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, Charset.defaultCharset()))) {
            String pal = null;
            sc.useDelimiter("[:\\n]"); // separadores: ';' e 'nova linha'
            while (sc.hasNext()) {
                pal = sc.next();
                System.out.println(pal);
            }
        }
        catch (IOException e) {
            System.err.format("Erro de E/S: %s%n", e);
        }
    }
}
