package OfficeHours.Practice_05_06_2020;

public class TesterObject {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setTesterInfo("Elif","SDET",120000,30400304);

        System.out.println(tester1);

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Orhan","SDET",150000,153898);
        System.out.println(tester2);

tester1.smokeTesting();
tester2.smokeTesting();

tester1.creatingTicket();
tester2.creatingTicket();


    }
}
