import java.util.Scanner;
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
    private int sizeTotal;
    
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

    public void mostraAcidentes() {
        Node aux = head.next;
        Scanner scan = new Scanner(System.in);
        boolean sair = false;
        int opcao = -1;

        for (int i = 1; i < count; i++) {
            if(!sair) {
                System.out.print("   " + "Tipo do acidente: " + aux.element.getTipoAcidente() + "\n");
                System.out.print("   " + "Data e hora: " + aux.element.getData() + "\n");
                System.out.print("   " + "Dia da semana: " + aux.element.getDiaSemana() + "\n");
                System.out.print("   " + "Feridos: " + aux.element.getFeridos() + "\n");
                System.out.print("   " + "Fatais: " + aux.element.getFatais() + "\n");
                System.out.print("   " + "Automóveis: " + aux.element.getAuto() + "\n");
                System.out.print("   " + "Táxis: " + aux.element.getTaxis() + "\n");
                System.out.print("   " + "Lotação: " + aux.element.getLotacao() + "\n");
                System.out.print("   " + "Ônibus urbano: " + aux.element.getOnibusUrb() + "\n");
                System.out.print("   " + "Ônibus interestadual: " + aux.element.getOnibusInt() + "\n");
                System.out.print("   " + "Caminhão: " + aux.element.getCaminhao() + "\n");
                System.out.print("   " + "Moto: " + aux.element.getMoto() + "\n");
                System.out.print("   " + "Carroça: " + aux.element.getCarroca() + "\n");
                System.out.print("   " + "Bicicleta: " + aux.element.getBicicleta() + "\n");
                System.out.print("   " + "Tempo: " + aux.element.getTempo() + "\n");
                System.out.print("   " + "Turno: " + aux.element.getTurno() + "\n");
                System.out.print("   " + "Região: " + aux.element.getRegiao() + "\n");
                System.out.print("-----------------------------\n");
            }
            
            opcao = scan.nextInt();
            if(opcao == 3 && (aux.next != null)) {
                aux = aux.next;
            } else if(opcao == 3 && (aux.next == null)){
                System.out.print("Fim da lista de acidentes!\n");
            } else {
                break;
            }
        }
    }

    public void mostraPrimeiroAcidente() {
        Node aux = head;

        System.out.print("   " + "Tipo do acidente: " + aux.element.getTipoAcidente() + "\n");
        System.out.print("   " + "Data e hora: " + aux.element.getData() + "\n");
        System.out.print("   " + "Dia da semana: " + aux.element.getDiaSemana() + "\n");
        System.out.print("   " + "Feridos: " + aux.element.getFeridos() + "\n");
        System.out.print("   " + "Fatais: " + aux.element.getFatais() + "\n");
        System.out.print("   " + "Automóveis: " + aux.element.getAuto() + "\n");
        System.out.print("   " + "Táxis: " + aux.element.getTaxis() + "\n");
        System.out.print("   " + "Lotação: " + aux.element.getLotacao() + "\n");
        System.out.print("   " + "Ônibus urbano: " + aux.element.getOnibusUrb() + "\n");
        System.out.print("   " + "Ônibus interestadual: " + aux.element.getOnibusInt() + "\n");
        System.out.print("   " + "Caminhão: " + aux.element.getCaminhao() + "\n");
        System.out.print("   " + "Moto: " + aux.element.getMoto() + "\n");
        System.out.print("   " + "Carroça: " + aux.element.getCarroca() + "\n");
        System.out.print("   " + "Bicicleta: " + aux.element.getBicicleta() + "\n");
        System.out.print("   " + "Tempo: " + aux.element.getTempo() + "\n");
        System.out.print("   " + "Turno: " + aux.element.getTurno() + "\n");
        System.out.print("   " + "Região: " + aux.element.getRegiao() + "\n");
        System.out.print("-----------------------------\n");
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
