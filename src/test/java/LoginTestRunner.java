import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginTestRunner extends Setup {
    @Test
    public void doUserLogin() throws InterruptedException, IOException, ParseException {
        driver.get("http://automationpractice.com");
        Login login = new Login(driver);
        //String username = login.doLogin("testuser9779@test.com", "2478547");
        Utils utils = new Utils(driver);
        utils.readJSONArray(0);
        String user = login.doLogin(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(user, "Test User");
    }
    @Test
    public void loginWithInvalidEmail() throws InterruptedException, IOException, ParseException {
        driver.get("http://automationpractice.com");
        Login login = new Login(driver);
        //String username = login.doLogin("testuser9779@test.com", "24785");
        Utils utils = new Utils(driver);
        utils.readJSONArray(1);
        String user = login.doLogin(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(user, "Test User");
    }
    @Test
    public void loginWithWrongPassword() throws InterruptedException, IOException, ParseException {
        driver.get("http://automationpractice.com");
        Login login = new Login(driver);
        //String username = login.doLogin("testuser9779@test.com", "24785");
        Utils utils = new Utils(driver);
        utils.readJSONArray(2);
        String user = login.doLogin(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(user, "Test User");
    }
}


