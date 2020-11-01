public class ListaRuas {
    
    private class Node {

        public String nomeLog;
        public String log;
        public ListaAcidentes listaAcidentes;
        public Node next;
        public Node prev;

        public Node(String umNomeLog, String umLog) {
            this.nomeLog = umNomeLog;
            this.log = umLog;
            next = null;
            prev = null;
            //listaAcidentes = new ListaAcidentes();
        }

        public void add(Acidente a) {
            listaAcidentes.add(a);
        }
        //...
    }

    private Node head;
    private Node tail;
    private Node current;
    private int count;

    /**
     * Construtor da lista.
     */
    public ListaRuas() {
        head = new Node(null);
        tail = new Node(null);
        count = 0;
    }

    /**
     * Adiciona as ruas
     */
    public void addRua(Acidente a) {
        //Create a new node  
        Node newNode = new Node(a.getNomeLog(), a.getLog());  
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.prev = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.prev = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        } 
        // ordenaRuas(newNode);
    }

    /**
     * Ordena as ruas
     */
    public void ordenaRuas(Node aux) {
        aux = head.next;  

        while (aux != tail) {
            
            
            aux = aux.next;
        }  
    }

    public void printNodes() {  
        //Node current will point to head  
        current = head;  
        if(head == null) {  
            System.out.println("Lista de Ruas está vazia!");  
            return;  
        }  
        System.out.println("Lista de Ruas: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.log + " " + current.nomeLog + " \n");  
            current = current.next;  
        }  
    }  

    /**
     * Reseta para o ínicio da lista
     */
    public void resetNext() {
        current = head.next;
    }

    /**
     * Retorna o número de elementos da lista
     * @return o número de elementos da lista
     */
    public int size() {
        return count;
    }

    public String getRuaComMaisAcidentes() {
        return "";
    }

}
