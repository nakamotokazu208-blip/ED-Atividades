public void percursoPreOrdem() {
        percursoPreOrdemRec(raiz);
        System.out.println();
    }

    private void percursoPreOrdemRec(No noAtual) {
        if (noAtual != null) {
            System.out.print(noAtual.dado + " "); 
            percursoPreOrdemRec(noAtual.esquerda);
            percursoPreOrdemRec(noAtual.direita);
        }
    }
