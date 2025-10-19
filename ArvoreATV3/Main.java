public class Main {
    public static void main(String[] args) {
        int[] elementos = {1, 2, 3, 10, 4, 5, 9, 7, 8, 6};
        
        ArvoreBinariaBusca bst = new ArvoreBinariaBusca();
        System.out.println("--- Inserindo elementos na BST ---");
        for (int elemento : elementos) {
            bst.inserir(elemento);
        }
        
        System.out.println("ÁRVORE BINÁRIA DE BUSCA (BST)");
        System.out.print("Elementos (Em Ordem): ");
        System.out.println("Altura da BST: " + bst.getAltura() + " (ALTAMENTE DESBALANCEADA)");
        System.out.println("A BST se assemelha a uma 'escada' para esta sequência.");

        ArvoreAVL avl = new ArvoreAVL();
        System.out.println("\n--- Inserindo elementos na AVL ---");
        for (int elemento : elementos) {
            avl.inserir(elemento);
        }

        System.out.println("ÁRVORE AVL");
        System.out.print("Elementos (Em Ordem): ");
        avl.exibirEmOrdem(); 
        System.out.println("Altura da AVL: " + avl.getAltura() + " (BALANCEADA)");
        System.out.println("A AVL se manteve compacta, garantindo buscas rápidas.");
    }
}
