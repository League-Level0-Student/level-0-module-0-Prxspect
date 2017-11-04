import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
String answer=JOptionPane.showInputDialog("What do you like?");
System.out.println(answer);
JOptionPane.showMessageDialog(null, answer+" is awesome");


}
}
