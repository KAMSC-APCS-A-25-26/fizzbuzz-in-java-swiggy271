import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FizzBuzzTest {

    @Test
    public void testMainPrintsExpectedFizzBuzzValues() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        try {
            FizzBuzz.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }

        String[] lines = outputStream.toString().trim().split("\n");
        assertTrue(lines.length >= 100, "Should print at least 100 lines for 1..100");

        assertEquals("1", lines[0]);
        assertEquals("2", lines[1]);
        assertEquals("Fizz", lines[2]);
        assertEquals("4", lines[3]);
        assertEquals("Buzz", lines[4]);
        assertEquals("Fizz", lines[5]);
        assertEquals("FizzBuzz", lines[14]);
        assertEquals("16", lines[15]);
        assertEquals("17", lines[16]);
        assertEquals("Buzz", lines[19]);
    }
}
