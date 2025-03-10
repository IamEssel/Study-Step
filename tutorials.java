public class tutorials {
    public static void main(String[] args){
        String name = "Mike";
        int age = 15;
        float netWorth = 32042565354.24f;//"f" to denote float
        double grossWorth = 42974375284247924.23d;//"d" to denote double
        System.out.println("Hello my name is "+ name+ ". I am "+ age + " years old.");
        System.out.println("My net worth is "+ netWorth);
        System.out.println("My gross worth is "+ grossWorth);
        String[] cars = {"Benz", "BMW", "McLaren", "Koenisegg", "Ferrari"};


        /*typecasting in Java
        there's widening casting and narrowing casting.
        widening casting is done automatically while narrowing casting is manual*/ 

        //widening casting; smaller type size to larger type size
        int Number = 45;
        double doubleNumber = Number;
        System.out.println(Number);
        System.out.println(doubleNumber);

        //narrowing casting; larger type size to smaller type size
        double newValue = 9.78d;
        int myInt = (int) newValue;
        System.out.println(newValue);
        System.out.println(myInt);

        int x = 3;
        System.out.println(x|=5);// perform binary or operation
        System.out.println(x&=12);

        String text = "This is a test text.";
        String addit = "This is more text.";
        System.out.println("The length of this string is " + text.length());
        //getting index of a text
        System.out.println(text.indexOf("test"));

        //string concatenation
        System.out.println(text.concat(addit));
        //string + integer
        System.out.println("10" +  4);//output is a string

        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);

        //if else in another way(ternary operator)
        //syntax
        //variable = (condition) ? statement for true : statement for false

        double CWA = 87.43d;
        String result = (CWA>80) ? "You are in first class upper" : "Press on";
        System.out.println(result);

        //for-each loop used to loop through an array
        //for(type variable: arrayname)
        for(String i : cars){
            System.out.println(i);
        }
    } 
}
