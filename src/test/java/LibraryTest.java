
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
	
    @Test 
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        Assertions.assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
}
