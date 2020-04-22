package day16_ForLoop;

public class Alphabets {
    public static void main(String[] args) {

        String upperCase = "";//A ~ Z
        String LowerCase = "";// a ~ z

       for (char ch = 'A'; ch<= 'Z'; ch++){
           upperCase +=ch;
           LowerCase +=ch;
           LowerCase = LowerCase.toLowerCase();
       }
        System.out.println(upperCase+" ");
        System.out.println(LowerCase+" ");

        //Aa Bb Cc Dd..
        String result = "";
        for(int i = 0 ; i <= upperCase.length()-1 ; i++){
            result += upperCase.charAt(i)+"" +LowerCase.charAt(i)+" ";
        }
        System.out.println(result);

        // second solution

        int a = 97;
        int A = 65;
String result2 = " ";
        for (int i = 0 ; i < 26 ; i++){
           char ch =(char) (A + i);//upper case character
            //             65 + 0
            char ch2 = (char)(a + i);
            //System.out.print(ch+" ");
            result2 += ch + ""+ch2+" ";
        }
        System.out.println(result2);





    }
}
