public class Pilha {
    private String[] elementos;
    private int topo = 0;

    public Pilha(int tamanho) {
        this.elementos = new String[tamanho];
    }

    void empilha (String valor) {
        if (!verificarPilhaCheia()) {
            elementos[topo] = valor;
            topo++;
        }
    }

    void desempilha () {
        if (!verificarPilhavazia()) {
            topo--;
            elementos[topo] = "";
        }
    }

    void imprimirPilha () {
        System.out.println("\nElementos da pilha: ");
        for (int i = 0; i < topo; i++) {
            System.out.print("- Posição: "+ i);
            System.out.println(" | Valor: "+ elementos[i]);
        }
        System.out.println("Fim da pilha.\n");
    }

    boolean verificarPilhavazia() {
        return topo == 0;
    }

    boolean verificarPilhaCheia() {
        return elementos.length == topo;
    }

    String retornaElementoTopoPilha() {
        return elementos[topo-1];
    }
}