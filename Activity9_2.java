import javax.swing.JOptionPane;
public class Activity9_2 {
    public static void main(String[] args) {
        
        String iq = JOptionPane.showInputDialog("Enter your IQ Score:");
        double iqScore = Double.parseDouble(iq);

        if (iqScore>=130){
            JOptionPane.showMessageDialog(null, iqScore + " IQ is Intellegent.");
        }
        else if (iqScore<=129 && iqScore>=120){
            JOptionPane.showMessageDialog(null, iqScore + " IQ is Superior.");
        }
        else if (iqScore<=119 && iqScore>=110){
            JOptionPane.showMessageDialog(null, iqScore + " IQ is Above Average.");
        }
        else if (iqScore<=109 && iqScore>=90){
            JOptionPane.showMessageDialog(null, iqScore + " IQ is Average.");
        }
        else if (iqScore<=89 && iqScore>=80){
            JOptionPane.showMessageDialog(null, iqScore + " IQ is Below Average.");
        }
        else{
            JOptionPane.showMessageDialog(null, iqScore + " IQ is Poor.");
        }
    }
}