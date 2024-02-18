package Private;

public class Name {
    public static void main(String[] args) {
        Person mPerson = new Person();
mPerson.setName("Bernald");
mPerson.setDate(7);
mPerson.setAge(17);

System.out.println("Person Name: " + mPerson.getName());
System.out.println("Person Date: " + mPerson.getDate());
System.out.println("Person Age : " + mPerson.getAge());
    }
}
