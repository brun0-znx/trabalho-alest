import java.util.Scanner;
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
    private int moto;

    /**
     * Construtor da lista.
     */
    public ListaRuas() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
        moto = 0;
    }

    /**
     * Adiciona as ruas e já ordena em ordem alfabética
     */
    public void addRua(Acidente a) {
        Node n = new Node(a.getNomeCompleto());
        Node aux = header.next;
        String novo = a.getNomeCompleto();
        boolean adicionado = false;
        int index = 0;

        if(count == 0) {  
            n.next = trailer;
            n.prev = trailer.prev;
            n.prev.next = n;
            trailer.prev = n;
            
            count++;
            n.add(a);
        }  
        else {  
            if(encontraRuaIgual(a).equals("false")) {
                while(aux != trailer && adicionado == false) {
                    if(aux.nome.compareTo(novo) > 0) { // s2 vem antes
                        Node ref = getNodeRef(index); // "caminha" ate a posicao index
                        // Insere antes do nodo referenciado por ref
                        n.next = ref;      // \ primeiro "gruda" o nodo na lista
                        n.prev = ref.prev; // /
                        n.prev.next = n;
                        ref.prev = n;
                        count++;
                        n.add(a);
                        adicionado = true;
                    } 
                    aux = aux.next;
                    index++;
                }
                if(!adicionado) {
                    n.next = trailer;
                    n.prev = trailer.prev;
                    n.prev.next = n;
                    trailer.prev = n;
                    
                    count++;
                    n.add(a);
                }
            } else {
                // se encontrar a rua igual
                String indexx = encontraRuaIgual(a);
                int indexxx = Integer.parseInt(indexx);
                Node ref = getNodeRef(indexxx); // "caminha" ate a posicao index
                ref.add(a);
            }
        }
    }

    /**
     * Encontra rua com mesmo nome
     * @return true se encontrou ou false se não encontrou
     */
    public String encontraRuaIgual(Acidente a) {
        Node aux = header.next; 
        String nome = a.getNomeCompleto();
        int index = 0;
        String indexx = "";

        while(aux != trailer) {
            if(aux.nome.equals(nome)) { 
                //System.out.println(aux.nome);
                //System.out.println(a.getNomeCompleto());
                indexx = String.valueOf(index);
                return indexx;
            }
            aux = aux.next;
            index++;
        }  
       
        return "false";
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

    /**
     * Permite a navegação (avançar e retroceder) nos nodos da lista
     */
    public void navegar() {
        Node aux = header.next;
        Scanner scan = new Scanner(System.in);

        int opcao = -1;
        boolean fimLista = false;

        System.out.println("1 - Avançar | 2 - Retroceder | Qualquer número - voltar");

        while(aux != trailer.next) {
            fimLista = false;
            if(aux.nome == null) {
                System.out.println("Fim da lista!");
                fimLista = true;
            } else {
                System.out.println(aux.nome);
            }
            
            opcao = scan.nextInt();
            if(opcao == 1) {
                aux = aux.next;
            } else if(opcao == 2 && fimLista == false) {
                aux = aux.prev;
            } else if(opcao == 2 && fimLista == true) {
                return;
            } else {
                break;
            }
        }
    }

    /**
     * Conta o número total de acidentes de moto da lista
     */
    public void totalAcidentesMoto(int a) {
        moto = moto + a;
    }

    /**
     * Retorna o número total de acidentes de moto da lista
     * @return o número total de acidentes de moto da lista
     */
    public int mostrarTotalAcidentesMoto() {
        return moto;
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
