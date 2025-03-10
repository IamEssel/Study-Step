/*Write a program that creates 9 elements array in 2D(3x3 format) and assign each 
element with one of the even numbers within the first 19 even numbers. 
Find i)the product of the leading diagonal elements and display the results
ii) the difference between the product of the trailing and leading diagonal elements
iii) difference between the products of the trailing diagonal odd numbers within 0 - 19 and the
trailing diagonal even numbers */
import java.util.Scanner;

public class assignment_2D {
    public static void main(String[] args){
        int [][]even = new int[3][3];
        int [][]odd = new int[3][3];
        Scanner integer = new Scanner(System.in);
        int number;
        int even_lead_prod=1, even_trail_prod=1, odd_trail_prod=1;


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Enter number: ");
                number = integer.nextInt();
                even[i][j] = 2*number;
                odd[i][j] = 2*number-1;
            }
        }
            
        for(int i = 0; i < 3; i++){
            even_lead_prod *=even[i][i];
        }
        System.out.println("(i) The product of the leading diagonal elements is "+even_lead_prod);

        for(int i = 2; i >= 0; i--){
            even_trail_prod *=even[i][2-i];
            odd_trail_prod *= odd[i][2-i];
        }
        System.out.println("(ii) The difference between the trailing diagonal and leading diagonal products is "+(even_trail_prod - even_lead_prod));
        System.out.println("(iii) The difference between the products of the trailing diagonal odd numbers and the trailing diagonal even numbers is "+ (odd_trail_prod-even_trail_prod));
        integer.close();
    }
}
