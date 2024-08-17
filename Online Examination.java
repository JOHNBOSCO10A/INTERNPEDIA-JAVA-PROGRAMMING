import java.util.Scanner;

public class OnlineExamination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (login(username, password)) {
            System.out.println("Login successful!");

            // Update profile and password
            System.out.println("Do you want to update your profile and password? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                updateProfileAndPassword(scanner);
            }

            // Selecting answers for MCQs
            System.out.println("Select answers for MCQs:");
            int score = selectAnswers(scanner);

            // Timer and auto submit
            System.out.println("Time's up! Auto submitting...");
            System.out.println("Your score is: " + score);

            // Closing session and logout
            System.out.println("Closing session...");
            System.out.println("Logged out successfully!");
        } else {
            System.out.println("Invalid username or password!");
        }

        scanner.close();
    }

    public static boolean login(String username, String password) {
        // Replace with actual login logic
        return username.equals("admin") && password.equals("password");
    }

    public static void updateProfileAndPassword(Scanner scanner) {
        System.out.println("Enter new username:");
        String newUsername = scanner.nextLine();
        System.out.println("Enter new password:");
        String newPassword = scanner.nextLine();
        // Replace with actual update logic
        System.out.println("Profile and password updated successfully!");
    }

    public static int selectAnswers(Scanner scanner) {
        int score = 0;
        // Replace with actual MCQ logic
        for (int i = 0; i < 5; i++) {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println("A) Option A");
            System.out.println("B) Option B");
            System.out.println("C) Option C");
            System.out.println("D) Option D");
            System.out.println("Enter your answer:");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("A")) {
                score++;
            }
        }
        return score;
    }
}
