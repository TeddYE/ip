package task;

import java.util.ArrayList;

public abstract class Task {
    protected String description;
    protected String taskType;
    protected boolean isDone;

    protected static final ArrayList<Task> TASKS = new ArrayList<>();

    public Task(String description, String taskType) {
        this.description = description;
        this.taskType = taskType;
        this.isDone = false;
    }

    public static ArrayList<Task> getTasks() {
        return Task.TASKS;
    }

    public static void addTask(Task newTask) {
        Task.TASKS.add(newTask);
    }

    public static Task getTask(int taskIndex) {
        return Task.TASKS.get(taskIndex);
    }

    public static int getTaskCount() {
        return Task.TASKS.size();
    }

    public static String taskCountToString() {
        return String.format("Now you have %d task(s) in the list.", Task.getTaskCount());
    }

    public String getDescription() {
        return this.description;
    }

    public String getTaskType() { return this.taskType; }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return String.format("[%s][%s] %s", this.getTaskType(), this.getStatusIcon(), this.getDescription());
    }
}