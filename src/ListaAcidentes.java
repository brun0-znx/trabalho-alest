public class ListaAcidentes {

    private class Node {
        public Acidente element;
        public Node next;

        public Node(Acidente e) {
            element = e;
            next = null;
        }

    }
    
    private Node head;
    private Node tail;
    private int count;
    
    /**
     * Construtor da lista.
     */
    public ListaAcidentes() {
        head = null;
        tail = null;
        count = 0;
    }

     /**
     * Insere um elemento em uma determinada posicao da lista.
     * @param element elemento a ser inserido
     */
    public void addAcidente(Acidente element) {
        // Cria o nodo
        Node n = new Node(element);
        
        // Insere o nodo criado na lista
        if (index == 0) { // se insercao no inicio
            if(count == 0) // se a lista esta vazia
                tail = n;
            else
                n.next = head;
            head = n;
        }
        else if (index == count) { // se insercao no final
            tail.next = n;
            tail = n;
        }
        else { // se insercao no meio
            Node ant = head;
            for(int i=0; i<index-1; i++) // "caminha" ate a posicao anterior
                ant = ant.next;    // a posicao onde o elemento sera inserido
            n.next = ant.next;
            ant.next = n;
        }
        
        // Incrementa o contador
        count++;
    }

    /**
    * Retorna o número de elementos da lista
    * @return o número de elementos da lista
    */
    public int size() {
        return count;
    }

    /**
    * Retorna o número total de acidentes de moto
    * @return o número total de acidentes de moto
    */
    public int getQuantosAcidentesMoto() {
        int contaAcidenteMoto = 0;
        Node aux = head;
        for(int i = 0; i < count; i++) {
            if(aux.element.getAcidenteMoto() > 0) {
                contaAcidenteMoto++;
            }
            aux = aux.next;
        }
        return contaAcidenteMoto;
    }

    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        Node aux = head.next;
        for (int i = 0; i < count; i++) {
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }
        return s.toString();
    }    

}
