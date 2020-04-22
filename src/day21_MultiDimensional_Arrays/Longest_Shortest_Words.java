package day21_MultiDimensional_Arrays;

public class Longest_Shortest_Words {
    public static void main(String[] args) {
/*
2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
 */
String [] names = {"Elif","Burcak","Fatma","Ulviye","Ozlem","Guzin"};

int maxLengthString= names[0].length();//
int minLengthString= names[0].length();
String longestword =names[0];
String shortestword=names[0];
        for(int i=0; i<=names.length-1;i++){

            if(names[i].length()>maxLengthString){
                maxLengthString = names[i].length();
                longestword = names[i];

            }
            if (names[i].length()<minLengthString){
                minLengthString=names[i].length();
                shortestword=names[i];
            }

}

        System.out.println(longestword);
        System.out.println(shortestword);


        //System.out.println(shortestword);






    }
}
