package authentication.user.database;

import authentication.user.domain.User;
import authentication.user.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDatabase {

    private List<User> users = new ArrayList<>();

    public void initDatabase(){
        users = new ArrayList<>(Arrays.asList(
                new User("John", "123456"),
                new User("Jane", "parola123"),
                new User("Alice", "abcdef")
        ));
    }
    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserByUsername(String username) throws Exception {
        return users.stream()
                .filter( x -> x.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("user", username));
    }
}
