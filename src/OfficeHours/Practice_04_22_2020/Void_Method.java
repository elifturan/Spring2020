package OfficeHours.Practice_04_22_2020;

public class Void_Method {
    public static void main(String[] args) {

print();
Vote(20,true);
Vote(35 , false);
Vote(17,true);
EligibleToByCig(17);
    }

public static void print(){
for(int i = 0; i < 5 ;i++) {
    System.out.println("Hello Batch 18");
}




}

    public static void Vote(int age , boolean USCitizen) {
        boolean eligibleToVote= age >= 18 && USCitizen==true;
        if(eligibleToVote){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote yet");
        }

    }
public static void EligibleToByCig(int age){
        if (age >18){
            System.out.println("Eligible to buy");
        }else{
            System.out.println("Not eligible");
        }
}
}
