// this program will be re-assessed later on
import java.util.Scanner;

class gradingsystem {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        int grade;

        while (true) {
            System.out.print("Please enter your grade (0 to exit): ");
            grade = marks.nextInt();

            if (grade == 0) {
                System.out.println("Exiting program...");
                break; // Exit the loop
            }

            if (grade < 0) {
                System.out.println("Invalid input! Please enter a positive grade.");
                continue;
            }

            switch (grade / 10) {
                case 10:
                case 9:
                case 8:
                case 7:
                    System.out.println("Your grade is A");
                    break;
                case 6:
                    System.out.println("Your grade is B");
                    break;
                case 5:
                    System.out.println("Your grade is C");
                    break;
                case 4:
                    System.out.println("Your grade is D");
                    break;
                default:
                    System.out.println("Your grade is F");
                    break;
            }
        }
        
        marks.close(); // Close Scanner
    }
}
