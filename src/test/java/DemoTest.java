/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
import java.beans.Transient;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import Demo.java;

public class DemoTest {
    
    @Test 
    public void test_is_triangle_1() {
        assertTrue(Demo.isTriangle(2, 4, 7));
    }

    @Test 
    public void test_is_triangle_2() {
        assertTrue(Demo.isTriangle(4, 2, 7));
    }

    @Test 
    public void test_is_triangle_3() {
        assertTrue(Demo.isTriangle(2, 7, 4));
    }

    @Test 
    public void test_is_triangle_4() {
        assertFalse(Demo.isTriangle(2, 7, -2));
    }

    @Test 
    public void test_is_triangle_5() {
        assertFalse(Demo.isTriangle(7, 4, 12));
    }
}
