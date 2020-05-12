package day38_Consructors;

public class Item {
    /*
    create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
	create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
     */

    String name;
    double unitPrice;
    int quantity;
public  Item(String name, int quantity, double unitPrice){
    this.name=name;
    this.unitPrice=unitPrice;
    this.quantity=quantity;


}


    public double calcCost(){
return quantity*unitPrice;
    }
    public String toString(){
return "Item: "+name+" Unit price: $"+ unitPrice+" Quantity: "+quantity+"\nTotal Cost of Item: $"+calcCost();
    }










}
