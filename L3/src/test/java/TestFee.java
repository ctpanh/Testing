import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestFee {
    Fee fee = new Fee();
    @Test
    void test1() {
        assertEquals("3000$", fee.result(22, false));
    }
    @Test
    void test2() {›
        assertEquals("Không hợp lệ", fee.result(-1, true));
    }
    @Test
    void test3() {
        assertEquals("3000$", fee.result(20, false));
    }
    @Test
    void test4() {
        assertEquals("1000$", fee.result(25, false));
    }
    @Test
    void test5() {
        assertEquals("3000$", fee.result(11, false));
    }
    @Test
    void test6() {
        assertEquals("500$", fee.result(45, true));
    }
    @Test
    void test7() {
        assertEquals("3000$", fee.result(13, false));
    }
}
