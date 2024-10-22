import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            for (String s : palavrasUnicas){
                if (s.equalsIgnoreCase(palavra)) {
                    palavrasUnicas.remove(palavra);
                    break;
                }
            }
        }
    }

    public boolean verificarPalavra(String palavra) {
        boolean presente = false;
        if (!palavrasUnicas.isEmpty()) {
            for (String s : palavrasUnicas){
                if (s.equalsIgnoreCase(palavra)) {
                    presente = true;
                    break;
                }
            }
        }
        return presente;
    }

    public void exibirPalavrasUnicas(){
        int indice = 1;
        for (String s : palavrasUnicas){
            System.out.println((indice++)+"° palavra única: "+s);
        }
    }

    public void exibirTamanho(){
        System.out.println("Tamanho: "+palavrasUnicas.size());
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("palavra");
        conjunto.adicionarPalavra("palavra");
        conjunto.adicionarPalavra("palavra1");

        conjunto.exibirTamanho();
        conjunto.exibirPalavrasUnicas();
    }
}
