// this is the main class of the Java program
public class Multiclass {
    public static void main(String[] args){
        //the line above is the java method signature
        System.out.println("Hello from the main class.");

        //this is an instance to allow the use of the second class
        // the creation of an instance requires the use of the keyword "new"
        Second second = new Second();
        second.greet();
// there is an error here because the method greet() is not visible outside the class Second


        //this is an instance to allow the use of the second class
        Auxilliary auxilliary = new Auxilliary();
        auxilliary.display();
    }
}

// this is another class in the same file
class Second{
    public void greet(){
        System.out.println("Hello from the Second class.");
    }
}

// this is another class in the same file
class Auxilliary{
    protected void display(){
        System.out.println("Hello from the Auxilliary class.");
    }
}