import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer>{
    private List<Integer> numerosInteiros;

    public OrdenacaoNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }
    
    @Override
    public int compareTo(Integer i) {
        return i.compare(numerosInteiros.getFirst(), i);
    }

    public void adicionarNumero(int numero){
        numerosInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordenacaoAscendente = new ArrayList<>(numerosInteiros);
        Collections.sort(ordenacaoAscendente);
        return ordenacaoAscendente;
    }
    
    public List<Integer> ordenarDescendente(){
        List<Integer> ordenacaoDescendente = new ArrayList<>(numerosInteiros);
        Collections.sort(ordenacaoDescendente, Collections.reverseOrder());
        return ordenacaoDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(50);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(3);

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
    }
}