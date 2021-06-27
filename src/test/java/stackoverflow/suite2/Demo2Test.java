package stackoverflow.suite2;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("Demo2Test")
public class Demo2Test {

    @Test
    void name2(TestInfo info) {
        System.out.println(info.getDisplayName());
    }
}
