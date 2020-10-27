public class ListaRuas {
    
    private class Node {

        public String nomeLog;
        public ListaAcidentes listaAcidentes;
        public Node next;
        public Node prev;

        public Node(String x) {
            nomeLog = x;
            listaAcidentes = new ListaAcidentes();
        }

        public void add(Acidentes a) {
            listaAcidentes.add(a);
        }

        //...
    }

    private Node header;
    private Node trailer;
    private Node current;
    private int count;

    public void addAcidente(Acidentes a) {
        // percorrer a lista para verificar se ja tem uma
        // rua com a.getNomeLog()
        // se tiver adiciona o acidente no nodo
        // se nao tiver cria o nodo, add o acidente e 
        // coloca o nodo na posicao certa em ordem alfabetica
    }

    public void reset() {
        
    }

    public String next() {
        return "";
    }

    public String prev() {
        return "";
    }

    public String getRuaComMaisAcidentes() {
        return "";
    }

}
