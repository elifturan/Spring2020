package day35_Static;

public class StudentObject {


    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Elif",34,3.7);

        System.out.println(student1);
        Student student2 = new Student();
        student2.name="Orhan";

        Student.printSchoolName();

    }


}
