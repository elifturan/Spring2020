package day22_Arrays_Loops;

public class NestedLoops {
    public static void main(String[] args) {
     char [][]arr2D = {  {'A','B'},{'C','D','E'} , {'F','G','H'}  };



     //arr2D[1] => {'C','D','E'}
     for(int i =0;i< arr2D[1].length; i++ ){
         System.out.println(arr2D[1][i]);
     }

// arr2D[2] ===> {'F','j','H','I'}
        for(int i = 0; i<arr2D[2].length;i++){
            System.out.println(arr2D[2][i]);
        }

        System.out.println("====================================");
for(int j = 0; j< arr2D.length; j++){

    //System.out.println(arr2D);
    for(int i = 0; i< arr2D[j].length;i++){
        System.out.println(arr2D[j][i]);
    }
}





    }
}
