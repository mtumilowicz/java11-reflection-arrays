import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2019-02-10.
 */
public class CreatingArrayTest {
    
    @Test
    public void isArray() {
        int[] ints = {1, 2, 3};
        
        assertTrue(ints.getClass().isArray());
    }
}
