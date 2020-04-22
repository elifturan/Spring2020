package day21_MultiDimensional_Arrays;

import java.util.Arrays;

public class ScrumTeam {
    public static void main(String[] args) {
String [] DevTeam ={"Fate","Burcak","Elif"};
String [] Testers ={"Elif","Orhan","Hamdis","Yusuf","Mehmet"};
String [] PO={"Hatice ","Sefer "};
String [] TerstersTeam2={"Ersin","Filiz","Meryem","Dursun"};

      String [] []   ScrumTeam ={DevTeam,Testers,PO,TerstersTeam2};
        ScrumTeam [0][2]= "Elifoo";
        System.out.println( ScrumTeam [0][2]);
String info =ScrumTeam [1][2];
        System.out.println(info);
        System.out.println("==============================================");

        for (String eachEmployee :ScrumTeam[2]){
            System.out.println(eachEmployee);
        }


        System.out.println("==============================");

        System.out.println(ScrumTeam[2][1]);




    }
}
