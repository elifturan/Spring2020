package day33_CustomClass;

public class Cat {
    String breed;
    String color;
    int age;
    String name;

 public void sleep(){

     System.out.println(name+" is sleeping");
 }
   public void eat(String catFood){
       System.out.println(name+" is eating "+catFood);
   }
    public void drink(String drinks){
        System.out.println(name+" is drinking "+drinks);
    }public void setCatInfo(String catBreed, String catColor, int catAge , String catName){
     breed = catBreed;
     color=catColor;
     age=catAge;
     name=catName;


    }public String toString(){
     String result =name+ ", breed is "+breed+", color is "+color+", " +age+" years old ";
     return result;
    }




}
