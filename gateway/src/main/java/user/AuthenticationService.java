package user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class AuthenticationService {

	private UserDatabase userDatabase;

	public boolean authenticate(String username, String password) {
		for (User user : userDatabase.getAllUsers()) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public void register(String username, String password) throws Exception {
		for (User user : userDatabase.getAllUsers()) {
			if (user.getUsername().equals(username)) {
				throw new Exception("User already exists with this username");
			}
		}
		userDatabase.addUser(new User(username, password));

	}
}
