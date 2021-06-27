package stackoverflow.suite2;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("Demo4Test")
public class Demo4Test {

    @Test
    void name4(TestInfo info) {
        System.out.println(info.getDisplayName());
    }
}
