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
     * Adiciona um acidente ao final da lista
     * @param a acidente a ser adicionado ao final da lista
     */
    public void addRuaFinal(Acidente a) {
        if(header == null) { 
            Node n = new Node(a.getNomeCompleto());
            n.next = trailer; 
            n.prev = trailer.prev;
            n.prev.next = n;
            trailer.prev = n;
            count++;
            //newNode.add(a);
        } else {
            if(!encontraRuaIgual(a)) {
                Node n = new Node(a.getNomeCompleto());
                n.next = trailer; 
                n.prev = trailer.prev;
                n.prev.next = n;
                trailer.prev = n;
                count++;
                //newNode.add(a);
            }
        }
        //ordena();
    }

    /**
     * Insere um acidente no início da lista
     * @param a acidente a ser inserido
     */
    public void addRua(Acidente a) {
        
        if(0 == count) { //se insercao no final
            this.addRuaFinal(a);
        }
        else {
            if(!encontraRuaIgual(a)) {
                Node newNode = new Node(a.getNomeCompleto()); // cria o nodo
                Node aux = getNodeRef(0); // "caminha" ate a posicao index
                // Insere antes do nodo referenciado por aux
                newNode.next = aux;      // \ primeiro "gruda" o nodo na lista
                newNode.prev = aux.prev; // /
                newNode.prev.next = newNode;
                aux.prev = newNode;
                count++;
            }
        }  
   }

    /**
     * Ordena as ruas em ordem alfabética
     */
    private void ordena() {
        Node aux1 = header.next;
        Node aux2 = aux1.next;
        String temp;  

        if(count == 0 || count == 1) {
            return;
        } else {
            for(int i = 0; i < count; i++) {
               
                if(aux1.nome.compareTo(aux2.nome) < 0) {
                    //System.out.print(aux1.nome);
                    //System.out.print(aux2.nome);
                    temp = aux1.nome;
                    aux1.nome = aux2.nome;
                    aux2.nome = temp;
                    
                    aux1 = aux1.next;
                    aux2 = aux2.prev;
                }
            }
        }
    }

    /**
     * Encontra rua com mesmo nome
     * @return true se encontrou ou false se não encontrou
     */
    public boolean encontraRuaIgual(Acidente a) {
        Node aux = header.next; 
        String nome = a.getNomeCompleto();

        while(aux != trailer) {
            if(aux.nome.equals(nome)) { 
                //System.out.println(aux.nome);
                //System.out.println(a.getNomeCompleto());
                return true;
            }
            aux = aux.next;
        }  
       
        return false;
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

    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        Node aux = header.next;
        for (int i = 0; i < count; i++) {
            s.append(aux.nome.toString());
            s.append("\n");
            aux = aux.next;
        }
        return s.toString();
    }    

}
