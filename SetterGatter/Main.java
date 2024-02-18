package SetterGatter;

public class Main {
    
    public static void main(String[] args) {
    User malaUser = new User();

    // menggunakan method setter
    malaUser.setUsername("malaUser");
    malaUser.setPassword("shine");

    // menggunakan method getter
    System.out.println("Username: " + malaUser.getUsername());
    System.out.println("Password: " + malaUser.getPassword()); 
    }
}
