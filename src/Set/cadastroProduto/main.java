package Set.cadastroProduto;

public class main {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        CadastroProduto cadastroProduto = new CadastroProduto();

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProduto.produtoSet);

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProduto.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProduto.exibirPorPreco());

    }
}