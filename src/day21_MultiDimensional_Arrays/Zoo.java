package day21_MultiDimensional_Arrays;

public class Zoo {
    public static void main(String[] args) {

        String[] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};
        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};
        // 0        1        2         3
        String[][] zoo = {wildAnimals, birds};

        String kfc = zoo[1][1]; //Chicken
        System.out.println(kfc);

        System.out.println("=================================");

        for (String eachbirds : zoo[1]) {
            if (eachbirds.equalsIgnoreCase("Chicken")){// except chicken
                continue;

        }
            System.out.println(eachbirds);
    }
for(String eachwild : zoo[0]){

   if(eachwild.equalsIgnoreCase("Turtle")){//except turtle
       continue;
   }
    System.out.println(eachwild);
}







    }
}
