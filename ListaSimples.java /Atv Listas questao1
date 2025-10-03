class ListaSimples {
    private NoSimples cabeca; 
    private int tamanho;

    public ListaSimples() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public void inserirNoInicio(int valor) {
        NoSimples novoNo = new NoSimples(valor);
        novoNo.proximo = cabeca; 
        cabeca = novoNo;         
        tamanho++;
        System.out.println("Inserido no início: " + valor);
    }

    public void inserirNoFinal(int valor) {
        NoSimples novoNo = new NoSimples(valor);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            NoSimples atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
        tamanho++;
        System.out.println("Inserido no final: " + valor);
    }

    public void inserirNaPosicao(int pos, int valor) {
        if (pos < 1 || pos > tamanho + 1) {
            System.out.println("Erro: Posição inválida para inserção (" + pos + ").");
            return;
        }
        
        if (pos == 1) {
            inserirNoInicio(valor); 
            return;
        }

        NoSimples novoNo = new NoSimples(valor);
        NoSimples atual = cabeca;
        
        for (int i = 1; i < pos - 1; i++) {
            atual = atual.proximo;
        }
        
        novoNo.proximo = atual.proximo;
        atual.proximo = novoNo;
        tamanho++;
        System.out.println("Inserido na posição " + pos + ": " + valor);
    }

    public void removerNoInicio() {
        if (cabeca == null) {
            System.out.println("Erro: A lista está vazia. Nada a ser removido no início.");
            return;
        }
        int valorRemovido = cabeca.valor;
        cabeca = cabeca.proximo; 
        tamanho--;
        System.out.println("Removido do início: " + valorRemovido);
    }

    public void removerNoFinal() {
        if (cabeca == null) {
            System.out.println("Erro: A lista está vazia. Nada a remover no final.");
            return;
        }
        
        if (cabeca.proximo == null) {
            int valorRemovido = cabeca.valor;
            cabeca = null;
            tamanho--;
            System.out.println("Removido do final: " + valorRemovido);
            return;
        }
        
        NoSimples atual = cabeca;
        NoSimples anterior = null;
        
        while (atual.proximo != null) {
            anterior = atual;
            atual = atual.proximo;
        }
        
        int valorRemovido = atual.valor;
        anterior.proximo = null; 
        tamanho--;
        System.out.println("Removido do final: " + valorRemovido);
    }
  
    public void removerNaPosicao(int pos, int valor) {
        if (cabeca == null) {
            System.out.println("Erro: A lista está vazia. Nada a remover na posição " + pos + ".");
            return;
        }
        
        if (pos < 1 || pos > tamanho) {
            System.out.println("Erro: Posição inválida para remoção (" + pos + ").");
            return;
        }
        
        if (pos == 1) {
            if (cabeca.valor != valor) {
                System.out.println("Erro: Valor " + valor + " não encontrado na posição 1.");
                return;
            }
            removerNoInicio(); 
            return;
        }
        
        NoSimples atual = cabeca;
        NoSimples anterior = null;
        
        for (int i = 1; i < pos; i++) {
            anterior = atual;
            atual = atual.proximo;
        }
        
        if (atual.valor != valor) {
            System.out.println("Erro: Valor " + valor + " não encontrado na posição " + pos + ".");
            return;
        }

        int valorRemovido = atual.valor;
        anterior.proximo = atual.proximo; 
        tamanho--;
        System.out.println("Removido da posição " + pos + ": " + valorRemovido);
    }
    
    public int tamanho() {
        return tamanho;
    }

    public void exibir() {
        if (cabeca == null) {
            System.out.println("Lista: [Vazia]");
            return;
        }
        
        System.out.print("Lista (" + tamanho + " nós): ");
        NoSimples atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.proximo != null) {
                System.out.print(" -> ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }
}
