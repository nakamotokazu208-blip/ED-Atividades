class ListaDupla {
    private NoDuplo cabeca; 
    private NoDuplo cauda; 
    private int tamanho;

    public ListaDupla() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public void inserirNoInicio(int valor) {
        NoDuplo novoNo = new NoDuplo(valor);
        if (cabeca == null) { 
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.proximo = cabeca; 
            cabeca.anterior = novoNo; 
            cabeca = novoNo;      
        }
        tamanho++;
        System.out.println("Inserido no início: " + valor);
    }

    public void inserirNoFinal(int valor) {
        NoDuplo novoNo = new NoDuplo(valor);
        if (cauda == null) { 
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.anterior = cauda; 
            cauda.proximo = novoNo;  
            cauda = novoNo;        
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

        if (pos == tamanho + 1) {
            inserirNoFinal(valor); 
            return;
        }

        NoDuplo novoNo = new NoDuplo(valor);
        NoDuplo atual = cabeca;
        
        for (int i = 1; i < pos; i++) {
            atual = atual.proximo;
        }
        
        novoNo.proximo = atual;
        novoNo.anterior = atual.anterior;
        
        atual.anterior.proximo = novoNo;
        atual.anterior = novoNo;
        
        tamanho++;
        System.out.println("Inserido na posição " + pos + ": " + valor);
    }

    public void removerNoInicio() {
        if (cabeca == null) {
            System.out.println("Erro: A lista está vazia. Nada a remover no início.");
            return;
        }
        
        int valorRemovido = cabeca.valor;
        cabeca = cabeca.proximo; 
        
        if (cabeca != null) {
            cabeca.anterior = null; 
        } else {
            cauda = null; 
        }
        
        tamanho--;
        System.out.println("Removido do início: " + valorRemovido);
    }

    public void removerNoFinal() {
        if (cauda == null) {
            System.out.println("Erro: A lista está vazia. Nada a remover no final.");
            return;
        }
        
        int valorRemovido = cauda.valor;
        cauda = cauda.anterior; 
        
        if (cauda != null) {
            cauda.proximo = null; 
        } else {
            cabeca = null; 
        }
        
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
        
        if (pos == tamanho) {
            if (cauda.valor != valor) {
                 System.out.println("Erro: Valor " + valor + " não encontrado na posição " + pos + ".");
                return;
            }
            removerNoFinal();
            return;
        }
        
        NoDuplo atual = cabeca;
        
        for (int i = 1; i < pos; i++) {
            atual = atual.proximo;
        }
        
        if (atual.valor != valor) {
            System.out.println("Erro: Valor " + valor + " não encontrado na posição " + pos + ".");
            return;
        }
        
        int valorRemovido = atual.valor;
        
        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;
        
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
        NoDuplo atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.proximo != null) {
                System.out.print(" <=> ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }
    
    public void exibirReverso() {
        if (cauda == null) {
            System.out.println("Lista Reversa: [Vazia]");
            return;
        }
        
        System.out.print("Lista Reversa: ");
        NoDuplo atual = cauda;
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.anterior != null) {
                System.out.print(" <=> ");
            }
            atual = atual.anterior;
        }
        System.out.println();
    }
}
