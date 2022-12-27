import org.junit.Test;
import static org.junit.Assert.*;

public class HelloJavaTest {

  @Test
  public void testSolution() {
    assertEquals("You should say hello to Java",
            "Hello, Java!", HelloJava.sayHello());
  }
}