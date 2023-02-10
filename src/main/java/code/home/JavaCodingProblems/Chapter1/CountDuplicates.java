package code.home.JavaCodingProblems.Chapter1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    public static void main(String[] args) {
        String string = "Подсчет повторяющися символов в этой строке";

        System.out.println(countDuplicatesV1(string));
    }

    private static Map<Character, Long> countDuplicatesV1(String string) {

        if (string == null || string.isEmpty()) {
            return Collections.emptyMap();
        }
        Map<Character, Long> result = new HashMap<>();


        return result;
    }


}
