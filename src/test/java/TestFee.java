import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestFee {
    Fee fee = new Fee();
    @Test
    void test1() {
        fee.setGender(true);
        fee.setAge(160);
        assertEquals("Không hợp lệ", fee.result());
    }
    @Test
    void test2() {
        fee.setAge(-1);
        assertEquals("Không hợp lệ", fee.result());
    }
    @Test
    void test3() {
        fee.setGender(true);
        fee.setAge(17);
        assertEquals("500$", fee.result());
    }
    @Test
    void test4() {
        fee.setAge(17);
        assertEquals("3000$", fee.result());
    }
    @Test
    void test5() {
        fee.setAge(30);
        assertEquals("1000$", fee.result());
    }
    @Test
    void test6() {
        fee.setGender(true);
        fee.setAge(65);
        assertEquals("1500$", fee.result());
    }
    @Test
    void test7() {
        fee.setAge(65);
        assertEquals("1500$", fee.result());
    }
}
