package day32_Predicate;

import day34_CustomClass.Dog;

public class DogObjects2 {
    public static void main(String[] args) {
        String food = "Chicken";
        String food2 = "fish";
        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky", "small", 1, "yellow", "Bestie");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "Extra big", 5, "Brown", "Comar");

        dog1.eating(food);
        dog2.eating(food2);

        dog1.drink("Water");
        dog2.drink("Milk");

        dog1.playing("Ps4");
        dog2.playing("Ball");
        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"white","Sasha");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Kangal","Huge",5,"White","Comar");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
          Dog[] dogPark = {dog1,dog2,dog3,dog4};
        for (int i = 0; i < dogPark.length; i++) {
            dogPark[i].eating("Beef");
        }
for(Dog eachDog : dogPark){
eachDog.drink("Water");
}

        for (int i = 0; i <dogPark.length ; i++) {
            dogPark[i].playing("football");
        }
for(Dog eachone :dogPark){
    eachone.studying("Java");
}


    }
}
