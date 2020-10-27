public class ListaAcidentes {

    private class Node {
        public Acidentes element;
        public Node next;
        // .....
    }
    
    private Node head;
    private Node tail;
    private int count;
    
    public void add(Acidentes a) {
        
    }

    public int size() {
        return 0;
    }

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

}
