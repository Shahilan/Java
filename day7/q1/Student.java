package q1;
//public access modifier
public class Student {
    private String name;
    private int age;

    public void displyInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    //set methods=> assign values to private variables
    public void setName(String name){
        this.name=name;
    }
    //get method=> get values / return values to other methods
     public String getName(){
        return name;

    }
}