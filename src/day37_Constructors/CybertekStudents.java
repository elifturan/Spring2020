package day37_Constructors;

public class CybertekStudents {

    static String schoolName;
    String studentName; // we must need to know
    int groupNumber; // we must need to know
    String batch; // we must need to know

    public CybertekStudents(String studentName, int groupNumber, String batch) {
        schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString() {
        return "Student Name: " + studentName + " Batch: " + batch + " group number: " + groupNumber + " School Name: " + schoolName;
    }


}
class CObjects {
    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Elif",123,"18");
        System.out.println(student1);
        CybertekStudents student2 = new CybertekStudents("Orhan",1234,"18");
        System.out.println(student2);




    }
}