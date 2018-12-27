import org.junit.Test;

import static org.junit.Assert.*;

public class Consecutive_NoTest {

    Consecutive_No obj;
    @org.junit.Before
    public void setUp() throws Exception {
        obj=new Consecutive_No();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        obj=null;
    }

    @org.junit.Test
    public void isConsecutive() {
        assertEquals("Error",true,obj.isConsecutive("1,2,3,4,5,6,7,8,9"));
        assertEquals("Error",true,obj.isConsecutive("1,2,3,4,5,6"));
        assertEquals("Error",true,obj.isConsecutive("5,6,7,8,9"));
        assertEquals("Error",false,obj.isConsecutive("10,20,20,120"));
        assertEquals("Error",true,obj.isConsecutive("0,1,2,3"));


    }
    @Test
    public void testGetFieldsFailure() {

        assertNotNull(
                "Error",obj.isConsecutive("1,2,3,4,5,6"));

    }

}