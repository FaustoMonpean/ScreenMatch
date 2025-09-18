package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalListas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        boolean menu = true;
        int resposta;
        while (menu){
            System.out.println("""
                    [ 1 ] Cadastrar Filme
                    [ 2 ] Exibir Títulos
                    [ 3 ] Avaliar Título
                    [ 4 ] Cadastrar Série
                    [ 0 ] Finalizar Programa
                    
                    Digite a opção desejada
                    """);
            resposta = scan.nextInt();
            scan.nextLine();

            switch (resposta){
                case 0:
                    menu = false;
                    System.out.println("Finalizando o Sistema");
                    break;
                case 1:
                    System.out.println("Digite o nome do Filme: ");
                    String nome = scan.nextLine();
                    System.out.println("Digite o ano do lançamento: ");
                    int ano = scan.nextInt();
                    Filme novoFilme = new Filme(nome, ano);
                    listaDeFilmes.add(novoFilme);
                    break;
                case 2:
                    for (Titulo f : listaDeFilmes) {
                        System.out.println(f.toString());
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do Título que deseja avaliar");
                    String avaliar = scan.nextLine();
                    for (Titulo f : listaDeFilmes) {
                        if (f.getNome().contains(avaliar)){
                            System.out.println(String.format("Digite a nota que deseja dar para %s",avaliar));
                            int nota = scan.nextInt();
                            f.avalia(nota);
                            break;
                        } else {
                            System.out.println("O filme não se encontra na lista.");
                            scan.nextLine();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome da Série: ");
                    String nomeSerie = scan.nextLine();
                    System.out.println("Digite o ano do lançamento: ");
                    int anoSerie = scan.nextInt();
                    Serie novaSerie = new Serie(nomeSerie, anoSerie);
                    listaDeFilmes.add(novaSerie);
                    break;
            }
        }
    }
}
