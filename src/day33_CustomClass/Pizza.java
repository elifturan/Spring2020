package day33_CustomClass;
/*
   1. create a custom class for pizza that should contain the following:
               instance variables:
                       size (either small, medium, large)
                       number of cheese topping
                       number of pepperoni toppings
               instance method:
                       customizeOrder(): allows user to set the size and toppisngs of the pizza
                       calcCost(): returns the total cost as double
                       toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
               Pizza cost is determined by:
                       Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
                       Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
                       Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping

    */
public class Pizza {

    String size;
   int cheesetopping;
   int pepperonitopping;
   double totalPrice;

    public void customizeOrder(String pSize, int cheese, int pepperoni) {
        size = pSize;
        cheesetopping= cheese;
        pepperonitopping=pepperoni;
    }

        public double calcCost(){
            double price=0;

            if(size.equals("Small")){
                price+=10+(pepperonitopping*1.5)+(cheesetopping*1);
            }else if(size.equals("Medium")){
                price+=12+(pepperonitopping*1.5)+(cheesetopping*1);
            }else if(size.equals("Large")){
                price+=14+(pepperonitopping*1.5)+(cheesetopping*1);
            }
            return price;
        }




    public String toString(){
        String result="Your order is: "+size+"  pizza "+" cheese topping: "+cheesetopping+", pepperoni topping: "+pepperonitopping+" Your total is: $" +calcCost();
        return result;

    }



}
