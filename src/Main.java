import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;

public class Main {
    public static void main(String[] args) {

        Filme topGun = new Filme();
        topGun.setNome("Top Gun");
        topGun.setAnoDeLancamento(2022);
        topGun.setIncluidoNoPlano(true);
        topGun.setDuracaoEmMinutos(180);

        Serie vikings = new Serie();
        vikings.setNome("Vikings");
        vikings.setAnoDeLancamento(2014);
        vikings.setIncluidoNoPlano(true);
        vikings.setMinutosPorEpisodio(60);
        vikings.setEpisodiosPorTemporada(8);
        vikings.setTemporadas(7);

//        topGun.avalia(10);
//        topGun.avalia(4);
//        topGun.exibeFichaTecnica();
//        System.out.println("Total de Avaliações " + topGun.getTotalDeAvaliacoes());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(topGun);
        calculadora.inclui(vikings);
        System.out.println(calculadora.getTempoTotal());
    }
}
