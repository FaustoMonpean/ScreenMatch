import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme topGun = new Filme();
        topGun.setNome("Top Gun");
        topGun.setAnoDeLancamento(2022);
        topGun.setIncluidoNoPlano(true);
        topGun.setDuracaoEmMinutos(180);


        topGun.avalia(10);
        topGun.avalia(4);
        topGun.exibeFichaTecnica();
        System.out.println("Total de Avaliações " + topGun.getTotalDeAvaliacoes());
    }
}
