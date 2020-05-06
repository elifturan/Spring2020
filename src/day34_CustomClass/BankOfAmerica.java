package day34_CustomClass;

import day24_Methods.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setTesterInfo("Venera",234567834,"Senior SDET",150000 );

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Elif",12345678,"Senior Tester",100_000);
        Tester tester3 = new Tester();
        tester3.setTesterInfo("Joe Doe", 1233456789, "Tester", 140000);
        Tester tester4 = new Tester();
        tester4.setTesterInfo("Origosan",234567834,"Senior SDET",150000 );
        Tester tester5 = new Tester();
        tester5.setTesterInfo("Orhan",6235487,"SDET",120000);


        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));

      testers.removeIf(p -> !p.jobTitle.contains("SDET"));

        double totalBudget = 0;

for(Tester each: testers){
    System.out.println(each);
    totalBudget+=each.salary;
}
        System.out.println(totalBudget);





    }
}
