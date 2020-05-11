package day37_Constructors;

public class StudentsObject {

    public static void main(String[] args) {
        Students student1= new Students("Orhan",30,'M',"Cybertek ");
     // student1.setInfo("Elif",26,'F',"Cybertek ");
      System.out.println(student1);

      Students student2 = new Students("Elif",26,'F',"Cybertek ");
        System.out.println(student2);//constructor makes it easier. We do not need "setInfo" method.



    }


}
