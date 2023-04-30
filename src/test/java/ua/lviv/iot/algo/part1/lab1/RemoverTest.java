package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RemoverTest {
    @Test
    void testRemoveWordsWithLengthFiveWhichStartWithСonsonantLetter() {
        Remover remover = new Remover();
        String text = "I'm listening to a great song." + "\n" +
                "We enjoy warm sunsets on the beach." + "\n" +
                "He drives fast cars and loves speed." + "\n" +
                "He reads books for hours on end.";
        String str1 = text;
        String str2 = remover.removeWordsWithLengthFiveWhichStartWithСonsonantLetter();
        assertNotEquals(str1, str2, "Test is not passed successfully");
    }
}