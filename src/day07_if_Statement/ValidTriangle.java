package day07_if_Statement;

public class ValidTriangle {
    public static void main(String[] args) {

        /*
1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not.
 */

        short angle1= 30;
        short angle2 = 50;
        short angle3 = 100;

        //int sumOfAngles = angle1 + angle2 + angle3;
       short sumOfAngles = (short)(angle1+angle2+angle3);
        //boolean validTriangle = sumOfAngles == 180;


        if (sumOfAngles == 180) {


            System.out.println("The shape is a triangle");}
        if (sumOfAngles != 180) {
            System.out.println("The shape is not valid triangle");
        }

















    }
}
