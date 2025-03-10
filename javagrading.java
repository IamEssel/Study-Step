import java.util.Scanner;

public class javagrading {
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

        if (exam_score < 25 && midsem_score <15){
            System.out.println("You have failed both. Repeated");
        }
        if(exam_score>=25){
            if(midsem_score>=15){
                if(fees_status.equals("yes")){
                    System.out.println("You have passed with a certificate.");
                }
                else{
                    System.out.println("You have passed but your certificate is witheld. Pay fees in full.");
                }
            }
            else{
                System.out.println("You have failed the midsem.");
            }
        }
        else{
            System.out.println("You have failed the exam.");
        }
        /*if(exam_score>=25 && midsem_score>=15 && fees_status.equals("yes")){
            System.out.println("You have passed with a certificate.");
        }
        else if(exam_score>=25 && midsem_score>=15 && fees_status.equals("no")){
            System.out.println("You have passed but your certificate is witheld. Pay fees in full.");
        }
        else if(exam_score>=25 && midsem_score<15 && fees_status.equals("yes")){
            System.out.println("You have failed the midsem.");
        }
        else if(exam_score<25 && midsem_score<15 && fees_status.equals("yes")){
            System.out.println("You have failed the exam.");
        }*/
        if((exam_score == 24 && midsem_score == 15) || (exam_score == 25 && midsem_score == 14)){
            if(fees_status.equals("yes")){
                System.out.println("Condoned with a certificate.");
            }
            else{
                System.out.println("Condoned without a certificate.");
            }
        } 
        input.close();
    }   
}