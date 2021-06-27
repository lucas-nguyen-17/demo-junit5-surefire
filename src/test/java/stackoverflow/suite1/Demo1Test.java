package stackoverflow.suite1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("Demo1Test")
public class Demo1Test {

    @Test
    void name1(TestInfo info) {
        System.out.println(info.getDisplayName());
    }
}
