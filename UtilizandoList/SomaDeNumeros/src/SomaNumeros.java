import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    private List<Integer> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosInteiros.add(numero);
    }

    public int calcularSoma(){
        int somaTotal = 0;

        for (Integer i : numerosInteiros){
            somaTotal += i.intValue();
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero(){
        int valorMaior = numerosInteiros.get(0).intValue();
        if(!numerosInteiros.isEmpty()){
            for (Integer i : numerosInteiros){
                if (valorMaior < i.intValue()) {
                    valorMaior = i.intValue();
                }
            }
        }
        return valorMaior;
    }

    public int encontrarMenorNumero(){
        int valorMenor = numerosInteiros.get(0).intValue();
        if(!numerosInteiros.isEmpty()){
            for (Integer i : numerosInteiros){
                if (valorMenor > i.intValue()) {
                    valorMenor = i.intValue();
                }
            }
        }
        return valorMenor;
    }

    public void exibirNumeros(){
        int indice = 1;
        for (Integer i : numerosInteiros){
            System.out.println((indice++)+"° número: "+i.intValue());
        }
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(50);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(3);

        System.out.println("Soma: "+numeros.calcularSoma());
        System.out.println("Maior número: "+numeros.encontrarMaiorNumero());
        System.out.println("Menor número: "+numeros.encontrarMenorNumero());
        
        numeros.exibirNumeros();
    }
}
