package wordsListInFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordsGenerator {

    public static List<String> generateWords(String fileName) throws IOException {
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

        }
        return words;
    }
}
