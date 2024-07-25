package exercicios_gpt.collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class TaskManager {
        
        private List<Task> tasks;

        public TaskManager(){
            tasks = new LinkedList<>();
        }

        // adicionando tarefa
        public void addTask(Task task){
            tasks.add(task);
        }

        // removendo tarefa
        public void removeTask(String taskName){
            Task taskToRemove = null;

            for (Task task: tasks){
                if (task.getName().equalsIgnoreCase(taskName)){
                    taskToRemove = task;
                    break;
                }
            }

            if (taskToRemove != null){
                tasks.remove(taskToRemove);
                System.out.println("Task '" + taskName + "' removed successfully.");
            }else{
                System.out.println("Task '" + taskName + "' not found.");
            }
        }

        // mostrar as tarefas
        public void displayTasks(){
            if(tasks.isEmpty()){
                System.out.println("No tasks in the list.");
            }else{
                System.out.println("Tasks:");
                for (Task task: tasks){
                    System.out.println(" - " + task);
                }
            }
        }

        // mover tarefas para o topo da lista
        public void moveTaskToTop(String taskName){
            Task taskToMove = null;
            for (Task task : tasks){
                if (task.getName().equalsIgnoreCase(taskName)){
                    taskToMove = task;
                    break;
                }
            }

            if (taskToMove != null){
                tasks.remove(taskToMove);
                tasks.add(0, taskToMove); // adiciona a tarefa no inicio da lista
                System.out.println("Task '" + taskName + "' moved to the top.");

            }else{
                System.out.println("Task '" + taskName + "' not found.");
            }
        }


}
