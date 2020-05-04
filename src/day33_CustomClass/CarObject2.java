package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject2 {
    public static void main(String[] args) {

        Car_CustomClass car = new Car_CustomClass();
        car.setCarInfo("BMW","x7",2020,"Pearl White");
       car.getCarInfo();

       Car_CustomClass car2 = new Car_CustomClass();
       car2.setCarInfo("Toyota","Rav4",2020,"Metalic Blue");
       car2.getCarInfo();

Car_CustomClass car3 = new Car_CustomClass();
car3.setCarInfo("Audi","Q7",2020,"Gray");
car3.getCarInfo();

        System.out.println("====================================================");
Car_CustomClass [] cars ={car,car2,car3};
        for (int i = 0; i <cars.length ; i++) {
            cars [i].getCarInfo();
        }
        System.out.println("=========================================");
for( Car_CustomClass eachcar:cars){
    eachcar.getClass();
}
        System.out.println(car);
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);











    }





}
