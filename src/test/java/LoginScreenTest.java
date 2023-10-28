


import com.mycompany.loginscreen.LoginScreen;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class LoginScreenTest {
    
     @Test
        public void testSuccesfullLogin(){
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("renato", "password123"));
        }

        @Test
        public void testFailedLogin(){
        LoginScreen loginScreen = new LoginScreen();
        assertFalse(loginScreen.login("renato", "wrongpassword"));
        }

        @Test
        public void testAddLogin(){
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.addUser("testuser","testpassword");
        assertTrue(loginScreen.login("testuser", "testpassword"));
        }
}
