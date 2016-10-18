import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class IfElseDemo {

	public static void main(String[] args) {
		
		String username = "William";
		String password = "Password";
		
		String login = JOptionPane.showInputDialog("Enter username: ");
		if(username.equalsIgnoreCase(login)) {
			String input = JOptionPane.showInputDialog("Enter Password: ");
			if(input.equals(password)) {
				System.out.println("Welcome " + username + "!");
				
			}else{
				System.out.println("Wrong password...");
				
			}
			
		}else{
			System.out.println("Wrong username...");
						
		}
		
		
	
		
		
	}

}
