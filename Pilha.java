public class Pilha {
    private int[] array; 
    private int topo;    
    private int capacidadeMaxima; 

    public Pilha(int capacidade) {
        this.capacidadeMaxima = capacidade;
        this.array = new int[capacidade];
        this.topo = -1;
    }

    public boolean isFull() {
        return topo == capacidadeMaxima - 1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public void push(int valor) {
        if (isFull()) {
            System.out.println("ERRO: A pilha está cheia. Não é possível adicionar o valor " + valor);
            return; 
        }
        array[++topo] = valor;
        System.out.println("Valor " + valor + " inserido (PUSH).");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("ERRO: A pilha está vazia. Retornando valor sentinela (-1).");
            return -1; 
        }
        int valor = array[topo--];
        return valor;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("ERRO: A pilha está vazia. Não há elemento para consultar.");
            return -1;
        }
        return array[topo];
    }

    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha(5);
        System.out.println("Pilha de capacidade " + minhaPilha.capacidadeMaxima + " criada.\n");

        minhaPilha.push(10);
        minhaPilha.push(20);
        minhaPilha.push(30);

        System.out.println("\n--- Operação PEEK ---");
        int topoValor = minhaPilha.peek();
        System.out.println("Elemento no topo (PEEK): " + topoValor);

        System.out.println("\n--- Remoção (POP) dos Elementos ---");
        while (!minhaPilha.isEmpty()) {
            int valorRemovido = minhaPilha.pop();
            System.out.println("Elemento removido (POP): " + valorRemovido);
        }

        System.out.println("\n--- Verificação Final ---");
        System.out.println("Pilha está vazia? " + minhaPilha.isEmpty());
        minhaPilha.pop();
    }
}
