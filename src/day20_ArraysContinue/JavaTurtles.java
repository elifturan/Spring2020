package day20_ArraysContinue;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JavaTurtles {
    public static void main(String[] args) {






        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String license = scan.next();
        if (license.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
         if (zipCode == 20910 || zipCode == 20740){
             premium +=60;
         }else if (zipCode==22102 || zipCode == 22103){
             premium+=30;
         }else{
             premium+=50;
         }
        System.out.println("Is this vehicle Owned,Financed, or Leased");
         vehicleOwnership=scan.next();
        premium += (vehicleOwnership.equalsIgnoreCase("owned") ) ?10:20;
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage= scan.next();
        if(vehicleUsage.equalsIgnoreCase("Business")){
premium += 50;
        }
if(vehicleUsage.equalsIgnoreCase("Pleasure")){
    premium += 10;
}
    if(vehicleUsage.equalsIgnoreCase("Commute")){
        premium += 20;
    }

        System.out.println("Days Driven To Work And/Or School");
       // System.out.println("How many days per week user drives to work?");
        daysDrivenToWorkOrSchool=scan.nextInt();
        premium +=milesToWorkOrSchool*5;


        System.out.println("Miles Driven To Work And/Or School");
        daysDrivenToWorkOrSchool=scan.nextInt();
        premium+=milesToWorkOrSchool*1;
        System.out.println("How old are you?");
         int age= scan.nextInt();
         if(age <16){
             System.out.println("Invalid data!");
             System.exit(0);
         }
         if(age>=16 && age <18 ){
             premium *=20;
         }if ( age >=18 && age <=21){
             premium *= 6;
        }if (age >21 && age <25){
             premium *=2;
        }
        System.out.println("How many years have you been driving");
       int yearsexperience = scan.nextInt();
       if(! (yearsexperience>0 && age-yearsexperience>=16)){
           System.out.println("Invalid data");
          //
       } else{
           premium -=yearsexperience*5;

       }

        System.out.println("Have you had any accidents in the last 5 years?");
   String accidents=scan.next();
if (accidents.equalsIgnoreCase("Yes")){
    System.out.println("How many?");
    accidentsAmount=scan.nextInt();
    premium += (accidentsAmount*0.2)*premium;
                    //3*0.2*300
}
        System.out.println("Have you had continuous insurance for the past 12 months?");
continuousInsurance=scan.next();
if(continuousInsurance.equalsIgnoreCase("no")){
    premium *=2;
}
scan.nextLine();
        System.out.println("What is the highest level of education you have completed?" );
education=scan.nextLine();
if(education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters")){
    premium -= (premium *0.05);
}
else if(education.equalsIgnoreCase("Doctors")){
    premium -=(premium * 0.1);
}
if(education.equalsIgnoreCase("Less than High School")){
    premium += (premium*0.05);
}

        System.out.println(name+" here's your quote!");
        System.out.println("Start Your Policy Today For: $" +premium);
referenceNumber=""+referenceNumber.toUpperCase()+name.substring(0,2)+age+name.substring(name.length()-2,name.length()).toUpperCase()+zipCode+ education.replace(" ","");

        System.out.println("Reference number: "+referenceNumber);













    }
}
