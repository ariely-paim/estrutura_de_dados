import java.util.Scanner;

public class Fila {
    Scanner scanner = new Scanner(System.in);

    NoCompra inicio;
    NoCompra fim;
    ArvoreCompras arvoreCompras;

    public Fila() {
        this.inicio = null;
        this.fim = null;
        this.arvoreCompras = new ArvoreCompras();
    }

    void Comprar(NoProduto produto, int numComprador, String nomeConsumidor) {
        NoCompra compra = new NoCompra();

        compra.comprador = nomeConsumidor;
        compra.numComprador = numComprador;
        compra.nomeDoProduto = produto.nome;
        compra.numVendedor = produto.numVendedor;
        compra.preco = produto.preco;
        compra.vendedor = produto.nomeDoVendedor;
        compra.prox = null;

        if (inicio == null) {
            fim = inicio = compra;
        } else {
            fim.prox = compra;
            fim = compra;
        }
    }

    void AvaliarCompras() {
        NoCompra avaliacaoPendente = inicio;
        int nota;

        if (avaliacaoPendente == null) {
            System.out.println("Sem compras disponiveis para avaliar");
            return;
        }

        System.out.println("Avalie o produto " + avaliacaoPendente.nomeDoProduto + " do vendedor " + avaliacaoPendente.vendedor + " com uma nota de 0 a 10:");
        nota = scanner.nextInt();
        scanner.nextLine();

        avaliacaoPendente.avaliação = nota;
        arvoreCompras.adicionarCompra(avaliacaoPendente);

        inicio = inicio.prox;
    }


}