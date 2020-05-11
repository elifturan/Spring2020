package day37_Constructors;

public class HumanResources {
    /*
    Task01:

	2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
     */
    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();

  /*  public static void main(String[] args) {
        employee1.setInfo("Zuleyha",123,45874641,"QA",110000,'F');
        System.out.println(employee1);
        employee2.setInfo("Nedime",1234,67874641,"QA",120000,'F');
        employee3.setInfo("Zeynep",12345,5874641,"QA",1250000,'F');
        employee4.setInfo("Oznur",123456,874641,"QA",150000,'F');
        employee5.setInfo("Elif",1234567,74641,"QA",130000,'F');
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);

    }

   */
    static{
       employee1.setInfo("Zuleyha",123,45874641,"QA",110000,'F');
//employee1.setInfo("Zuleyha",);
        employee2.setInfo("Nedime",1234,67874641,"SDET",120000,'F');
        employee3.setInfo("Zeynep",12345,5874641,"QA",1250000,'F');
        employee4.setInfo("Oznur",123456,874641,"Scrum Master",150000,'F');
        employee5.setInfo("Elif",1234567,74641,"SDET",130000,'F');


    }
}
