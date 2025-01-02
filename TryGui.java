import javax.swing.JOptionPane;

public class TryGui {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, "hello "  + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "you are "  + age + " years old");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null, "you are "  + height + " cm tall");

    }
}
