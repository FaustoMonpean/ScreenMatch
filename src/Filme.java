public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDeAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

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
        totalDeAvaliacoes += 1;
    }
}