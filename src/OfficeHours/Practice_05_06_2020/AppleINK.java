package OfficeHours.Practice_05_06_2020;

public class AppleINK {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Mehmet","Junior Tester",115000,1234);
        Tester tester2 = new Tester();
        tester2.setTesterInfo("Yusuf","Junior Tester",75000,12345);
        Tester tester3 = new Tester();
        tester3.setTesterInfo("Ahmet Satilmis","Senior Tester",125000,123456);

        ScrumTeam scrum1 = new ScrumTeam();// we can use the arrayLisst in scrumteam class
        scrum1.hireaTester(tester1);
        scrum1.hireaTester(tester3);
        scrum1.hireaTester(tester2);
        scrum1.fireTester(12345);

     //  scrum1.testerTeam // returns the testers team from scrum1
     for(  Tester  each:scrum1.testerTeam ){//prints out everysingle tester from scrumteam

         System.out.println(each);
     }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
     Developer dev1 = new Developer();
     Developer dev2 = new Developer();
        dev1.setDevInfo("Betty","Senior Developer",80000,12345);
        dev2.setDevInfo("Jack","Senior Developer",180000,12546);

        scrum1.hireADeveloper(dev1);
        scrum1.hireADeveloper(dev2);
        scrum1.fireADeveloper(12345);
        System.out.println(scrum1.developerTeam.size());
        for(Developer each: scrum1.developerTeam) {

            System.out.println(each);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("In my scrum team, We have "+scrum1.testerTeam.size()+" testers and "+scrum1.developerTeam.size()+" developers");




    }
}
