package code.GeeksForGeeks;

import java.util.HashMap;
import java.util.Map;

/**
 * Is it Fibonacci
 */
public class _1 {

    public static void main(String[] args) {
        int[] input = new int[]{0, 1, 1, 2, 3, 5, 8, 12};
        System.out.println(checkIfFibonachi(input));

    }

    private static boolean checkIfFibonachi(int[] input) {
        var check = false;
        Map<Integer,Integer> fibo = fib(input.length);
        for (int i = 0; i < input.length; i++) {
            if (fibo.get(i) != input[i]) {
                check = false;
                break;
            } else {
                check=true;
            }
        }
        return check;
    }

    public static Map<Integer, Integer> fib(int n) {
        Map<Integer, Integer> numbers = new HashMap<>(Map.of(0,0,1,1));
        for (int i = 0; i < n; i++) {
            if (!numbers.containsKey(n)) {
                numbers.put(i, calculate(i));
            }
        }
        return numbers;
    }
    private static Integer calculate(int n) {
        if (n < 2) {
            return n;
        }
        return calculate(n - 2) + calculate(n - 1);
    }

}
