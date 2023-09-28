package Set.conjuntoPalavras;

import java.util.HashSet;
import java.util.Set;

public class PalavrasUnicas {

    private Set<Palavras> palavrasSet;

    public PalavrasUnicas(){
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(new Palavras(palavra));
    }

    public void removerPalavra(String palavra){
        Palavras palavraParaRemover = null;

        for (Palavras p : palavrasSet){
            if (p.getPalavra() == palavra){
                palavraParaRemover = p;
                break;
            }else
                System.out.println("Esta palavra nao existe");
        }

        palavrasSet.remove(palavraParaRemover);
    }

    public String verificarPalavra(String palavra) {
        Palavras palavraExiste = null;

        for (Palavras p : palavrasSet) {
            if (p.getPalavra().equals(palavra)) {
                palavraExiste = p;
                break;
            }
        }
        return "Esta palavra tem em nossa lista: " + palavraExiste;
    }

    public void exibirPalavras() {
        for (Palavras p : palavrasSet) {
            System.out.println(p.getPalavra());
        }
    }



}
