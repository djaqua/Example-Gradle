package jaqua.poc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FooTest {

    
    @Test
    public void testGetInteger10() {
        Assert.assertTrue( true );
    }

    
    @Test
    public void testGetInteger11() {
        Assert.fail("GetInteger11 - fail");
    }
}
