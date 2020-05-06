package OfficeHours.Practice_05_06_2020;

public class Developer {



    String name;
    String jobTitle;
    double salary;
    long employeeId;

    public void setDevInfo(String name, String jobTitle, double salary,long employeeId){
     this.name= name;// user giving argument name is assigned to instance variable name
       this.jobTitle=jobTitle;
       this.salary=salary;
       this.employeeId=employeeId;

}

    public String toString(){
        return "Employee Name: "+name+" Job Title: "+jobTitle+" Salary: "+salary+" Employee ID: "+employeeId;

    }
    public void coding(){
        int name= 100;
        System.out.println(this.name+" is coding");

    }
    public void fixingBug(){
        System.out.println(this.name+" is crying");
    }
}
