
import org.fest.swing.*;

public class LoginWindowTest {

   private FrameFixture login;

  /* @BeforeMethod*/ public void setUp() {     login = new FrameFixture(new Login());
     login.show();
    }

    /*@Test */public void shouldShowErrorIfUsernameIsMissing() {
      login.textBox("username").deleteText();
      login.textBox("password").enterText("secret");
     login.comboBox("domain").selectItem("USERS");
     login.button("ok").click();
     login.optionPane().requireErrorMessage().requireMessage("Please enter your username");
   }

   /* @AfterMethod*/ public void tearDown() {
      login.cleanUp();
    }
}