import java.util.*; 
import java.util.concurrent.LinkedBlockingQueue; 
  
public class mainclass { 
    public static void main(String[] argv) 
        throws Exception 
    { 
        StringBuilder str1 = new StringBuilder("Abhi"); 

        StringBuilder str2 = new StringBuilder(str1); 
        System.out.println("String2 = " + str2.toString()); 

        String s = "Abhijeet";
        StringBuilder str3 = new StringBuilder(s); 
        System.out.println("String3 = " + str3.toString());         

        str3.setCharAt(7, '!'); // can not increase string capacity
        System.out.println("String3 = " + str3.toString());

        str3.append(" Shahakar");
        System.out.println("String3 = " + str3.toString()); 

        // str3.capacity(5); // error   

        s = str3.toString();
        System.out.println(s); 

    } 
} 