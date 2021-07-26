import java.lang.*; 
  
public class mainclass { 
  
    public static void main(String args[]) throws InterruptedException
    { 
    	Thread obj = Thread.currentThread();
		StringBuffer sbf = new StringBuffer("Abhijeet"); 
        sbf.reverse(); 

        int i = 0;
        while(i<10) {
        	System.out.print(sbf.reverse().toString() + "\t");	 
        	obj.sleep(50);
        	i++;
        }
        
    } 
} 