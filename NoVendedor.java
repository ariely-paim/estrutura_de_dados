public class NoVendedor {
    String nome;
    
    String CPF;
    int numRegistro;
    
    NoVendedor prox;
    NoVendedor ant;

    Pilha Produtos= new Pilha();


    public void No(String nome, String CPF, int numRegistro){

        this.nome=nome;
        this.CPF=CPF;
        this.numRegistro=numRegistro;

        this.prox=null;
        this.ant=null;


    }

    
    public void AdicionarProduto(){
        Produtos.adicionar(nome, numRegistro);
    }

    public NoProduto SelecionarProduto(){
        NoProduto produto = new NoProduto();
        produto= Produtos.SelProduto();
        return produto;
    }

}
