
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindow {
	private JLabel jLabel1, jLabel2, jLabel3;
	private JButton jButton1;
	private JTextField jTextField1;
	private JPasswordField jPasswordField1;
	private JComboBox jComboBox1;
	jLabel1 = new JLabel();
	jComboBox1 = new JComboBox();
	jLabel2 = new JLabel();
	jLabel3 = new JLabel();
	 jTextField1 = new JTextField();
	jLabel1.setText("Username:");
	  jLabel2.setText("Password:");
	  jLabel3.setText("Domain:");
	  jTextField1.setName("username");
	  jPasswordField1.setName("password");
	  jComboBox1.setName("domain");
	  jButton1.setName("ok");
}
}