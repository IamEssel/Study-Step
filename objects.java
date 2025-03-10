public class objects {
    String fname = "Nana";
    String lname = "Essel";
    static void myMethod(){//static can be accessed without creating objecs of the class unlike public
        System.out.println("Method");
    }

        public static void main(String[] args){
            objects myObj = new objects();
            System.out.println("Name: "+myObj.fname+" "+myObj.lname);
            myMethod();
        }
}

class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
      System.out.println("Tuut, tuut!");
    }
  }
  
  class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {
  
      // Create a myCar object
      Car myCar = new Car();
  
      // Call the honk() method (from the Vehicle class) on the myCar object
      myCar.honk();
  
      // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
      System.out.println(myCar.brand + " " + myCar.modelName);
    }
  }
   