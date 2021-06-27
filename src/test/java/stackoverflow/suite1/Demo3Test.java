package stackoverflow.suite1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("Demo3Test")
public class Demo3Test {

    @Test
    void name3(TestInfo info) {
        System.out.println(info.getDisplayName());
    }
}
