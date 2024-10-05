import java.util.Scanner;

public class Pilha {

    Scanner scanner = new Scanner(System.in);
    NoProduto base;
    NoProduto topo;


    public Pilha(){
        this.base = null;
        this.topo = null;
    }
    

    void adicionar(String nomeDoVendedor, int numRegistro){
        String nomeDoProduto;
        float preco;

        System.out.println("Digite o nome do produto:");
        nomeDoProduto=scanner.nextLine();

        System.out.println("Digite o preco do produto:");
        preco=scanner.nextFloat();
        scanner.nextLine();

        NoProduto novoProduto = new NoProduto();
        novoProduto.No(nomeDoProduto, preco, nomeDoVendedor, numRegistro);
        
        if (base==null) {
            base=topo=novoProduto;
        } else {
            novoProduto.ant=topo;
            topo=novoProduto;       
        }

    }

    public void MostrarProduto(){
        if (topo!=null){
            System.out.println(topo.numVendedor+". "+topo.nomeDoVendedor+ ": "+ topo.nome + "    R$" + topo.preco);
        }
        
    }

    public NoProduto SelProduto(){
        NoProduto compra;

        if (topo==null) {
            System.out.println("A pilha esta vazia");
            return null;
        }

        compra =topo;

        if (base==topo) {
            base=topo=null;
        } else {
            topo=topo.ant;    
        }

        return compra;
    }

    

}   
