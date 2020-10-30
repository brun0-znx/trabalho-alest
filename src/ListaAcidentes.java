public class ListaAcidentes {

    private class Node {
        public Acidente element;
        public Node next;
        public Node prev;

        public Node(Acidente e) {
            element = e;
            next = null;
            prev = null;
        }

    }
    
    private Node head;
    private Node tail;
    private Node current;
    private int count;
    
    /**
     * Construtor da lista.
     */
    public ListaAcidentes() {
        head = new Node(null);
        tail = new Node(null);
        head.next = tail;
        tail.prev = head;
        count = 0;
    }

    /**
     * Adiciona um elemento ao final da lista
     * @param a elemento a ser adicionado ao final da lista
     */
    public void add(Acidente a) {
        // Primeiro instanciamos um nodo para guardar o elemento
        Node n = new Node(a);
        
        // Fazer o correto encadeamento
        n.next = tail; // Primeiro "gruda" o novo nodo na lista
        n.prev = tail.prev;
        
        // Depois atualiza os nodos da lista, para que apontem para o novo nodo
        n.prev.next = n;
        tail.prev = n;
        
        // Atualiza o contador
        count++;
    }

    /**
     * Passa para o próximo elemento da lista
     * @return o próximo elemento da lista
     */
    public Acidente next() {
        if (current != tail) {
            Acidente num = current.element;
            current = current.next;
            return num;
        }
        return null;
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
