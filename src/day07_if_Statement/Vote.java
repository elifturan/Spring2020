package day07_if_Statement;

public class Vote {
    public static void main(String[] args) {

        int age = 18;
        boolean UScitizen= true;
        boolean likeDonald = false;
        boolean eligible = age == 18 && UScitizen == true;

        if (eligible== true){
            System.out.println("You are eligible to vote");
        }
        if(eligible != true) {
            System.out.println("You are not eligible to vote");
        }




    }
}
