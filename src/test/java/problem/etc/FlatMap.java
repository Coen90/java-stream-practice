package problem.etc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FlatMap {
    @Test
    void flatMapTest() {
        //given
        String[][] data = {
            {"a", "b"},
            {"c", "d"},
            {"e", "f"},
            {"g", "h"},
            {"i", "j"}
        };
        //when
        //then
        String[] array1 = (String[]) Arrays.stream(data)
                .map(Arrays::stream)
                .toArray();
        for (String s : array1) {
            System.out.println(s);
        }
        String[] array2 = (String[]) Arrays.stream(data)
                .flatMap(Arrays::stream)
                .toArray();
        for (String s : array2) {
            System.out.println(s);
        }
//        Assertions.assertArrayEquals(array1, array2);
    }
}
