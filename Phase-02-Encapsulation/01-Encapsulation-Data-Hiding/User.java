class User {
    private String password;

    // Setter
    void setPassword(String p) {
        if (p.length() > 5) {
            this.password = p;
            System.out.println("Password set successfully!");
        } else {
            System.out.println("Password too short!");
        }
    }

    // Getter
    String getPassword() {
        return this.password;
    }
}

public class Main {
    public static void main(String[] args) {
        User n = new User();

        n.setPassword("123");
        n.setPassword("MyPassword123");

        System.out.println("Current Password: " + n.getPassword());
    }
}