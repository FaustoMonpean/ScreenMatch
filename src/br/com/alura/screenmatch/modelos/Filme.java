public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDeAvaliacao;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
     return totalDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Filme: "+nome);
        System.out.println("Ano: "+anoDeLancamento);
        System.out.println("Duração: "+duracaoEmMinutos+" minutos");
        System.out.println("Nota: "+ somaDeAvaliacao/totalDeAvaliacoes);
        if (incluidoNoPlano){
            System.out.println("Status: Disponível no seu plano!");
        } else {
            System.out.println("Status: Indisponível no plano atual.");
        }
    }
    void avalia(double nota){
        somaDeAvaliacao += nota;
        totalDeAvaliacoes ++;
    }
}