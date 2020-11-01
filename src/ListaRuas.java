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

    /**
     * Adiciona as ruas
     */
    public void addRua(Acidente a) {
          
        if(header == null) {  
            Node n = new Node(a.getNomeCompleto());

            n.next = trailer;
            n.prev = trailer.prev;
            n.prev.next = n;
            trailer.prev = n;
            
            count++;
            //newNode.add(a);
        }  
        else {  
            if(!encontraRuaIgual(a)) {
                Node n = new Node(a.getNomeCompleto());
            
                n.next = trailer;
                n.prev = trailer.prev;
                n.prev.next = n;
                trailer.prev = n;
                
                count++;
            }
            
        } 
        // ordenaRuas(newNode);
    }

    /**
     * Encontra rua com mesmo nome
     * @return true se encontrou ou false se não encontrou
     */
    public boolean encontraRuaIgual(Acidente a) {
        Node aux = header.next; 

        while (aux != trailer) {
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
        aux = header.next;  

        while (aux != trailer) {
            
            
            aux = aux.next;
        }  
    }

    public void printNodes() {  
        //Node current will point to head  
        current = header.next;  
        if(header == null) {  
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
        current = header.next;
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
