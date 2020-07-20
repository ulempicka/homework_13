package wordsListInFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Words {
    public static void main(String[] args) {
        String fileName = "src\\wordsListInFile\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader)
        ) {
            int i = 0;
            String nextLine = "";
            while ((nextLine = reader.readLine()) != null) {
                words.add(nextLine);
                i++;
            }
            System.out.println(words);
        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }

        System.out.println("Liczba znakow: " + WordsUtils.sumCount(words));

        System.out.println("Najkrotszy wyraz ma: " + WordsUtils.minCharCount(words) + " znakow");
        System.out.println("Najkrotszy wyraz to: " + WordsUtils.minWord(words));

        System.out.println("Najdluzszy wyraz ma: " + WordsUtils.maxCharCount(words) + " znakow");
        System.out.println("Najkrotszy wyraz to: " + WordsUtils.maxWord(words));

    }

}
