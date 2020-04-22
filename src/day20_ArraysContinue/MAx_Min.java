package day20_ArraysContinue;

public class MAx_Min {
    public static void main(String[] args) {

        int [] arr ={2, 3, 4, 5, 6, 7, 8, 9};

        int lastIndex = arr.length - 1;
       // System.out.println(lastIndex);
      int max = arr[0];
      int min = arr[0];

        for(int i = 0 ; i<=lastIndex;i++){
            if(arr[i]>max){// arrays index are compared with each other , and which ever is greater will be assigned to the console
                max = arr[i];

            } if ( arr[i]<min){//arrays index are compared with each other , and which ever is smaller will be assigned to the console
                min=arr[i];
            }

        }

        System.out.println(max);
        System.out.println(min);










    }
}
