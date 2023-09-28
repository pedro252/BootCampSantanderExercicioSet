package Set.conjuntoPalavras;

public class Main {
    public static void main(String[] args) {

        PalavrasUnicas palavrasUnicas = new PalavrasUnicas();

        palavrasUnicas.adicionarPalavra("palavra 1");
        palavrasUnicas.adicionarPalavra("palavra 2");
        palavrasUnicas.adicionarPalavra("palavra 3");

        palavrasUnicas.exibirPalavras();


        String resultado = palavrasUnicas.verificarPalavra("palavra 3");
        System.out.println(resultado);


    }
}
