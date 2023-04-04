public class ProdutoAdidas extends ProdutoDecorator{
    public ProdutoAdidas(Produto produto) {
        super(produto);
    }

    public float getProdutos(){
       return 50;
    }

    @Override
    public String getNomeDescricao() {
        return null;
    }

    @Override
    public float getPreco() {
        return 0;
    }

    public String getDescricao(){
        return "Descrição";
    }
}
