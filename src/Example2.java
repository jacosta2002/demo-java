public class Example2 {
    public static void main(String[] args) {
        String username = "admin'; DROP TABLE users; --";
        String password = "password123";
        String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        System.out.println("Your query is: " + query);
    }
}
