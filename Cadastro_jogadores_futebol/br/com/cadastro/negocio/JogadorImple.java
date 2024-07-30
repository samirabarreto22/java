package Cadastro_jogadores_futebol.br.com.cadastro.negocio;

import Cadastro_jogadores_futebol.br.com.cadastro.model.Jogador;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JogadorImple {

    
    public boolean verificarArquivoExiste(Path caminho){
        boolean ret = false;

        try {
            Stream<Path> stream = Files.list(caminho);
            Optional<Path> arq = stream.filter(p -> p.toString().endsWith("jogadores.txt")).findAny();
            ret = arq.isPresent(); // informa se o arquivo esta presente
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return ret;

    }

    public List<Jogador> getListaDeJogadores(Path caminho) throws IOException {
        Stream<String> linhas = Files.lines(caminho, StandardCharsets.ISO_8859_1);
        List<String> listaDeLinhas = linhas.collect(Collectors.toList());
        List<Jogador> listaDeJogadores = new ArrayList<>();
        Jogador jogador;
        Iterator it = listaDeLinhas.listIterator();
        String str = null;
                while (it.hasNext()){
                    str = (String) it.next();

                    String info[] = str.split(","); // divide a linha em partes usando a virgula
                    
                    jogador = new Jogador();
                    jogador.setNome(info[0]);
                    jogador.setPosicao(info[1]);
                    jogador.setIdade(Integer.parseInt(info[2]));
                    jogador.setTimeAtual(info[3]);
                    jogador.setGoalsMarcados(Integer.parseInt(info[4]));
                    listaDeJogadores.add(jogador);

                }
                return listaDeJogadores;
    }

    public void imprimirJogadores(List<Jogador> jogadores){
        jogadores.stream().forEach(System.out::println);
    }

    public void imprimirJOgadoresTime(List<Jogador> jogadores, String time){
        jogadores.stream()
        .filter(jogador -> jogador.getTimeAtual().equals(time))
        .forEach(System.out::println);
    }

    public void imprimirJogadoresTimeGoals(List<Jogador> jogadores, String time){
        jogadores.stream()
        .filter(jogador -> jogador.getTimeAtual().equals(time) && jogador.getGoalsMarcados() > 10)
        .forEach(System.out::println);
    }

    public void agruparJogadoresPorTime(List<Jogador> jogadores){
        jogadores.stream()
        .sorted(Comparator.comparing(Jogador::getTimeAtual))
        .forEach(System.out::println);

    }

    public double calcularMediaIdade(List<Jogador>jogadores){
        return jogadores.stream()
        .mapToInt(Jogador::getIdade)
        .average()
        .getAsDouble();
    }

    public void imprimirJogadorMaisVelho(List<Jogador> jogadores){
        Jogador jogador = jogadores.stream()
        .max(Comparator.comparingInt(Jogador::getIdade))
        .get();
    }

    public void imprimirJogadorMaisNovo(List<Jogador> jogadores){
        Jogador jogador = jogadores.stream()
        .min(Comparator.comparingInt(Jogador::getIdade))
        .get();
        System.out.println("Jogador mais novo: " + jogador.getNome());

    }

    public void imprimirJogadorArtilheiro(List<Jogador> jogadores){
        Jogador jogador = jogadores.stream()
        .max(Comparator.comparingInt(Jogador::getGoalsMarcados))
        .get();
        System.out.println("Jogador Artilheiro: " + jogador.getNome());
    }

    public int imprimirSomatorio(List<Jogador> jogadores){
        return jogadores.stream()
        .mapToInt(Jogador::getGoalsMarcados)
        .sum();
    }

    public void agruparJogadoresPeloTime(List<Jogador> jogadores){
        Map<String, List<Jogador>> groupBytime = jogadores.stream()
        .collect(Collectors.groupingBy(Jogador::getTimeAtual));

        System.out.println(groupBytime);
    }

    public void ordenarJogadoresGoals(List<Jogador> jogadores){
        jogadores.stream()
        .sorted(Comparator.comparingInt(Jogador::getGoalsMarcados).reversed())
        .forEach(System.out::println);
    }
}



