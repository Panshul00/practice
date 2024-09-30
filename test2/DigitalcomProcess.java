import java.util.ArrayList;
import java.util.Scanner;


public class DigitalcomProcess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        GameService gameService = new GameService();
        UserService userService = new UserService();
        ArrayList<User> userdb = new ArrayList<>();
        
        while (true) {
            System.out.println("\nMain Menu - Choices:");
            System.out.println("1) RegisterUser");
            System.out.println("2) ViewGames");
            System.out.println("3) searchByName");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    // Register user
                    System.out.print("Enter User ID: ");
                    String userid = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();
                    user.addUser(userid, password);
                    userdb.add(user);
                    userService.setUdb(userdb);
                    System.out.println("User registered successfully!");
                    break;
                case 2:
                    // View all games
                    System.out.println("Available Games:");
                    for (Game game : gameService.viewAll()) {
                        System.out.println(game);
                    }
                    break;
                case 3:
                    // Search by author
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();
                    String gameName = gameService.authorSearch(author);
                    System.out.println("Game found: " + gameName);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}