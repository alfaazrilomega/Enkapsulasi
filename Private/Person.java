package Private;

public class Person {
    private String name;
    private int date;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDate(int date){
        this.date = date;
    }
    
    public int getDate(){
        return this.date;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}