package day37_Constructors;

public class Constructor_Intro {

    public Constructor_Intro(int a){ // constructor name must be same with class name!// constructor with argument
        System.out.println("Constructor with argument of int");
    }

    public static void main(String[] args) {
      //  Constructor_Intro obj = new Constructor_Intro();//object must be created with existing constructor
   Constructor_Intro obj = new Constructor_Intro(10);
        Constructor_Intro obj2 = new Constructor_Intro(10);



    }


}
