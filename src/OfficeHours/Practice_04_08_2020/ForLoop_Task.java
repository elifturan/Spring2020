package OfficeHours.Practice_04_08_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ForLoop_Task {
    public static void main(String[] args) {

        //print all the numbers between 0 ~ 100 that can be divisible 3 or 5

for(int i = 0; i<=100 ; i++){

    if(i%3==0 || i%5==0){
        System.out.print(i+" ");
    }
}
        System.out.println();
        System.out.println("===================================");

              String name = "Anna";
              String result = "";//filE
              int lastIndex= name.length()-1;

              for(int i = lastIndex; i>=0; i--){
                // result += name.charAt(i);
               result += name.substring(i,i+1);
                              //    3, 4 ==> a
                               //    2, 3 ==> n
                               //    1, 2 ==> n
                                //    0, 1 ==> A
              }
        System.out.println(result);

        if(name.equalsIgnoreCase(result)){
            System.out.println(name+" is palindrome name");// palindrome tersten de yazsan ayni sonucu veren level = level gibi elif != file
        }else{
            System.out.println(name+" is not palindrome name");
        }







    }
}
