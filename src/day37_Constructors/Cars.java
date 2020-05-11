package day37_Constructors;

public class Cars {

    String brand;
    String model;
    int year;
    double price;
    public Cars(String brand, String model,int year,double price){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    public String toString(){
        return year+ " "+brand+" "+model+" $"+price;
    }


}
