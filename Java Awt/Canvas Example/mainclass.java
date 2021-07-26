import java.awt.*;  
public class mainclass  
{   
    public static void main(String args[])  
    {  
        Frame f = new Frame();  

        Canvas obj = new Canvas();
        obj.setBackground(Color.RED);
        obj.setSize(400, 400);

        f.add(obj);  
        f.setLayout(null);  
        f.setSize(400, 400);  
        f.setVisible(true);   
    }   
}  

 