
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String filename = "Tasks.txt";

        List<Task> tasks = loadTasksFromFile(filename);

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("1.Add a task");
                System.out.println("2.View  all tasks");
                System.out.println("3.Mark task as complete");
                System.out.println("4.Delete a task");
                System.out.println("5.Exit(save tasks)");

                System.out.print("Select an option : ");
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1 -> {

                        System.out.print("Enter Task Description : ");
                        String desc = scanner.nextLine();

                        int nextId;

                        if (!tasks.isEmpty()) {
                            nextId = tasks.get(tasks.size() - 1).getId() + 1;

                        } else {
                            nextId = 1;
                        }

                        Task newtask = new Task(nextId, desc, false);
                        tasks.add(newtask);

                        System.out.println("Task added successfully !");

                    }
                    case 2 -> {

                        if (tasks.isEmpty()) {
                            System.out.println("Your to-do list is empty");
                        } else {
                            System.out.println("\n\nYour TO-DO list\n---------------------");
                            for (Task task : tasks) {
                                System.out.println(task.toString());
                            }
                            System.out.println("\n\n----------------------------------------");
                        }

                    }
                    case 3 -> {

                        System.out.print("Enter task id : ");
                        int taskid = scanner.nextInt();
                        scanner.nextLine();

                        if (tasks.isEmpty()) {
                            System.out.println("No Tasks Available");
                        } else {
                            boolean flag = false;
                            for (int i = 0; i < tasks.size(); i++) {

                                Task task = tasks.get(i);

                                if (task.getId() == taskid) {
                                    task.setState(true);
                                    flag = true;
                                    System.out.println("Task Completed Successfully!");
                                    break;
                                }

                            }

                            if (!flag) {
                                System.out.println("ID Not Found");
                            }

                        }

                    }
                    case 4 -> {

                        System.out.print("Enter task id : ");
                        int taskid = scanner.nextInt();
                        scanner.nextLine();

                        if (tasks.isEmpty()) {
                            System.out.println("No Tasks Available");
                        } else {
                            boolean flag = false;
                            for (int i = 0; i < tasks.size(); i++) {

                                Task task = tasks.get(i);

                                if (task.getId() == taskid) {
                                    tasks.remove(i);
                                    flag = true;
                                    System.out.println("Task deleted successfully!");
                                    break;
                                }

                            }

                            if (!flag) {
                                System.out.println("ID Not Found");
                            }

                        }
                    }
                    case 5 -> {
                        saveTasksInFile(tasks, filename);
                        System.exit(0);

                    }
                    default ->
                        System.out.println("Select An Option From Menu");
                }

            }

        }

    }

    public static void saveTasksInFile(List<Task> tasks, String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            for (Task task : tasks) {

                String line = task.getId() + " | " + task.getDescription() + " | " + task.getState();

                writer.write(line);
                writer.newLine();

            }

            System.out.println("Tasks Saved Successfully!!");

        } catch (IOException exception) {
            System.out.println("Error : " + exception.getMessage());
        }

    }

    public static List<Task> loadTasksFromFile(String filename) {
        List<Task> taskList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = reader.readLine()) != null) {

                // Breaks each line into parts which splits from |
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);

                String description = parts[1];

                boolean isCompleted = Boolean.parseBoolean(parts[2]);

                // creates new task which read from file
                Task task = new Task(id, description, isCompleted);

                // each task added in list of tasks
                taskList.add(task);

            }

        } catch (IOException exception) {
            System.out.println("Error : " + exception.getMessage());
        }

        return taskList;
    }

}
