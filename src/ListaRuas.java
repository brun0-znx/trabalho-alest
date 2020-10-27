public class ListaRuas {
    
    private class Node {

        public String nomeLog;
        public ListaAcidentes listaAcidentes;
        public Node next;
        public Node prev;

        public Node(String x) {
            nomeLog = x;
            listaAcidentes = new ListaAcidentes();
        }

        public void add(Acidentes a) {
            listaAcidentes.add(a);
        }
        //...
    }

    private Node header;
    private Node trailer;
    private Node current;
    private int count;

    /**
     * Construtor da lista.
     */
    public ListaRuas() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    }

    public void addAcidente(Acidentes a) {
        // percorrer a lista para verificar se ja tem uma
        // rua com a.getNomeLog()
        // se tiver adiciona o acidente no nodo
        // se nao tiver cria o nodo, add o acidente e 
        // coloca o nodo na posicao certa em ordem alfabetica
    }

    /**
     * Reseta para o ínicio da lista
     */
    public void resetNext() {
        current = header.next;
    }

    /**
     * Retorna o número de elementos da lista
     * @return o número de elementos da lista
     */
    public int size() {
        return count;
    }

    /**
     * Passa para o próximo elemento da lista
     * @return o próximo elemento da lista
     */
    public String next() {
        if (current != trailer) {
            
            return "";
        }
        return null;
    }

    public String prev() {
        return "";
    }

    public String getRuaComMaisAcidentes() {
        return "";
    }

    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        Node aux = header.next;
        for (int i = 0; i < count; i++) {
            s.append(aux.nomeLog);
            s.append("\n");
            aux = aux.next;
        }
        return s.toString();
    }    

}
