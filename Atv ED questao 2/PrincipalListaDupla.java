public class PrincipalListaDupla {
    public static void main(String[] args) {
        ListaDupla listaDupla = new ListaDupla();
        
        System.out.println("--- Teste Lista Duplamente Encadeada ---");

        listaDupla.inserirNoInicio(10); 
        listaDupla.inserirNoFinal(30);  
        listaDupla.inserirNoInicio(5);  
        listaDupla.inserirNoFinal(40);  
        listaDupla.exibir(); 
        System.out.println("Tamanho atual: " + listaDupla.tamanho());

        listaDupla.inserirNaPosicao(3, 20); 
        listaDupla.exibir(); 
        listaDupla.exibirReverso(); 
        System.out.println("Tamanho atual: " + listaDupla.tamanho()); 
        
        listaDupla.inserirNaPosicao(1, 0); 
        listaDupla.inserirNaPosicao(7, 50); 
        listaDupla.exibir(); 
        System.out.println("Tamanho atual: " + listaDupla.tamanho()); 
        
        System.out.println("\n--- Teste de Remoção ---");
        
        listaDupla.removerNoInicio(); 
        listaDupla.exibir();
        listaDupla.removerNoFinal(); 
        listaDupla.exibir();
        
        listaDupla.removerNaPosicao(3, 20); 
        listaDupla.exibir();
        
        System.out.println("Tamanho final: " + listaDupla.tamanho()); 
        
        System.out.println("\n--- Limpando a lista ---");
        listaDupla.removerNoInicio(); 
        listaDupla.removerNoInicio(); 
        listaDupla.removerNoFinal(); 
        listaDupla.removerNoFinal(); 
        listaDupla.exibir(); 
        System.out.println("Tamanho final: " + listaDupla.tamanho()); 
        listaDupla.removerNoInicio(); 
    }
}
