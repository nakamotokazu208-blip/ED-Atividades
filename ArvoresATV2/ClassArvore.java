class ArvoreBinariaBusca {
    No raiz;

    public void inserir(int dado) {
        raiz = inserirRec(raiz, dado);
    }

    private No inserirRec(No raizAtual, int dado) {
        if (raizAtual == null) {
            return new No(dado);
        }

        if (dado < raizAtual.dado) {
            raizAtual.esquerda = inserirRec(raizAtual.esquerda, dado);
        } 
        else if (dado > raizAtual.dado) {
            raizAtual.direita = inserirRec(raizAtual.direita, dado);
        }
        return raizAtual;
    }
}
