import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestFee {
    Fee fee = new Fee();
    @Test
    void test1() {
        fee.setGender(true);
        fee.setAge(-1);
        assertEquals("Không hợp lệ", fee.result());
    }
    @Test
    void test2() {
        fee.setGender(true);
        fee.setAge(66);
        assertEquals("1500$", fee.result());
    }
    @Test
    void test3() {
        fee.setGender(true);
        fee.setAge(30);
        assertEquals("500$", fee.result());
    }
    @Test
    void test4() {
        fee.setAge(35);
        assertEquals("1000$", fee.result());
    }
    @Test
    void test5() {
        fee.setAge(20);
        assertEquals("3000$", fee.result());
    }
}