package Set.cadastroProduto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    Set<Produto> produtoSet;

    public CadastroProduto (){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto (String nome, long codigo, double preco, int quatidade){
        produtoSet.add(new Produto(nome,codigo, preco, quatidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> mostrarProdutoNome = new TreeSet<>(produtoSet);

        return mostrarProdutoNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;

    }


}
