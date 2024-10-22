import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> listaDeAlunos;

    public GerenciadorAlunos() {
        this.listaDeAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        listaDeAlunos.add(new Aluno(nome, 0, media));
    }

    public void removerAluno(long matricula) {
        if (!listaDeAlunos.isEmpty()) {
            for (Aluno a : listaDeAlunos) {
                if (a.getMatricula() == matricula) {
                    listaDeAlunos.remove(a);
                    break;
                }
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> listaDeAlunosOrdenadosPorNome = new TreeSet<>(listaDeAlunos);
        return listaDeAlunosOrdenadosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> listaDeAlunosOrdenadosPorNota = new TreeSet<>(new OrdenarAlunosPorNota());

        listaDeAlunosOrdenadosPorNota.addAll(listaDeAlunos);
        return listaDeAlunosOrdenadosPorNota;
    }
}
