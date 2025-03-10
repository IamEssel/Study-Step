public class iteration {
    public static void main(String[] args){
        // Odd numbers
        System.out.println("\t Odd Numbers");
        for(int i = 0; i<=20; i++){
            if(i==0 || i%2==0)continue;{
                System.out.print(i+",");
            }
        }
        System.out.println("\t\n Even Numbers");
        //even numbers
        for(int j = 0; j<=20; j++){
            if(j==0 || j%2!=0)continue;{
                System.out.print(j+",");
            if(j==18)break;
            }
        }
    }
}
