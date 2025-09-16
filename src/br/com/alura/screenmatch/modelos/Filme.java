package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculo.Classificavel;
import java.util.Scanner;

public class Filme extends Titulo implements Classificavel {
    private String diretor;
    Scanner scan = new Scanner(System.in);

    public Filme(String nomeFilme, String nomeDiretor, int ano, int duracao){
        this.setNome(nomeFilme);
        this.setDiretor(nomeDiretor);
        this.setAnoDeLancamento(ano);
        this.setDuracaoEmMinutos(duracao);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }
}