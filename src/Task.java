
public class Task {
     private String name;
     private String description;
     
      public Task(String n, String d){
       name=n;
        description=d;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void setName(String n){
        name=n;
    }
    public void setDescription(String d){
        description=d;
    }
    public boolean validate(){
        if(name == null || description == null || name.equals("") || description.equals(""))
                return false;
        else 
            return true;
    }
    
    public String toString(){
        return ("Name: " + name + "\n Description: "+ description +"\n=============\n" );
    }
}
