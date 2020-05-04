package day33_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
      Car_CustomClass car1=  new Car_CustomClass();
      car1.Brand="BMW";
      car1.Model="x5";
      car1.year=2020;
      car1.color="Blue";

        System.out.println( car1.Brand );// instance variable object variables, we can call them through object name
        System.out.println(car1.Model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        car1.start();
        car1.drive();
        car1.getCarInfo();
        System.out.println("==================================");

        Car_CustomClass car2 = new Car_CustomClass();
        car2.Brand="Toyota";
        car2.Model="Camry";
        car2.year=2020;
        car2.color="Gray";



        System.out.println(car2.Brand);
        System.out.println(car2.Model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        car2.start();
        car2.drive();
        car2.getCarInfo();

        System.out.println("============================");
 Car_CustomClass car3 = new Car_CustomClass();
        car3.Brand="Mercedes";
        car3.Model="C Class";
        car3.year=2020;
        car3.color="Red";

      //  car3.start();
     //   car3.drive();
        car3.getCarInfo();
        System.out.println("==================");
String str ="A";
String str2="B";
String[] arr ={str,str2};
Car_CustomClass[] cars ={car1,car2,car3};

cars[0].getCarInfo();
cars[1].getCarInfo();
cars[2].getCarInfo();




    }
}
