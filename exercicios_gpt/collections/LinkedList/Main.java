package exercicios_gpt.collections.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String option;
        String taskName, taskDescription;

        do { 
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Display tasks");
            System.out.println("4. Move task to top");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter the task name: ");
                    taskName = scanner.nextLine();
                    System.out.print("Enter the task description: ");
                    taskDescription = scanner.nextLine();
                    taskManager.addTask(new Task(taskName, taskDescription));
                    System.out.println("Task added.");
                    break;

                case "2":
                    System.out.print("Enter the task name to remove: ");
                    taskName = scanner.nextLine();
                    taskManager.removeTask(taskName);
                    break;

                case "3":
                    taskManager.displayTasks();
                    break;
                
                case "4":
                    System.out.print("Enter the task name to move to top: ");
                    taskName = scanner.nextLine();
                    taskManager.moveTaskToTop(taskName);

                case "5":
                    System.out.println("Exiting Task Manager.");
                    break;

                default:
                System.out.println("Invalid option. Please choose again.");

            }
        } while (!option.equals("5"));

        scanner.close();

    }
}
