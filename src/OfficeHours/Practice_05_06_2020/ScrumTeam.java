package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testerTeam = new ArrayList<>();

    ArrayList<Developer>developerTeam= new ArrayList<>();

    public void hireaTester (Tester tester){
        testerTeam.add(tester);
    }
    public void fireTester(long id){
        testerTeam.removeIf(p->p.employeeId == id);

    }



}
