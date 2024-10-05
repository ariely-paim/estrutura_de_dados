public class NoConsumidor {

    String nome;
    
    String CPF;
    int numRegistro;
    
    NoConsumidor prox;
    NoConsumidor ant;

    Fila Compras= new Fila();


    public void No(String nome, String CPF, int numRegistro){


        this.nome=nome;
        this.CPF=CPF;
        this.numRegistro=numRegistro;

        this.prox=null;
        this.ant=null;
    }

    void FazerCompra(NoProduto produto){
        Compras.Comprar(produto, numRegistro, nome);
    }

}   