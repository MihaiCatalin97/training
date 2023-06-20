package authentication.user.exceptions;

public class NotFoundException extends Exception {

    public NotFoundException(String entity, String id) {
        super("Entity " + entity + " with id: " + id + " was not found in the database");
    }

}
