private NoAVL inserirRec(NoAVL raizAtual, int dado) {
        if (raizAtual == null) {
            return new NoAVL(dado);
        }
        atualizarAltura(raizAtual);

        int balanco = fatorBalanceamento(raizAtual);

        if (balanco > 1 && dado < raizAtual.esquerda.dado) {
            return rotacaoDireita(raizAtual);
        }
        return raizAtual;
    }
