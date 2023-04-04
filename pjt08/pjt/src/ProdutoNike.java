public class ProdutoNike implements Produto {

    public float preco;

    public ProdutoNike(){
    }

    public ProdutoNike(float preco){
        this.preco = preco;
    }

    public float getPreco(){
        return this.preco;
    }

    public String getDescricao(){
        return "OOO";
    }
}
