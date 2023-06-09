package authentication.user.exceptions;

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(String id) {
        super("User " + id + " already exists in the system");
    }
}
