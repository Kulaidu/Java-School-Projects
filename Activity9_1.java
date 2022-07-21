import javax.swing.JOptionPane;
public class Activity9_1 {
    public static void main(String[] args) {
        
        String username, password;
        username = JOptionPane.showInputDialog("Username: ");
        password = JOptionPane.showInputDialog("Password: ");

        if(username.equals("cprog2")&&password.equals("bsit1a")){
            JOptionPane.showMessageDialog(null, "Thanks! You are Login");
        }
        else{
            JOptionPane.showMessageDialog(null,"Sorry.Username or Password is incorrect.");
        }
        System.exit(0);
    }
    
}
