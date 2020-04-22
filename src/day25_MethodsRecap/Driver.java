package day25_MethodsRecap;

public class Driver {
    public static void main(String[] args) {
//getDriver1()// argument is mandotry
     String str =   getDriver1("id");
       // System.out.println(str);
        String str2 = getDriver2("safari");
       System.out.println(str2);
       String str3 = getDriver3("opera");
        System.out.println(str3);
    }
    public static String getDriver1(String browserName){
        String result = "";

        switch (browserName.toLowerCase()){//ChromE.toLowerCase()==> chrome
            case "chrome":
                return"Chrome Driver";

            case "firefox":
                return"Firefox Driver";

            case "id":
                return "Id Driver";

            case "safari":
                return "Safari Driver";

            case "edge":
                return "Edge Driver";

            case "opera":
                return"Opera Driver";

            default:
                return "Invalid";
        }


    }
public static String getDriver2(String browserName){
        browserName = browserName.toLowerCase();
        //String result ="";
       if(browserName.equals("Chrome")){
           return "Chrome Driver";
       }else if(browserName.equals("firefox")){
           return "Firefox Driver";
       }else if(browserName.equals("id")){
           return "Id Driver";
       }else if(browserName.equals("safari")){
           return "Safari Driver";
       }else if(browserName.equals("edge")){
           return "Edge Driver";
       }else if(browserName.equals("opera")){
           return"Opera Driver";
       }else{
           return "Invalid";
       }


}
public static String getDriver3(String browsername){

        browsername=browsername.toLowerCase();
    return (browsername.equals("chrome"))? "Chrome Driver":(browsername.equals("firefox"))? "Firefox Driver":(browsername.equals("safari"))?
                "Safari Driver":(browsername.equals("edge"))? "Edge Driver":(browsername.equals("opera"))? "Opera Driver":"Invalid";


}
}
