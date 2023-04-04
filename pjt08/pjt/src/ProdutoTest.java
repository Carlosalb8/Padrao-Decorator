import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ProdutoTest {

    ProdutoTest(){
    }

    @org.junit.jupiter.api.Test
    void deveRetornarPrecoN(){
        Produto produto = new ProdutoNike(50);
        Assertions.assertEquals(50, produto.getPreco());
    }

    @Test
    void deveRetornarPrecoA(){
        Produto produto = new ProdutoNike(80);
        Assertions.assertEquals(80, produto.getPreco());
    }


    




}
