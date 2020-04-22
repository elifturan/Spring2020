package day25_MethodsRecap;

public class Return_Statement {
    public static void main(String[] args) {


 /*   if(10>9) {
        return;// exits the current method only
    }
        System.out.println("Hello");

  */
 Method1();
        System.out.println("Hello");
    }
    public static void Method1(){
        if (10>9){
            return;// exits the current method
        }
        System.out.println("Hello Cybertek");
    }
public static void Method2(){
    if (10>9){
        System.exit(0);//exit entire system
    }
    System.out.println("Hello Cybertek");

}
}
