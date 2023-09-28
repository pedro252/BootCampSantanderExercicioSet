package Set.agendaContatos;

public class Main {

        public static void main(String[] args) {
            AgendaContato agendaContato = new AgendaContato();

            agendaContato.adicionarContato("Pedro", 169923034);
            agendaContato.adicionarContato("Lucas", 1699230435);
            agendaContato.adicionarContato("Maria Clara", 16923034);
            agendaContato.adicionarContato("Francisco", 169923034);
            agendaContato.adicionarContato("Ana Claudia", 1699230-23);
            agendaContato.adicionarContato("Nalanda", 16923012);

            agendaContato.exibirContato();

            System.out.println(agendaContato.PesquisarPorNome("Nalanda"));
        }
}
