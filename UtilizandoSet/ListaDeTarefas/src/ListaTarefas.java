import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Set<Tarefa> listaDeTarefasRemovidas = new HashSet<>();

        if (!listaDeTarefas.isEmpty()) {
            for (Tarefa t : listaDeTarefas){
                if (t.getDescricao().equals(descricao)) {
                    listaDeTarefasRemovidas.add(t);
                    listaDeTarefas.remove(t);
                    break;
                }
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(listaDeTarefas);
    }

    public int contarTarefas() {
        return listaDeTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> setDeTarefasComcluidas = new HashSet<>();

        for (Tarefa t : listaDeTarefas) {
            if (t.isComclusao() == true) {
                setDeTarefasComcluidas.add(t);
            }
        }
        return setDeTarefasComcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> setDeTarefasPendentes = new HashSet<>();

        for (Tarefa t : listaDeTarefas) {
            if (t.isComclusao() == false) {
                setDeTarefasPendentes.add(t);
            }
        }
        return setDeTarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaDeTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setComclusao(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : listaDeTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setComclusao(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        if (!listaDeTarefas.isEmpty()) {
            listaDeTarefas.removeAll(listaDeTarefas);
        }
    }
}
