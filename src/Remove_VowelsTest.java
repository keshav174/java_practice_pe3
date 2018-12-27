import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Remove_VowelsTest {
    Remove_Vowels obj;

    @Before
    public void setUp() throws Exception {
        obj=new Remove_Vowels();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void remove_vowels() {
        String arr[]={"Keshav","Kumar","India"};
        String Res[]={"Kshv","Kmr","Ind"};

        assertEquals("error",Res,obj.remove_vowels(arr));


    }
    @Test
    public void remove_vowels1() {

        String arr[]={"Keshav","Kumar","India","Apple"};
        String Res[]={"Kshv","Kmr","Ind","Appl"};

        assertEquals("error",Res,obj.remove_vowels(arr));
    }
    @Test
    public void remove_vowels2() {

        String arr[]={"Kumar","India","Apple","Maple"};
        String Res[]={"Kmr","Ind","Appl","Mpl"};

        assertEquals("error",Res,obj.remove_vowels(arr));
    }
}