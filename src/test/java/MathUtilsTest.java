import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MathUtilsTest {

    @Test
    void t() {
        assertEquals(5, MathUtils.max(5, 3));
    }

    @Test
    void testMax_aEqualsB() {
        assertEquals(4, MathUtils.max(4, 4));
    }

    @Test
    void testMax_aLessThanB() {assertEquals(6, MathUtils.max(2, 6)); }

    // BVA
    @Test
    void testMax_withMinValue() {
        assertEquals(0, MathUtils.max(Integer.MIN_VALUE, 0));
    }

    @Test
    void testMax_withMaxValue() {
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, 0));
    }

    @Test
    void testMax_minVsMax() {
        assertEquals(Integer.MAX_VALUE,
                MathUtils.max(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
    @Test
    void testMax_maxVsMin() {
        assertEquals(Integer.MAX_VALUE,
                MathUtils.max(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
    @Test
    void testDivide_positive() {
        assertEquals(5, MathUtils.divide(10, 2));
    }
    @Test
    void testDivide_negative() {
        assertEquals(-5, MathUtils.divide(10, -2));
    }
    @Test
    void testDivide_byZero() {
        MathUtils.divide(10, 1);
    }
}


