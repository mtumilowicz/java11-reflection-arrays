import org.junit.Test;

import java.lang.reflect.Array;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by mtumilowicz on 2019-02-10.
 */
public class CreatingArrayTest {

    @Test
    public void isArray() {
        Object ints = new int[]{1, 2, 3};

        assertTrue(ints.getClass().isArray());
    }

    @Test
    public void create_oneDimension() {
        String[] array = (String[]) Array.newInstance(String.class, 1);

        assertThat(array.length, is(1));
    }

    @Test
    public void create_twoDimensions() {
        String[][] array = (String[][]) Array.newInstance(String.class, 1, 1);

        assertThat(array.length, is(1));
        assertThat(array[0].length, is(1));
    }

    @Test
    public void set() {
        Object array = new String[]{"a"};

        Array.set(array, 0, "b");

        assertThat(((String[]) array)[0], is("b"));
    }

    @Test
    public void get() {
        Object array = new String[]{"a"};

        assertThat(Array.get(array, 0), is("a"));
    }

    @Test
    public void getLength() {
        Object array = new String[]{"a"};

        assertThat(Array.getLength(array), is(1));
    }
}
