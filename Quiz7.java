import javax.swing.JOptionPane;
public class Quiz7 {
    public static void main(String[] args) { 
        
        String r = JOptionPane.showInputDialog("What is the radius of the circle");
        
        final double PI = 3.1416;
        double radius = Double.parseDouble(r);
        
        double Circumference = 2*PI*radius;
        JOptionPane.showMessageDialog(null, "The circumference of a circle is " + Circumference);
        System.exit(0);
    }
}
