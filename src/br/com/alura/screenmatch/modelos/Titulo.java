package br.com.alura.screenmatch.modelos;

public class Titulo {
    protected String nome;
    protected int anoDeLancamento;
    protected boolean incluidoNoPlano;
    private double somaDeAvaliacao;
    private int totalDeAvaliacoes;
    protected int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDeAvaliacao() {
        return somaDeAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void exibeFichaTecnica(){
        System.out.println("br.com.alura.screenmatch.modelos.Filme: "+nome);
        System.out.println("Ano: "+anoDeLancamento);
        System.out.println("Duração: "+duracaoEmMinutos+" minutos");
        System.out.println("Nota: "+ somaDeAvaliacao/totalDeAvaliacoes);
        if (incluidoNoPlano){
            System.out.println("Status: Disponível no seu plano!");
        } else {
            System.out.println("Status: Indisponível no plano atual.");
        }
    }
    public void avalia(double nota){
        somaDeAvaliacao += nota;
        totalDeAvaliacoes ++;
    }
    public double pegaMedia(){
        return somaDeAvaliacao / totalDeAvaliacoes;
    }
}
