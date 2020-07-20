package sumPositiveNumbers;

import java.util.LinkedList;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        int number = 0;

        while (number >= 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            number = scanner.nextInt();
            scanner.nextLine();
            numbers.add(number);
        }
        numbers.removeLast();
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
