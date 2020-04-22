package day24_Methods;

public class palindrome {
    public static void main(String[] args) {
palindrome("level");
palindrome("Elif");
    }
    public static void palindrome(String str) {  // Anna ==>
        str = str.toLowerCase(); // anna
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(str.equals(reversed));

    }
    }
