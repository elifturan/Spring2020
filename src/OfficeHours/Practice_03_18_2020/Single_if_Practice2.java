package OfficeHours.Practice_03_18_2020;

public class Single_if_Practice2 {
    public static void main(String[] args) {

        byte age = 127;
        boolean eligibleToBuy = age > 21 || age == 21; // age >=21

        if (age>=21){
            System.out.println("You're eligible to buy alcohol");
        }
        if (age< 21){
            System.out.println("Go drink your milk");

        }

        if ( ! eligibleToBuy){
            System.out.println("Go drink your milk");
        }


        boolean feeling = false;
        if (feeling == false){
            System.out.println("don't be sad");
        }
        if (feeling == true){
            System.out.println("stay happy");
        }







        


















    }
}
