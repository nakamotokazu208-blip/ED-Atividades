class NoAVL {
    int dado;
    int altura; 
    NoAVL esquerda;
    NoAVL direita;

    public NoAVL(int dado) {
        this.dado = dado;
        this.altura = 1; 
        this.esquerda = null;
        this.direita = null;
    }
}
