public class trials {
    public static void main(String[] args){
        int n = 365;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            System.out.println(digit);
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println(sum);


        for(int i =3; i<=4; i++){
            for (int j=2; j<i; j++){
                System.out.println("Time");
            }
            System.out.println("ho");
        }
    }
}
