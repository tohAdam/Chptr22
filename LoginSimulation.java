import java.util.Scanner;

public class LoginSimulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] usernames = {"joy", "gates", "jobs", "root"};
        String[] passwords = {"sun", "monopoly", "apple", "secret"};
        int[] priorities = {4, 1, 3, 5};
        
        while (true) {
            System.out.print("User Name: ");
            String username = scan.nextLine();
            System.out.print("Password: ");
            String password = scan.nextLine();
            
            if (username.equals("quit") && password.equals("exit")) 
                System.out.println("System shutting down.");
                break;
          
            boolean loggedIn = false;
            for (int i = 0; i < usernames.length; i++) {
                if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                    System.out.println("You have logged on with priority " + priorities[i]);
                    loggedIn = true;
                    break;
                }
            } if (!loggedIn) 
                System.out.println("Logon failed");
        } System.out.println("Bye.");
    }
}
