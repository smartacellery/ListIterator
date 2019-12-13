
public class Task {
     private String name;
     private String description;
     
      public Task(String n, String d){
        name=n;
        description=d;
    }
    
    public boolean validate(){
        if(name == null || description == null || name.equals("") || description.equals(""))
                return false;
        else 
            return true;
    }
    
    public String toString(){
        return "Name: " + name + "\nDescription: "+ description "\n=============\n";
    }
}
