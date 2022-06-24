package exercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeituraArquivoTexto {

    public void leArquivoTexto() {
        Path path1 = Paths.get("NOMES.TXT");

        try {
            BufferedReader buffer = Files.newBufferedReader(path1, StandardCharsets.UTF_8);

            String line = null;
            while ((line = buffer.readLine()) != null)
            {
                System.out.println(line);
            }
            buffer.close();

        } catch (IOException e) {
            e.getMessage();
        }

    }




}
