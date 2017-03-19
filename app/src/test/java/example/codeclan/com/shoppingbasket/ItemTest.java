package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static android.os.Build.VERSION_CODES.N;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/03/2017.
 */

public class ItemTest {

    Item item1;

    @Before
    public void before() {
        item1 = new Item("Pot Noodle",4520);
    }


    @Test
    public void testCanGetName() {
        assertEquals("Pot Noodle", item.getName());
    }
}
