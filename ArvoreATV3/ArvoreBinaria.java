class ArvoreBinariaBusca {
    No raiz;

    public ArvoreBinariaBusca() {
        this.raiz = null;
    }

    private No inserir(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserir(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserir(no.direita, valor);
        }

        return no;
    }

    public void inserir(int valor) {
        raiz = inserir(raiz, valor);
    }

    private int calcularAltura(No no) {
        if (no == null) {
            return 0;
        }
        return 1 + Math.max(calcularAltura(no.esquerda), calcularAltura(no.direita));
    }

    public int getAltura() {
        return calcularAltura(raiz);
    }

    private void percursoEmOrdem(No no) {
        if (no != null) {
            percursoEmOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            percursoEmOrdem(no.direita);
        }
    }

    public void exibirEmOrdem() {
        percursoEmOrdem(raiz);
        System.out.println();
    }
}
