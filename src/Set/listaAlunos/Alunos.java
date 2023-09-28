package Set.listaAlunos;

import java.util.Comparator;

public class Alunos implements Comparator<Alunos> {

    private String nome;
    private Long Matricula;
    private double media;

    public Alunos(String nome, Long matricula, double media) {
        this.nome = nome;
        Matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return Matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(Long matricula) {
        Matricula = matricula;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", Matricula=" + Matricula +
                ", media=" + media +
                '}';
    }

    @Override
    public int compare(Alunos m1, Alunos m2) {
        return Double.compare(m1.getMedia(), m2.getMedia());
    }
}
