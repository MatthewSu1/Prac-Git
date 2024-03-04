public class ToDoItem {
    private String description;

    private boolean isDone;

    public void TodoItem(String description){
        this.description = description;
        isDone = false;
    }

    //Getter
    public String getDescription(){
        return description;
    }

    public String setDescription(String description){
         return this.description = description;
    }
}
