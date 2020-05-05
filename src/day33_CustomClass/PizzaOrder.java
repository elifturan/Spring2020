package day33_CustomClass;

public class PizzaOrder {
    public static void main(String[] args) {
        Pizza order1 = new Pizza();
      order1.customizeOrder("Small",2,3);
       order1.calcCost();
        System.out.println(order1);

    }
}
