package pages;

import java.util.ResourceBundle;

public class App {

	public int uerLogin(String in_username, String in_password) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String username = rb.getString("username");
		String password = rb.getString("password");

		if (in_username.equals(username) && in_password.equals(password))
			return 1;
		else
			return 0;
	}

}
