package OfficeHours.Practice_03_25_2020;

public class if_Else_Practice {
    public static void main(String[] args) {
        int num = 100;

        if (num % 2 != 0) {//odd
            System.out.println(num + " is odd number");
        } else {
            System.out.println(num + " is even number");
        }

        int age = 21;
        if (age >= 21) {
            System.out.println("You're eligible to buy alcohol");
        } else {
            System.out.println("You are not eligible");
        }


        boolean genderMale = true;
        if (!genderMale) {
            System.out.println("Gender is male");
        } else{
            System.out.println("Gender is female");

    }
        boolean usCitizen = true;
        int ageOfPerson = 30;

        if(usCitizen == true && ageOfPerson >= 18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }






    }
}
