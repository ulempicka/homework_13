package sumPositiveNumbers;

import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = NumbersGenerator.generateNum();
        System.out.println(numbers);

        NumbersUtils.displayReverse(numbers);
        int sum = NumbersUtils.sum(numbers);
        System.out.println("suma = " + sum);

        int min = NumbersUtils.minNumber(numbers);
        System.out.println("min = " + min);

        int max = NumbersUtils.maxNumber(numbers);
        System.out.println("max = " + max);
    }
}
