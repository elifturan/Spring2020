package day17_WhileLoops;

public class PalindromeTest {
    public static void main(String[] args) {

                      //Java
        String str = "Level";
        String reverseStr = ""; // store the reserved version of str

        int index = str.length()-1; // last index number

        while (index >= 0){
          reverseStr +=  str.charAt(index);
          index--;
        }
        boolean palindrome = reverseStr.equalsIgnoreCase(str);
        System.out.println(reverseStr);










    }









}
