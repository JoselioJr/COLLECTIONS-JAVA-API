import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contadorDePalavras;

    public ContagemPalavras() {
        this.contadorDePalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contadorDePalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contadorDePalavras.isEmpty()) {
            contadorDePalavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contadorDePalavras.values());
    }

    public String encontrarPalavraMaisFrequente() {
        int contagemMaisFrenquente = Integer.MIN_VALUE;
        String palavraMaisFrenquente = null;

        if (!contadorDePalavras.isEmpty()) {
            for (Integer i : contadorDePalavras.values()) {
                if (i > contagemMaisFrenquente) {
                    contagemMaisFrenquente = i;
                    palavraMaisFrenquente = i.toString();
                }
            }
        }
        return "Palavra: "+palavraMaisFrenquente+", Cotagem: "+contagemMaisFrenquente;
    }
}
