public class NoProduto {

    String nome;
    String nomeDoVendedor;

    int numVendedor;
    
    float preco;
    
    NoProduto ant;


    public void No(String nome, float preco, String nomeDoVendedor, int numVendedor){
        
        this.numVendedor=numVendedor;
        this.nome=nome;
        this.preco=preco;
        this.nomeDoVendedor=nomeDoVendedor;

        this.ant=null;
    }
}