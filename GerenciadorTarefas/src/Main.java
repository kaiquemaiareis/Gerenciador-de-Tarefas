import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // cria uma objeto do gerenciador de tarefas
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        // scanner pra ler a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        String comando;

        // loop principal do menu
        do {
            System.out.println("\n===== Gerenciador de Tarefas =====");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Marcar Tarefa como Completa");
            System.out.println("0. Sair");
            System.out.println("==================================");
            System.out.print("Escolha uma opção: ");
            comando = scanner.nextLine().trim(); // le e remove espaços em branco 

            // processa a escolha do usuario
            switch (comando) {

                // adiciona uma nova tarefa
                case "1":
                    System.out.println("\n-- Adicionar Nova Tarefa --");
                    System.out.print("Titulo da tarefa: ");
                    String titulo = scanner.nextLine().trim(); 
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine().trim(); 
                    gerenciador.adicionarTarefa(titulo, descricao); 
                    System.out.println("Tarefa adicionada."); 
                    break;

                // remove uma tarefa existente
                case "2":
                    System.out.println("\n-- Remover Tarefa --");
                    System.out.print("Titulo da tarefa a remover: ");
                    titulo = scanner.nextLine().trim(); 
                    gerenciador.removerTarefa(titulo); 
                    System.out.println("Se existia, a tarefa foi removida."); 
                    break;

                // lista todas as tarefas
                case "3":
                    System.out.println("\n-- Lista de Tarefas --");
                    gerenciador.listarTarefas(); 
                    break;

                // marca uma tarefa como completa
                case "4":
                    System.out.println("\n-- Marcar Tarefa como Completa --");
                    System.out.print("Titulo da tarefa a marcar como completa: ");
                    titulo = scanner.nextLine().trim(); 
                    gerenciador.marcarComoCompleta(titulo); 
                    System.out.println("Se existia, a tarefa foi marcada como completa."); 
                    break;

                // sai do programa    
                case "0":
                    System.out.println("Saindo do Gerenciador de Tarefas...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente de novo.");
            }
        } while (!comando.equals("0")); // continua o loop ate que o usuario escolha sair

        scanner.close(); // fecha o scanner 
        System.out.println("Programa encerrado."); 
    }
}
