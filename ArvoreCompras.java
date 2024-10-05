public class ArvoreCompras {
    NoArvoreCompra raiz;

    public ArvoreCompras() {
        this.raiz = null;
    }

    public void adicionarCompra(NoCompra compra) {
        raiz = adicionarRecursivo(raiz, compra);
    }

    private NoArvoreCompra adicionarRecursivo(NoArvoreCompra atual, NoCompra compra) {
        if (atual == null) {
            return new NoArvoreCompra(compra);
        }

        if (compra.preco < atual.compra.preco) {
            atual.esquerda = adicionarRecursivo(atual.esquerda, compra);
        } else if (compra.preco > atual.compra.preco) {
            atual.direita = adicionarRecursivo(atual.direita, compra);
        }

        return atual;
    }


}