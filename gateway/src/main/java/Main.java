import authentication.user.database.UserDatabase;
import authentication.user.service.AuthenticationService;

public class Main {
    public static void main(String[] args) {
        UserDatabase database = new UserDatabase();

        AuthenticationService authenticationService = new AuthenticationService(database);

        boolean result = authenticationService.authenticate("Test", "123456");

        System.out.println(result);
    }
}
