package Set.agendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contatos> contatosSet;

    public AgendaContato() {
        this.contatosSet = new HashSet<>();
    }
        public void adicionarContato(String nome, int contato){
        contatosSet.add(new Contatos(nome, contato));
        }

        public void exibirContato(){
        System.out.println(contatosSet);
        }

        public Set<Contatos> PesquisarPorNome(String nome){
        Set<Contatos> contatosPorNome = new HashSet<>();

        for (Contatos c: contatosSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
        }

        public Contatos atualizarNumeroContato(String nome, int novoNumero){
            Contatos contatoAtualizado = null;

            for (Contatos c: contatosSet){
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        }

}
