package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsObject {
    public static void main(String[] args) {

        Student student1= new Student();
        student1.setStudentInfo("Elif","Turkish",26,3.99,'F',true);
       // System.out.println(student1);

         Student student2 = new Student();
student2.setStudentInfo("Anastasia","Russian",30,4.00,'F',false);

Student student3 = new Student();
student3.setStudentInfo("Roberliza","Dominican",27,2.55,'F',false);

Student student4 = new Student();
student4.setStudentInfo("Chiu Yuk","Hong Kong",42,3.99,'F',true);

Student[] students ={student1,student2,student3,student4};

        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));
        canGraduate.removeIf(p -> p.gpa <= 3.0);


        System.out.println(canGraduate.size());

        for (int i = 0; i <canGraduate.size() ; i++) {
          Student each =  canGraduate.get(i);
            System.out.println(each.name+" can graduate");
        }


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
ArrayList<Student>canNotGraduate = new ArrayList<>(Arrays.asList(students));
canNotGraduate.removeIf(p-> p.gpa>3.0);
        System.out.println(canNotGraduate.size());

        for(Student each1: canNotGraduate){
            System.out.println(each1.name+" cannot graduate");
        }


    }
}
