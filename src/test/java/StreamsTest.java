import java.util.List;
import org.example.Streams;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Stanislav Zeman
 */
public class StreamsTest {
    @Test
    void sumN2test1() {
        var expected = 132;

        var actual = Streams.sumN2(12);

        assertEquals(expected, actual);
    }

    @Test
    void sumN2test2() {
        var expected = 3540;

        var actual = Streams.sumN2(60);

        assertEquals(expected, actual);
    }

    @Test
    void evenNumbers2test1() {
        var expected = "02468101214161820222426283032";

        var actual = Streams.evenNumbers(32);

        assertEquals(expected, actual);
    }

    @Test
    void getAverage() {
        List<Double> input = List.of(1.0, 0.0, 12.0, 32.6, 14.7, 61.2);

        var expected = 20.25;
        var actual = Streams.getAverage(input);

        assertEquals(expected, actual);
    }

    @Test
    void deepCopy() {
        int[][] input = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        var cloned = Streams.deepCopy(input);

        assertArrayEquals(input[0], cloned[0]);
        assertArrayEquals(input[1], cloned[1]);
        assertArrayEquals(input[2], cloned[2]);

        input[0][0] = 12;
        assertEquals(cloned[0][0], 1);
    }
}
