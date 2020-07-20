package wordsListInFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Words {
    public static void main(String[] args) {
        String fileName = "src\\wordsListInFile\\words.txt";
        List<String> words = new ArrayList<>();

        try {
            words = WordsGenerator.generateWords(fileName);
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
