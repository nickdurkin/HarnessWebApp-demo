package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

  private Greeter greeter = new Greeter();

  @Test
  public void Menu() {
    assertThat(greeter.sayHello(), containsString("Harness"));
  }
@Test
  public void iPhoneSpecialFeatures() {
    assertThat(greeter.sayHello(), containsString("demos"));
  }
@Test
  public void LandingPageImage() {
    assertThat(greeter.sayHello(), containsString("demos"));
  }
@Test
  public void AuthentificationModule() {
    assertThat(greeter.sayHello(), containsString("demos"));
  }
@Test
  public void BackgroundWithAutoSize() {
    assertThat(greeter.sayHello(), containsString("demos"));
  }
}
