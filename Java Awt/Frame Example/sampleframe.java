import java.awt.Frame;

class sampleframe extends Frame
{
    sampleframe()
    {
        setSize(500,300);
        setVisible(true);
    }

    public static void main(final String[] args) {
        Frame obj = new Frame(); // Window 1 by Frame obj
        obj.setSize(300,500);
        obj.setVisible(true);
        
        sampleframe obj2 = new sampleframe(); // Window 2 by sampleFrame obj
    }
}