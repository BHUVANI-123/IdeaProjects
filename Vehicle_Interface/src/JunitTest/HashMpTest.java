package JunitTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static JunitTest.HashMp.add;
import static org.junit.Assert.assertEquals;

public class HashMpTest {
    @Test
    public void TestAdd()
    {
        Assertions.assertTrue(add(1, 2));
    }
}

