package mobi.lab.j2objc;

import org.junit.Assert;
import org.junit.Test;

public class CoreLibTest {

    @Test
    public void testMessageOfTheDay() {
        Assert.assertEquals("MessageOfTheDay", CoreLib.getInstance().getMessageOfTheDay());
    }
}
