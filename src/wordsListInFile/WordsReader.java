package wordsListInFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordsReader {
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

        int i1 = WordsUtils.charCount(words.get(0));
        int i2 = WordsUtils.charCount(words.get(1));
        int i3 = WordsUtils.charCount(words.get(2));
        int i4 = WordsUtils.charCount(words.get(3));
        int i5 = WordsUtils.charCount(words.get(4));
        int i6 = WordsUtils.charCount(words.get(5));
        int i7 = WordsUtils.charCount(words.get(6));
        System.out.println("Liczba znakow: " + WordsUtils.sumCount(words));
        System.out.println("Liczba znakow: " + (i1 + i2 + i3 + i4 + i5 + i6 +i7));

        System.out.println("Najkrotszy wyraz ma: " + WordsUtils.minCharCount(words) + " znakow");
        System.out.println("Najkrotszy wyraz to: " + WordsUtils.minWord(words));

        System.out.println("Najdluzszy wyraz ma: " + WordsUtils.maxCharCount(words) + " znakow");
        System.out.println("Najkrotszy wyraz to: " + WordsUtils.maxWord(words));

    }

}
