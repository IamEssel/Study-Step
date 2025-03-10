import java.util.Scanner;
public class gradingagain{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int exam_score;

        System.out.println("Enter your exam score: ");
        exam_score = input.nextInt();

        int midsem_score;

        System.out.println("Enter your midsem score: ");
        midsem_score = input.nextInt();

        input.nextLine();
        String fees_status;

        System.out.println("Have you paid all your fees?(yes or no): ");
        fees_status = input.nextLine();

        int total_marks=exam_score + midsem_score;

        if((exam_score == 24 && midsem_score == 15) || (exam_score == 25 && midsem_score == 14)){
            System.out.println("Condoned.");
        }
            switch(exam_score){
                case 0:
                System.out.println("You have failed the exam.");
                break;
                case 1:
                System.out.println("You have failed the exam.");
                break;
                case 2:
                System.out.println("You have failed the exam.");
                break;
                case 3:
                System.out.println("You have failed the exam.");
                break;
                case 4:
                System.out.println("You have failed the exam.");
                break;
                case 5:
                System.out.println("You have failed the exam.");
                break;
                case 6:
                System.out.println("You have failed the exam.");
                break;
                case 7:
                System.out.println("You have failed the exam.");
                break;
                case 8:
                System.out.println("You have failed the exam.");
                break;
                case 9:
                System.out.println("You have failed the exam.");
                break;
                case 10:
                System.out.println("You have failed the exam.");
                break;
                case 11:
                System.out.println("You have failed the exam.");
                break;
                case 12:
                System.out.println("You have failed the exam.");
                break;
                case 13:
                System.out.println("You have failed the exam.");
                break;
                case 14:
                System.out.println("You have failed the exam.");
                break;
                case 15:
                System.out.println("You have failed the exam.");
                break;
                case 16:
                System.out.println("You have failed the exam.");
                break;
                case 17:
                System.out.println("You have failed the exam.");
                break;
                case 18:
                System.out.println("You have failed the exam.");
                break;
                case 19:
                System.out.println("You have failed the exam.");
                break;
                case 20:
                System.out.println("You have failed the exam.");
                break;
                case 21:
                System.out.println("You have failed the exam.");
                break;
                case 22:
                System.out.println("You have failed the exam.");
                break;
                case 23:
                System.out.println("You have failed the exam.");
                break;
                case 24:
                System.out.println("You have failed the exam.");
                break;
                default:
                System.out.println("You have passed the exam.");
            }
            switch(midsem_score){
                case 0:
                System.out.println("You have failed the midsem.");
                break;
                case 1:
                System.out.println("You have failed the midsem.");
                break;
                case 2:
                System.out.println("You have failed the midsem.");
                break;
                case 3:
                System.out.println("You have failed the midsem.");
                break;
                case 4:
                System.out.println("You have failed the midsem.");
                break;
                case 5:
                System.out.println("You have failed the midsem.");
                break;
                case 6:
                System.out.println("You have failed the midsem.");
                break;
                case 7:
                System.out.println("You have failed the midsem.");
                break;
                case 8:
                System.out.println("You have failed the midsem.");
                break;
                case 9:
                System.out.println("You have failed the midsem.");
                break;
                case 10:
                System.out.println("You have failed the midsem.");
                break;
                case 11:
                System.out.println("You have failed the midsem.");
                break;
                case 12:
                System.out.println("You have failed the midsem.");
                break;
                case 13:
                System.out.println("You have failed the midsem.");
                break;
                case 14:
                System.out.println("You have failed the midsem.");
                break;
                default:
                System.out.println("You have passed the midsem.");
            }
            switch(fees_status){
                case "yes":
                System.out.println("You are legible for a certificate.");
                break;
                case "no":
                System.out.println("You are not legible for a certificate.");
                break;
                default:
                System.out.println("Enter yes or no.");
            }
                switch(total_marks){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    System.out.println("Your grade is F.");
                    break;
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    System.out.println("Your grade is D.");
                    break;
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    System.out.println("Your grade is C.");
                    break;
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    System.out.println("Your grade is B.");
                    break;
                    default:
                    System.out.println("Your grade is A.");
            }
        input.close();
    }
}