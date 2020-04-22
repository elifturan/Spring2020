package day23_Methods;

public class Methods_withParameters2_Reverse {
    public static void main(String[] args) {
// create function that can reverse any string
        // "Elif"-->filE
        String names ="Elif";
ReverseString(names);
        String name2="Orhan";
        ReverseString(name2);
    }

public static void ReverseString(String str){
    for(int i=str.length()-1;i>=0;i--){
        System.out.print(str.charAt(i));
    }
    System.out.println();
}

}
