package Set.conjuntoPalavras;

public class Palavras {
    private String palavra;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public Palavras(String palavra) {
        this.palavra = palavra;
    }

    @Override
    public String toString() {
        return "Palavras{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}
