import com.llevel1.Methods;
import org.junit.Test;

import static org.junit.Assert.*;

public class MethodsTests {
    @Test
    public void testIsSortedMethodPositive(){
        Methods methods = new Methods();
        int[] array = {1 , 2, 3, 4, 5};
        assertTrue(methods.isSorted(array));
    }
}
