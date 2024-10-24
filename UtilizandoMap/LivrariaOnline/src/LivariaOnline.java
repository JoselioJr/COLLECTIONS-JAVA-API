import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LivariaOnline {
    private Map<String, Livro> livraria;

    public LivariaOnline() {
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        if (!livraria.isEmpty()) {
            livraria.remove(titulo);
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        Map<String, Livro> livrosPorPreco = new TreeMap<>(livraria);
        
        System.out.println(livrosPorPreco);
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> listaDeLivrosPorAutor = null;
        if (!livraria.isEmpty()) {
            for (Livro l : livraria.values()) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listaDeLivrosPorAutor.add(l);
                }
            }
        }
        return listaDeLivrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double valorMaisCaro = Double.MIN_VALUE;

        for (Livro l : livraria.values()) {
            if (l.getPreco() > valorMaisCaro) {
                valorMaisCaro = l.getPreco();
                livroMaisCaro = l;
            }
        }

        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double valorMaisBarato = Double.MAX_VALUE;

        for (Livro l : livraria.values()) {
            if (l.getPreco() < valorMaisBarato) {
                valorMaisBarato = l.getPreco();
                livroMaisBarato = l;
            }
        }

        return livroMaisBarato;
    }
}
