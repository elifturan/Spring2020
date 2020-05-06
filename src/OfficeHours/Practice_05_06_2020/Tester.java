package OfficeHours.Practice_05_06_2020;

public class Tester {

    String name;
    String jobTitle;
    double salary;
    long employeeId;

   public void setTesterInfo(String name, String jobTitle, double salary,long employeeId){
       this.name= name;// user giving argument name is assigned to instance variable name
       this.jobTitle=jobTitle;
       this.salary=salary;
       this.employeeId=employeeId;

   }

public String toString(){
       return "Employee Name: "+name+" Job Title: "+jobTitle+" Salary: "+salary+" Employee ID: "+employeeId;

}
public void smokeTesting(){
       int name= 100;
    System.out.println(this.name+" is doing SmokeTesting");

}
public void creatingTicket(){
    System.out.println(this.name+" is creating ticket on Jira");
}
}
