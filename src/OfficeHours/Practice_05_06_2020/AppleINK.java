package OfficeHours.Practice_05_06_2020;

public class AppleINK {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Mehmet","Junior Tester",115000,1234);
        Tester tester2 = new Tester();
        tester2.setTesterInfo("Yusuf","Junior Tester",75000,12345);
        Tester tester3 = new Tester();
        tester3.setTesterInfo("Ahmet Satilmis","Senior Tester",125000,123456);

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.hireaTester(tester1);
        scrum1.hireaTester(tester3);
        scrum1.hireaTester(tester2);
     //  scrum1.testerTeam // returns the testers team from scrum1
     for(  Tester  each:scrum1.testerTeam ){
         System.out.println(each);
     }


    }
}
