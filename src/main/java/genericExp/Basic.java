package genericExp;

import java.util.Arrays;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        System.out.println("======== Generic 미사용 ========");
        List numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = 0;
        for (Object number : numbers1) {
            sum += (int) number;
        }
        System.out.println("sum = " + sum);

        System.out.println("========= Generic 사용 =========");

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        sum = 0;
        for (Integer number : numbers2) {
            sum += number;
        }
        System.out.println("sum = " + sum);
    }
}
