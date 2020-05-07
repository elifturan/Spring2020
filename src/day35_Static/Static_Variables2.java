package day35_Static;

public class Static_Variables2 {
    int insVariables ;//every single objects of the class has its own copy
    static int staticVariable ;// there is only one copy of static shared by all objects

    public static void main(String[] args) {
        Static_Variables2 obj1 = new Static_Variables2();
     obj1.insVariables =300;
     obj1.staticVariable=400;
        Static_Variables2 obj2 = new Static_Variables2();

        System.out.println(obj1.insVariables);//300
        System.out.println(obj2.insVariables);
        System.out.println(obj2.staticVariable);//400

        System.out.println(Static_Variables2.staticVariable);// static can be called through the class name
        //  System.out.println(Static_Variables2.insvariable); //  instance cannot be called through class name


    }

}
