// AppTest.java — generated 2026-04-06
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testArithmetic() {
        assertEquals(4, 2 + 2);
        assertEquals(5, 10 / 2);
        assertEquals(9, (int) Math.pow(3, 2));
    }

    @Test
    void testStringOperations() {
        String s = "hello world";
        assertTrue(s.contains("hello"));
        assertEquals("HELLO WORLD", s.toUpperCase());
        assertEquals(11, s.length());
        assertEquals("Hello World", capitalize(s));
    }

    @Test
    void testArrayOperations() {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int n : nums) sum += n;
        assertEquals(15, sum);
    }

    private String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0)));
            sb.append(w.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
