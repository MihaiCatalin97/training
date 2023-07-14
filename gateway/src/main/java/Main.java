import authentication.user.database.UserDatabase;
import authentication.user.service.AuthenticationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("gateway-beans.xml");

        UserDatabase database = (UserDatabase) context.getBean("userDatabase");

        AuthenticationService authenticationService = (AuthenticationService) context.getBean("authenticationService");

        boolean result = authenticationService.authenticate("John", "123456");

        System.out.println(result);
    }
}
