package day24_Methods;

public class String_Reverse {
    public static void main(String[] args) {
        //Reverse("Cybertek");
     String name =   Reverse2("Cybertek");
        System.out.println(name);
    }
    public static void Reverse(String str){
        String Reverse="";
        for(int i=str.length()-1;i>=0;i--){
           Reverse +=str.charAt(i);
        }
        System.out.println(Reverse);
    }
    public static String Reverse2(String str){
        String Reverse2="";
        for(int i= str.length()-1;i>=0;i--){
            Reverse2+=str.charAt(i);
        }
        return Reverse2;
    }

}
