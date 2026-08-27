public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha(10);
        
        pilha.imprimirPilha();
        pilha.empilha("Victor");

        pilha.imprimirPilha();
        pilha.empilha("Lucas");

        pilha.imprimirPilha();
        pilha.desempilha();

        pilha.imprimirPilha();
        pilha.empilha("Muniz");
        pilha.empilha("Maranhão");
        pilha.empilha("Mari");

        pilha.imprimirPilha();
        System.out.println("Topo: " + pilha.retornaElementoTopoPilha());
    }
}
