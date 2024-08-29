import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas; // lista para armazenar as tarefas

    // construtor para iniciar a lista de tarefas
    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    // adiciona uma nova tarefa pra lista
    public void adicionarTarefa(String titulo, String descricao) {
        tarefas.add(new Tarefa(titulo, descricao)); 
    }

    // remove uma tarefa da lista pelo titulo
    public void removerTarefa(String titulo) {
        tarefas.removeIf(tarefa -> tarefa.getTitulo().equals(titulo)); 
    }

    // lista todas as tarefas da lista
    public void listarTarefas() {
        // quando nao tem tarefas 
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else { 
            // quando tem tarefas 
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa);
            }
        }
    }
    // marca uma tarefa como completa pelo titulo
    public void marcarComoCompleta(String titulo) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo().equals(titulo)) {
                tarefa.setCompleta(true); 
                break; 
            }
        }
    }
}
