package day14_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {

        String str1 = "CYBERTEK";
        String str2 = "cybertek";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));//ignores case sensitiviy

String gmail = "cybertekschool@gmail.com";
String userinputGmail="CybertekSchool@gmail.com";
        boolean result = gmail.equalsIgnoreCase(userinputGmail) ;

        if (result){
            System.out.println("Logged in");
        }

String s1 ="Cybertek School";
        System.out.println(s1.contains("School"));
        System.out.println("=============================================");

        String Password = "mmasd12345";
        if(Password.contains(" ")){
            System.out.println("Password cannot have space in it");
        }else{
            System.out.println("valid password");
        }

        System.out.println("======================================");

       String s3 =  "United States";
        System.out.println(s3.startsWith("U"));//true]

        System.out.println("============================================");
/*
every website has htpp at the beginning of the web address
 */
String webAddress = "Www.amazon.com";
//webAddress= webAddress.toLowerCase();
       if(webAddress.startsWith("www.")){
           System.out.println("valid");
       }


String s4 ="Cybertek School";
        System.out.println(s4.endsWith("l"));
        System.out.println(s4.endsWith("School"));
        System.out.println(s4.endsWith("Cybertek"));

        String email = "CybertekSchool@Yahoo.com";
        if (email.endsWith("@gmail.com")){
            System.out.println("valid gmail");
        }else{
            System.out.println("invalid gmail");
        }














    }
}
