public class Tarefa {
    private String descricao;
    private boolean comclusao;
    
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.comclusao = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isComclusao() {
        return comclusao;
    }

    public void setComclusao(boolean comclusao) {
        this.comclusao = comclusao;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", comclusao=" + comclusao + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }
}