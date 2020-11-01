public class ListaRuas {
    
    private class Node {

        public String nome;
        public ListaAcidentes listaAcidentes;
        public Node next;
        public Node prev;

        public Node(String umNomeCompleto) {
            this.nome = umNomeCompleto;
            next = null;
            prev = null;
            listaAcidentes = new ListaAcidentes();
        }

        public void add(Acidente a) {
            listaAcidentes.addAcidente(a);
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
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Adiciona as ruas
     */
    public void addRua(Acidente a) {
          
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            Node newNode = new Node(a.getNomeCompleto());
            head = tail = newNode;  
            //head's previous will be null  
            head.prev = null;  
            //tail's next will be null  
            tail.next = null;  
            //newNode.add(a);
        }  
        else {  
            if(!encontraRuaIgual(a)) {
                Node newNode = new Node(a.getNomeCompleto());
                //add newNode to the end of list. tail->next set to newNode  
                tail.next = newNode;  
                //newNode->previous set to tail  
                newNode.prev = tail;  
                //newNode becomes new tail  
                tail = newNode;  
                //tail's next point to null  
                tail.next = null;  
            }
            
        } 
        // ordenaRuas(newNode);
    }

    /**
     * Encontra rua com mesmo nome
     * @return true se encontrou ou false se não encontrou
     */
    public boolean encontraRuaIgual(Acidente a) {
        Node aux = head.next; 

        while (aux != tail) {
            if(aux.nome.equals(a.getNomeCompleto())) { 
                //System.out.println(aux.nome);
                //System.out.println(a.getNomeCompleto());
                return true;
            }
            aux = aux.next;
        }  
       
        return false;
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
            System.out.print(current.nome + " \n");  
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
