import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Musica minhaMusica= new Musica();
        minhaMusica.titulo ="traumatizada";
        minhaMusica.artista ="henrique e juliano";
        minhaMusica.anoLancamento =2023;

        minhaMusica.exibeFichaTecnica();
        minhaMusica.avalia(4.5);
        minhaMusica.avalia( 3.5);
        minhaMusica.avalia(5.0);
        double mediaAvalicoes = minhaMusica.pegaMedia();
        System.out.println ("meia ds avaliçoes:");
        System.out.println (mediaAvalicoes);


    }
}
