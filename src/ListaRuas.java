public class ListaRuas {
    
    private class Node {

        public String nome;
        public ListaAcidentes listaAcidentes;
        public Node next;
        public Node prev;

        public Node(String umNome) {
            this.nome = umNome;
            next = null;
            prev = null;
            listaAcidentes = new ListaAcidentes();
        }

        public void add(Acidente a) {
            listaAcidentes.addAcidente(a);
        }
        
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
        Node n = new Node(a.getNomeCompleto());

        if(header == null) {  
            n.next = trailer;
            n.prev = trailer.prev;
            n.prev.next = n;
            trailer.prev = n;
            
            count++;
            //newNode.add(a);
        }  
        else {  
            if(!encontraRuaIgual(a)) {
                n.next = trailer;
                n.prev = trailer.prev;
                n.prev.next = n;
                trailer.prev = n;
                
                count++;
                //newNode.add(a);
            }
        }
        ordena();
    }

    /**
     * Ordena as ruas em ordem alfabética
     */
    private void ordena() {
        current = null;
        Node index = null;  
        String temp;  
        
        //Current will point to head  
        for(current = header; current.next != null; current = current.next) {  
            //Index will point to node next to current  
            for(index = current.next; index != null; index = index.next) {  
                //If current's data is greater than index's data, swap the data of current and index  
                
            }  
        }  
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

    public void printNodes() {  
        current = header.next;  
        System.out.println("Lista de Ruas: ");  
        while(current != null) {  
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

    /**
     * Retorna a referencia para o nodo da posicao index
     * @return a referencia para o nodo da posicao index
     */
    private Node getNodeRef(int index) {
        Node aux = null;
        
        if(index<count/2) { // percorre do inicio para o meio
            aux = header.next; // faz aux apontar para o primeiro elemento da lista
            for (int i=0; i<index; i++) {
                aux = aux.next;
            }
        }
        else { // percorre do fim para o meio
            aux = trailer.prev;
            for(int i=count-1; i>index; i--) {
                aux = aux.prev;
            }
        }
        
        return aux;
    }

    public String getRuaComMaisAcidentes() {
        return "";
    }

}
