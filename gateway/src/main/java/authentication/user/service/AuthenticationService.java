package authentication.user.service;

import authentication.user.database.UserDatabase;
import authentication.user.domain.User;
import authentication.user.exceptions.UserAlreadyExistsException;

public class AuthenticationService {

    private UserDatabase userDatabase;

    public AuthenticationService(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public boolean authenticate(String username, String password) {
        try {
            User user = userDatabase.getUserByUsername(username);
            if (user.getPassword().equals(password)) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("User " + username + " was not found");
        }
        return false;
    }

    public void register(String username, String password) {
        for (User user : userDatabase.getAllUsers()) {
            if (user.getUsername().equals(username)) {
                throw new UserAlreadyExistsException("User already exists");
            }
        }
        userDatabase.addUser(new User(username, password));
    }
}
