package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculo.Classificavel;
import java.util.Scanner;

public class Filme extends Titulo implements Classificavel {
    private String diretor;
    Scanner scan = new Scanner(System.in);

    public Filme(String nomeFilme, int ano){
        super(nomeFilme, ano);
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

    @Override
    public String toString() {
        return "Título: "+nome+" Ano de Lançamento: "+anoDeLancamento+" Avaliação: "+getClassificacao();
    }
}