package day09_Nested_if_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        int number = 100 ;
        char ch1 = ' ';
        if (number > 0){
            ch1='+';
        }else if(number < 0 ){
            ch1= '-';
        }else {
            ch1 = '0';
        } System.out.println(ch1);

        char ch2 = (number> 0) ? '+' : (number <0) ? '-' : '0';
        System.out.println(ch2);
        System.out.println(ch1+ch2);
        System.out.println("================================================");

        byte score = 90;
        String grade = (score >=90 && score <=100)? "Excellent" : (score>=80 && score <=90)? "Great" :
                (score>=70 && score<=80)?  "Good" : (score>=60 && score <=70 )? "Pass" : (score< 60 && score >0)? "Failed " : "Invalid";
        System.out.println(grade);
        System.out.println("================================================");

        int num =1000;

        if(num %2 ==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

        //   (num %2 ==0) ? System.out.println("Even number") : System.out.println("Odd number");

        // we can only apply ternary: if the if statement' body is only returning value and assigning it to variable then we can apply ternary









    }
}
