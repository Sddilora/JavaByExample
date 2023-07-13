import java.util.Scanner; // Import the Scanner class

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Username is: " + username);
        System.out.printf("Username is still : %s", username);

        System.out.printf("Hello %s, Welcome to Java Programming, How old are you? ", username);
        int age = scanner.nextInt();
        System.out.printf("You are %d years old", age);

        scanner.close();  // If we are not close it, it will keep running in the background of our program(memory).
    }
}