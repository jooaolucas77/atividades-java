public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("traumatiada: "+titulo);
        System.out.println("henrique e juliano: "+artista);
        System.out.println("2023: "+anoLancamento);
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        //somaDasAvaliacoes = somaDasAvaliacoes + nota;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / numAvaliacoes;

        }
    }