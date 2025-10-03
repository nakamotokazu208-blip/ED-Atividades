public class PrincipalListaSimples {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        
        System.out.println("--- Teste Lista Encadeada Simples ---");

        lista.inserirNoInicio(10);
        lista.inserirNoFinal(30); 
        lista.inserirNoInicio(5); 
        lista.inserirNoFinal(40);  
        lista.exibir(); 
        System.out.println("Tamanho atual: " + lista.tamanho()); 

        lista.inserirNaPosicao(3, 20); 
        lista.exibir(); 
        System.out.println("Tamanho atual: " + lista.tamanho()); 
        
        lista.inserirNaPosicao(1, 0); 
        lista.inserirNaPosicao(7, 50); 
        lista.exibir(); 
        System.out.println("Tamanho atual: " + lista.tamanho());
        
        System.out.println("\n--- Teste de Remoção ---");
        
        lista.removerNoInicio(); 
        lista.exibir();
        lista.removerNoFinal(); 
        lista.exibir();
        
        lista.removerNaPosicao(3, 20); 
        lista.exibir();
        
        System.out.println("Tamanho final: " + lista.tamanho()); 
        
        System.out.println("\n--- Limpando a lista ---");
        lista.removerNoInicio();
        lista.removerNoInicio(); 
        lista.removerNoInicio(); 
        lista.removerNoFinal();  
        lista.exibir(); 
        System.out.println("Tamanho final: " + lista.tamanho()); 
        lista.removerNoInicio(); 
    }
}
