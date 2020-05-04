package day33_CustomClass;

import sun.management.VMOptionCompositeData;

public class Car_CustomClass {
    //instance variable: object variables
    // declared veribale: variables that are declared outside a block
    // local variable: variables that are declared within a block

    String Brand;
    String Model;
    int year ;
    String color;

    public void start(){
        System.out.println(Brand+ " is started");
    }
    public void drive(){
        System.out.println("Driving "+Brand+" "+Model);
    }
    public void getCarInfo(){
        System.out.println(year+" "+Brand+" "+Model+" "+color);

    } //public void


    public static void main(String[] args) {
        int a = 100 ; // local variable


    }
}
