package core_basics;
import javax.swing.JOptionPane;

public class SimpleGui {

	public static void main(String[] args) {

	String name=JOptionPane.showInputDialog("enter your name");
	JOptionPane.showMessageDialog(null, "hello "+name);
	
	int age= Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
	
	JOptionPane.showMessageDialog(null, "you are "+age+" years old");
	}

}
