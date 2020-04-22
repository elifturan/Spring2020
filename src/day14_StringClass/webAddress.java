package day14_StringClass;

public class webAddress {
    public static void main(String[] args) {

        String mail = "Www.google.com";
        mail = mail.toLowerCase();
        if (mail.startsWith("www.")&& mail.endsWith(".com")|| mail.endsWith(".org")||mail.endsWith(".gov")){
            System.out.println("Valid page");
        }else{
            System.out.println("invalid page");
        }






    }
}
