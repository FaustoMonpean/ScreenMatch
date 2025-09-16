import br.com.alura.screenmatch.modelos.Filme;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        boolean menu = true;
        int resposta;
        while (menu){
            System.out.println("""
                    [ 1 ] Cadastrar Filme
                    [ 2 ] Exibir Filmes
                    [ 3 ] Avaliar Filme
                    [ 0 ] Finalizar Programa
                    
                    Digite a opção desejada
                    """);
            resposta = scan.nextInt();

            switch (resposta){
                case 0:
                    menu = false;
                    System.out.println("Finalizando o Sistema");
                    break;
                case 1:
                    System.out.println("Digite o nome do Filme: ");
                    String nome = scan.next();
                    System.out.println("Digite o nome do diretor: ");
                    String diretor = scan.next();
                    System.out.println("Digite o ano do lançamento: ");
                    int ano = scan.nextInt();
                    System.out.println("Digite a duração em minutos: ");
                    int duracao = scan.nextInt();
                    Filme novoFilme = new Filme(nome, diretor, ano, duracao);
                    listaDeFilmes.add(novoFilme);
                    break;
                case 2:
                    for (Filme f : listaDeFilmes) {
                        System.out.println(String.format("""
                                Filme: %s
                                Diretor: %s
                                Ano: %s
                                Duração: %s minutos
                                Avaliação: %s
                                """, f.getNome(), f.getDiretor(), f.getAnoDeLancamento(), f.getDuracaoEmMinutos(), f.getClassificacao()));
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do filme que deseja avaliar");
                    String avaliar = scan.next();
                    for (Filme f : listaDeFilmes) {
                        if (f.getNome().contains(avaliar)){
                            System.out.println(String.format("Digite a nota que deseja dar para %s",avaliar));
                            int nota = scan.nextInt();
                            f.avalia(nota);
                        } else {
                            System.out.println("O filme não se encontra na lista.");
                        }
                        break;
                    }

            }
        }



//        Filme topGun = new Filme();
//        topGun.setNome("Top Gun");
//        topGun.setAnoDeLancamento(2022);
//        topGun.setIncluidoNoPlano(true);
//        topGun.setDuracaoEmMinutos(180);
//
//        Serie vikings = new Serie();
//        vikings.setNome("Vikings");
//        vikings.setAnoDeLancamento(2014);
//        vikings.setIncluidoNoPlano(true);
//        vikings.setMinutosPorEpisodio(60);
//        vikings.setEpisodiosPorTemporada(8);
//        vikings.setTemporadas(7);
//
//        topGun.avalia(10);
//        topGun.avalia(4);
//        topGun.exibeFichaTecnica();
//        System.out.println("Total de Avaliações " + topGun.getTotalDeAvaliacoes());
//
//        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
//
//        calculadora.inclui(topGun);
//        calculadora.inclui(vikings);
//        System.out.println(calculadora.getTempoTotal());
//
//        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(topGun);


    }
}
