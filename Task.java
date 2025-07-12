// Model class representing a single Task

public class Task {

    private int id;
    private String description;
    private boolean isCompleted;

    public Task(int id, String description, boolean isCompleted) {
        this.id = id;
        this.description = description;
        this.isCompleted = isCompleted;
    }


    public int getId(){
        return this.id;
    }
    public String getDescription(){
        return this.description;
    }
    public boolean getState(){
        return this.isCompleted;
    }


    public void setId(int id){
        this.id = id;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setState(boolean isCompleted){
        this.isCompleted = isCompleted;
    }


    @Override
    public String toString(){
        return id+" -> "+description+" -> "+(isCompleted? "Completed" : "Not Completed");
    }

}
