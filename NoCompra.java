public class NoCompra {

    String nomeDoProduto;
    String comprador;
    String vendedor;
    int numVendedor;
    int numComprador;
    
    float preco;
    float avaliação;
    
    NoCompra prox;
    NoCompra esq;
    NoCompra dir;


    void No(String Produto, String comprador, String vendedor, int numVendedor, int numComprador, float preco){
        this.nomeDoProduto = Produto;
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.numComprador = numComprador;
        this.numVendedor = numVendedor;
        this.preco = preco;

        this.prox = null;
    }
}
