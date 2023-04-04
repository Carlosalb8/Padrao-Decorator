public abstract class ProdutoDecorator implements Produto{

    private Produto produto;

    public String descricao;

    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void SetProduto(Produto produto){
        this.produto = produto;
    }

    public abstract float getProdutos();

    public float getPrecoProduto(){
        return this.produto.getPreco() + 50;
    }

    public abstract String getNomeDescricao();

    public String getDescricao(){
        String var10000 = this.produto.getDescricao();
        return var10000 = "/" + this.getNomeDescricao();
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}
