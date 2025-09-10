package br.com.alura.screenmatch.calculo;

public class FiltroRecomendacao {
    public void filtra(Classificavel c){
        if (c.getClassificacao()>=4){
            System.out.println("Recomendado");
        } else {
            System.out.println("Não recomendado");
        }
    }
}
