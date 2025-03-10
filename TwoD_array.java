import java.util.Scanner;
public class TwoD_array {
    public static void main(String[] args){
        //int [][]k = {{8, 10, 12, 15}, {20, 27, 32, 41}, {9, 8, 7, 10}};
        Scanner fill = new Scanner(System.in);
        int [][]array = new int[3][3];
        /*for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.println(k[i][j]);
            }
        }*/
        for(int a = 0;a<3;a++){
            for(int b = 0;b<3;b++){
                System.out.println("Enter row "+(a+1) +" column "+(b+1)+":" );
                array[a][b] = fill.nextInt();
            }
        }
        for(int a = 0;a<3;a++){
            for(int b = 0;b<3;b++){
                System.out.println(array[a][b]);
            }
        }
    }
}
