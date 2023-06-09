package user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDatabase {

    private List<User> users = new ArrayList<>(Arrays.asList(
            new User("John", "123456"),
            new User("Jane", "parola123"),
            new User("Alice", "abcdefg")
    ));

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserByUsername(final String username) throws Exception {
        return users
                .stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new Exception("User not found"));
    }
}
