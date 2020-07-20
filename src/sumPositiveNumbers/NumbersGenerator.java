package sumPositiveNumbers;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NumbersGenerator {

    public static List<Integer> generateNum(){
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
        return numbers;
    }
}
