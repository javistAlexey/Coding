package InterviewTasks.Ай_Теко;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * найти первый уникальный элемент в массиве
 */
public class _1 {
    public static void main(String[] args) {
        Integer [] arr = new Integer []{4,5,7,5,4,9,4};
        List<Integer> integerList = Arrays.asList(arr);
        int n = Arrays.stream(arr).filter(i -> Collections.frequency(integerList, i) <= 1)
                .findFirst()
                .orElse(-1);
        System.out.println(n);
    }
}
