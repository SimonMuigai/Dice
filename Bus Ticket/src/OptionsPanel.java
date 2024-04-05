import java.util.Scanner;

public class OptionsPanel {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


    }

    public static void mainOptions(){
        System.out.println("*******WELCOME MODERN COACH******");
        System.out.println("\t1. LOG IN \n\t2. CREATE ACCOUNT");
        int choice = 0;

        boolean finish = false;
        while (!finish){
            try {
                scanner = new Scanner(System.in);
                choice = scanner.nextInt();
                finish = true;
            }
            catch (Exception e){
                System.out.println("Invalid Input");
            }
        }

        switch (choice){
            case 1:
                log_in();
                mainOptions();
                break;
            case 2:
                createAccount();
                mainOptions();
                break;
            default:
                System.out.println("Invalid choice");
                mainOptions();
        }

    }

    private static void createAccount() {
        User user = new User();
        System.out.println("Enter your first name");
        user.setFirst_name(scanner.next());
        System.out.println("Enter your second name");
        user.setSecond_Name(scanner.next());
        System.out.println("Enter your Phone Number");
        user.setPhone_number(scanner.nextInt());
        System.out.println("Enter your ID number");
        user.setSecond_Name(scanner.next());
        Database.setUsers(user);

    }



    public static void log_in() {

    }
}
