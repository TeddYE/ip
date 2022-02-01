package main.tasks;

import main.enums.TaskType;

public class Deadline extends Task{
    protected String dueDate;

    public Deadline(String description, String dueDate) {
        super(description, TaskType.DEADLINE);
        this.dueDate = dueDate;
    }

    public Deadline(String description, String dueDate, boolean isDone) {
        super(description, TaskType.DEADLINE, isDone);
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    @Override
    public String toStoreString() {
        return super.toStoreString() + "~" + this.getDueDate();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" (by: %s)", this.getDueDate());
    }
}