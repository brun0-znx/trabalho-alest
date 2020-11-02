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
            s.append("   " + "Tipo do acidente: " + aux.element.getTipoAcidente() + "\n");
            s.append("   " + "Data e hora: " + aux.element.getData() + "\n");
            s.append("   " + "Dia da semana: " + aux.element.getDiaSemana() + "\n");
            s.append("   " + "Feridos: " + aux.element.getFeridos() + "\n");
            s.append("   " + "Fatais: " + aux.element.getFatais() + "\n");
            s.append("   " + "Automóveis: " + aux.element.getAuto() + "\n");
            s.append("   " + "Táxis: " + aux.element.getTaxis() + "\n");
            s.append("   " + "Lotação: " + aux.element.getLotacao() + "\n");
            s.append("   " + "Ônibus urbano: " + aux.element.getOnibusUrb() + "\n");
            s.append("   " + "Ônibus interestadual: " + aux.element.getOnibusInt() + "\n");
            s.append("   " + "Caminhão: " + aux.element.getCaminhao() + "\n");
            s.append("   " + "Moto: " + aux.element.getMoto() + "\n");
            s.append("   " + "Carroça: " + aux.element.getCarroca() + "\n");
            s.append("   " + "Bicicleta: " + aux.element.getBicicleta() + "\n");
            s.append("   " + "Tempo: " + aux.element.getTempo() + "\n");
            s.append("   " + "Turno: " + aux.element.getTurno() + "\n");
            s.append("   " + "Região: " + aux.element.getRegiao() + "\n");
            s.append("-----------------------------\n");
    
            aux = aux.next;
        }
        return s.toString();
    }    
}
