public class ListaAcidentes {

    private class Node {
        public Acidente element;
        public Node next;

        public Node(Acidente e) {
            element = e;
            next = null;
        }

        public String getTempo() {
            return element.getTempo();
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
        Node n = new Node(element);
        if (head == null) {
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
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
            if(aux.element.getMoto() > 0) {
                contaAcidenteMoto++;
            }
            aux = aux.next;
        }
        return contaAcidenteMoto;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node aux = head;
        for (int i = 0; i < count; i++) {
            s.append(aux.element.getTempo());
            s.append(" ; ");
            aux = aux.next;
        }
        return s.toString();
    }    

}
