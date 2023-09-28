package Set.listaAlunos;

import java.util.*;

public class ListaAlunos {

    private Set<Alunos> alunosSet;

    public ListaAlunos(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Alunos alunoParaRemover = null;

        for (Alunos a : alunosSet){
            if (a.getMatricula() == matricula){
                alunoParaRemover = a;

                break;
            } else   System.out.println("Esta matricula nao existe");
        }
        alunosSet.remove(alunoParaRemover);
    }

    public void mostrarAlunos(){
        System.out.println(alunosSet);
    }

    public List<Alunos> ordenarAlunosPorNome(){
        List<Alunos> listaOrdenada = new ArrayList<>(alunosSet);

        Collections.sort(listaOrdenada, new Comparator<Alunos>() {
            @Override
            public int compare(Alunos aluno1, Alunos aluno2) {
                return aluno1.getNome().compareTo(aluno2.getNome());
            }
        });

        return listaOrdenada;
    }

    public Set<Alunos> ordenaPorMedia() {
        TreeSet<Alunos> alunosOrdenadosPorMedia = new TreeSet<>(new Comparator<Alunos>() {
            @Override
            public int compare(Alunos aluno1, Alunos aluno2) {
                return Double.compare(aluno1.getMedia(), aluno2.getMedia());
            }
        });

        alunosOrdenadosPorMedia.addAll(alunosSet);

        return alunosOrdenadosPorMedia;
    }


}

