public class NoArvoreCompra {
    NoCompra compra;
    NoArvoreCompra esquerda;
    NoArvoreCompra direita;

    public NoArvoreCompra(NoCompra compra) {
        this.compra = compra;
        this.esquerda = null;
        this.direita = null;
    }
}