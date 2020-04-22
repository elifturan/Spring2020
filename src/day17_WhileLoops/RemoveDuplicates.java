package day17_WhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "Cybertek School is great place";


        int i = 0; //2
        while (str.contains("e")){
           i++;
           str = str.replaceFirst("e","");// after counting first "Java" we need to remove it from console

        }
        System.out.println(i);







    }
}
