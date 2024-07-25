package exercicios_gpt.collections.LinkedList;

public class Task {
    public String name;
    private String description;

    public Task(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', description='" + description + "'}";
    }

    // getters and setters

    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return description;
    }

}
