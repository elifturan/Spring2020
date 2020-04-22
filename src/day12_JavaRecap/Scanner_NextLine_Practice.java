package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String fullAddress=" ";
        System.out.println("Bulding number: ");
        int Bnum = input.nextInt();


        input.nextLine();
        System.out.println("Street is: ");
        String street = input.nextLine();

        System.out.println("Apartment number: ");
        int Anum = input.nextInt();

        System.out.println("Enter the zipcode: ");
        int znum = input.nextInt();

        input.nextLine();
        System.out.println("Enter the city name and seperated by comma and space");
        String cityState = input.nextLine();

        fullAddress = Bnum+" "+street+ ", #"+Anum+ " \n"+cityState+ " "+znum;
        System.out.println(fullAddress);

       // input.close();






    }
}
