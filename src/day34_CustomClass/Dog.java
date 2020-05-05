package day34_CustomClass;

public class Dog {
    String breed;
    String size;
    int age ;
    String color;
String name;
public void setDogInfo(String breed,String size, int age, String color,String name){
    this.breed = breed;
    this.size=size;
    this.age=age;
    this.color=color;
    this.name = name;
    //this keyword is used for calling object instance variable
}
public void eat(String dogFood){

}
public void sleep(){
    System.out.println(name+" is sleeping");
}public void drink(){
        System.out.println(name+ " is drinking");
    }
public String toString(){
    return "Breed is: "+breed+
    "\nName is: "+name+"\nSize is: "+size+"\nAge is: "+age+"\nColor is: "+color;
}
}
