package OfficeHours.Practice_04_15_2020;

public class NestedLoop {
    public static void main(String[] args) {
     char [][] arr2D={  { 'A','B'}, {'C','D','E'}, { 'F','G', 'H'}  } ;


     for (int j =0; j< arr2D.length;j++) {
         for (int i = 0; i < arr2D[0].length; i++) {
             System.out.println(arr2D[j][i]);
         }

     }

        System.out.println("=======================================");
for( char[] eachelement:arr2D ){
for(char eachone:eachelement){
    System.out.println(eachone);
}
}





    }
}
