import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaDeItensRemovidos = new ArrayList<>();

        for (Item i : listaItens){
            if(i.getNome().equalsIgnoreCase(nome)){
                listaDeItensRemovidos.add(i);
            }
        }
        listaItens.remove(listaDeItensRemovidos);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        for (Item i : listaItens){
            valorTotal += (i.getPreco() * i.getQuantidade());
        }
        
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }
}
