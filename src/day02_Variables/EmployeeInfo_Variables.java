package day02_Variables;

public class EmployeeInfo_Variables {
    public static void main(String[] args) {

        String companyName = " Erguclu Metal ";
        String employeeName = " Elif Turan ";
        int employeeId = 9;
        String jobTitle = "QA";
        double salary = 100000.5;
        long ssn = 123456789;

       /* System.out.println(" Employee Name: "+ employeeName);
        System.out.println("Company Name: "+companyName);
        System.out.println("Employee Id:"+ employeeId);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary:"+salary);
        System.out.println("Social Security number:" +ssn);
*/
        System.out.println(employeeName+ " works at "+ companyName + " as a " + jobTitle + "\n with this Emp ID: "+employeeId + " She earns "+ salary );


        System.out.println("=============================");

        String firstName= "Elif/Orhan";
        String lastName= "Turan";


        System.out.println("Full Name: "+firstName+" "+lastName);

    }



}
