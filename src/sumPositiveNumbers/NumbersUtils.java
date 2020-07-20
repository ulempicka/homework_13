package sumPositiveNumbers;

import java.util.LinkedList;

public class NumbersUtils {

    public static void displayReverse(LinkedList<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }

    public static int sum(LinkedList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public static int minNumber(LinkedList<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public static int maxNumber(LinkedList<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        return max;
    }
}
