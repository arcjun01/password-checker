import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    void testDescribePasswordLengthTooLong() {
    // Arrange
    PasswordChecker checkLength = new PasswordChecker(6, 13);
    // Act
    String actualDescription = checkLength.describePasswordLength("hellooooooooo");
    // Assert
    assertEquals("long", actualDescription);
    }

    @Test
    void testDescribePasswordLengthTooShort() {
    // Arrange
    PasswordChecker checkLength = new PasswordChecker(3, 8);
    // Act
    String actualDescription = checkLength.describePasswordLength("hi");
    // Assert
    assertEquals("short", actualDescription);
    }

    @Test
    void testIsAlphanumeric() {
    // Arrange
    PasswordChecker alphanumeric = new PasswordChecker(5, 10);
    // Act
    boolean actualDescription = alphanumeric.isAlphanumeric("Heythere");
    // Assert
    assertEquals(true, actualDescription);
    }

    @Test
    void testIsBannedPassword() {

    }
}
