package Stream_API;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ArquivoTxt {
    public static void main(String[] args) {

        // caminho do arquivo
        String caminhoArquivo = "myFile.txt";


        // Tentativa de abrir o arquivo e contar linhas + uso da Exception
        try (Stream<String> lines = Files.lines(Paths.get(caminhoArquivo),Charset.defaultCharset())){
            long numbersLines = lines.count();
            System.out.println("Número de linhas: " + numbersLines);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
