public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean completa;

    // construtor para criar uma nova tarefa
    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.completa = false; // a tarefa começa incompleta
    }

    // getters e setters 
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public boolean isCompleta() { return completa; }
    public void setCompleta(boolean completa) { this.completa = completa; }

    // metodo toString
    public String toString() {
        return titulo + ": " + descricao + (completa ? " (Completa)" : " (Incompleta)");
    }
}
