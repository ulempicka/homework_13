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

        for(int i = numbers.size()-1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        System.out.println("suma = " + sum);

        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) < min){
                min = numbers.get(i);
            }
        }
        System.out.println("min = " + min);

        int max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        System.out.println("max = " + max);
    }
}
