import java.util.Scanner;

public class rating {
    public static void main(String[] args){
        int count =0,count2=0,count3=0,count4=0,count5 = 0;
        //int ratings[] = {1,2,5,4,3,5,2,1,3,3,1,4,3,2,5,3,4,5,3,1};
        System.out.println("How many ratings? ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        Scanner rate = new Scanner(System.in);
        int []ratings = new int[n];


        for(int j = 0; j<n; j++){
            System.out.println("Enter ratings between 1 and 5: ");
            ratings[j]=rate.nextInt();
            /*while(ratings[j]>0&&ratings[j]<6){
                System.out.println("I said ratings between 1 and 5: ");
                ratings[j]=rate.nextInt(); 
            }*/
        }

        for(int i = 0; i <ratings.length; i++){
            if (ratings[i]==1){
                count++;
            }
            else if (ratings[i]==2){
                count2++;
            }
            else if (ratings[i]==3){
                count3++;
            }
            else if (ratings[i]==4){
                count4++;
            }
            else if (ratings[i]==5){
                count5++;
            }
        }
        System.out.println("1 appears "+count+ " times");
        System.out.println("2 appears "+count2+ " times");
        System.out.println("3 appears "+count3+ " times");
        System.out.println("4 appears "+count4+ " times");
        System.out.println("5 appears "+count5+ " times");
        number.close();
        rate.close();
    }
    
}
