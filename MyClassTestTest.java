import static org.junit.Assert.*;

 

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

 

public class MyClassTestTest {
	static MyClassTest mc;

	 

    @BeforeClass
    public static void setup() {
        mc = new MyClassTest();
    }

 

    @AfterClass
    public static void teardown() {
        mc = null;

 

    }

 

    @Test
    public void testadd() {
       Assert.assertSame(5, mc.add(2, 3));
    }

 

    @Test
    public void testsubtract() {
    	Assert.assertSame(1, mc.subtract(4, 3));
    }
 

}
 
