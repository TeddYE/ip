package main.duke.tasks;

import main.duke.enums.TaskType;

public abstract class Task {
    protected String description;
    protected TaskType taskType;
    protected boolean isDone;

    public Task(String description, TaskType taskType) {
        this.description = description;
        this.taskType = taskType;
        this.isDone = false;
    }

    public Task(String description, TaskType taskType, boolean isDone) {
        this.description = description;
        this.taskType = taskType;
        this.isDone = isDone;
    }

    public String getDescription() {
        return this.description;
    }

    public TaskType getTaskType() { return this.taskType; }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    /**
     * format the task into a string to be stored in the save file
     */
    public String toStoreString() {
        return String.format("%s~%d~%s",
                this.getTaskType(),
                this.getStatusIcon() == "X" ? 1 : 0,
                this.getDescription());
    }

    @Override
    public String toString() {
        return String.format("[%s][%s] %s", this.getTaskType(), this.getStatusIcon(), this.getDescription());
    }
}