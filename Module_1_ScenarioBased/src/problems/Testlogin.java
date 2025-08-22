package problems;
import java.util.Scanner;

class LoginSystem {
    private String[] usernames = {"Alice", "Bob", "Charlie"};

    public void login(String inputUsername) {
        for (String dbUser : usernames) {
            // equals() compares content
            if (dbUser.equals(inputUsername)) {
                System.out.println("✅ equals(): Username matches (content is same)");
            }
            // == compares object references
            if (dbUser == inputUsername) {
                System.out.println("✅ == : Same object reference in String pool");
            } else {
                System.out.println("❌ == : Different object references");
            }
        }
    }
}
class Testlogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String entered = sc.nextLine();

        LoginSystem ls = new LoginSystem();
        ls.login(entered);

        sc.close();
    }
}

