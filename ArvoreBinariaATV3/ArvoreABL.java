class ArvoreAVL {
    No raiz;

    private int altura(No no) {
        return (no == null) ? 0 : no.altura;
    }

    private int getFatorBalanceamento(No no) {
        return (no == null) ? 0 : altura(no.esquerda) - altura(no.direita);
    }

    private void atualizarAltura(No no) {
        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));
    }
  
    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        atualizarAltura(y);
        atualizarAltura(x);

        return x; 
    }

    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        atualizarAltura(x);
        atualizarAltura(y);

        return y; 
    }
)
    private No inserir(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserir(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserir(no.direita, valor);
        } else { 
            return no;
        }

        atualizarAltura(no);

        int fb = getFatorBalanceamento(no);

        if (fb > 1 && valor < no.esquerda.valor) {
            return rotacaoDireita(no);
        }

        if (fb < -1 && valor > no.direita.valor) {
            return rotacaoEsquerda(no);
        }

        if (fb > 1 && valor > no.esquerda.valor) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        if (fb < -1 && valor < no.direita.valor) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    public void inserir(int valor) {
        raiz = inserir(raiz, valor);
    }
    
    public int getAltura() {
        return altura(raiz);
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
