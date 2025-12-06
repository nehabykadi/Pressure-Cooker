package cooker;

import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //Looked online for java specifications of user input and output
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testMainRunsAndExits() {
        String simulatedInput = "hello\nn\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[]{}));

        String output = outContent.toString();
        System.out.println(output);

        assertTrue(output.contains("| (_| (_) | (_) |"), "Game should show welcome screen");
        assertTrue(output.contains("Another order?"), "Game should ask to continue");
        assertTrue(output.contains("Goodbye!"), "Game should end");
    }
}
