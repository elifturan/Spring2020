package day34_CustomClass;

import javax.smartcardio.CardPermission;

public class Carpet {
    /*
    2. create a custom class for the carpet class that should contain the following:
				instance variables:
						width, length, unitPrice, isPersian (boolean)
				instance methods:
						customOrder(): sets the carpet' width, length, unitprice, & isParsian
						calcCost(): should be able to caculate the total cost of the carpet and return it as double
						toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
			total price of carpet= (width+length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
     */

double width;
double length;
double unitPrice;
boolean isPersian;
//(w+l)*unitPrice

    public double calcCost(){
        double total=(width+length)*unitPrice;
        return (isPersian)? total+200 : total;

    }
    public void customOrder(double CarpetWidth,double CarpetLength, double CarpetPrice,boolean Parsian){
width= CarpetWidth;
length= CarpetLength;
unitPrice=CarpetPrice;
isPersian=Parsian;
    }

public String toString(){

    return "width: "+width+
            "\nlength: "+length+
            "\nunit price: $"+unitPrice+
            "\nTotal costs: $"+calcCost();
}














}
