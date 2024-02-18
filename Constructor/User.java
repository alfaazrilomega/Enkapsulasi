package Constructor;

public class User {
    public String username;
    public String password;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
}


class TestConstructor{
    public static void main(String[] args) {
        User Kopi = new User("Kopi", "kopi");
        System.out.println("Username: " + Kopi.username);
        System.out.println("Password: " + Kopi.password);
    }
}