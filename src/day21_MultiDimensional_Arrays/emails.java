package day21_MultiDimensional_Arrays;

import com.sun.xml.internal.org.jvnet.fastinfoset.sax.EncodingAlgorithmContentHandler;

public class emails {
    public static void main(String[] args) {
 /*
 Task:
    given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
    prin all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
  */
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for(String eachEmails : emails) {//
            if (eachEmails.endsWith("@gmail.com")) {
                continue;
            }
            System.out.println(eachEmails);
        }

          /*  if (!eachEmails.endsWith("@gmail.com")){
                System.out.println(eachEmails);


            }
        }


           */













    }
}
