package tasks;

import enums.TaskType;

public class ToDo extends Task{
    public ToDo(String description) {
       super(description, TaskType.TODO);
    }
}
