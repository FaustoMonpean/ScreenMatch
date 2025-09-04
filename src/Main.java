public class Main {
    public static void main(String[] args) {
        Filme topGun = new Filme();
        topGun.nome = "Top Gun";
        topGun.anoDeLancamento = 2022;
        topGun.incluidoNoPlano = true;
        topGun.duracaoEmMinutos = 180;

        topGun.avalia(10);
        topGun.avalia(4);
        topGun.exibeFichaTecnica();
    }
}
