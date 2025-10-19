    private int altura(NoAVL no) {
        return (no == null) ? 0 : no.altura;
    }

    private void atualizarAltura(NoAVL no) {
        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));
    }

    private int fatorBalanceamento(NoAVL no) {
        return (no == null) ? 0 : altura(no.esquerda) - altura(no.direita);
    }
