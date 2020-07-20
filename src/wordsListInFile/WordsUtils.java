package wordsListInFile;

import java.util.List;

public class WordsUtils {

    public static int charCount(String word) {
        char[] letters = word.toCharArray();
        return letters.length;
    }

    public static int minCharCount(List<String> words) {
        int minCount = charCount(words.get(0));
        for (String word : words) {
            if (charCount(word) < minCount) {
                minCount = charCount(word);
            }
        }
        return minCount;
    }

    public static String minWord(List<String> words){
        String minCharWord = words.get(0);
        int minCount = minCharCount(words);
        for (String word : words) {
            if (charCount(word) == minCount) {
                minCharWord = word;
            }
        }
        return minCharWord;
    }

    public static int maxCharCount(List<String> words) {
        int maxCount = charCount(words.get(0));
        for (String word : words) {
            if (charCount(word) > maxCount) {
                maxCount = charCount(word);
            }
        }
        return maxCount;
    }

    public static String maxWord(List<String> words){
        String maxCharWord = words.get(0);
        int maxCount = maxCharCount(words);
        for (String word : words) {
            if (charCount(word) == maxCount) {
                maxCharWord = word;
            }
        }
        return maxCharWord;
    }

    public static int sumCount(List<String> words) {
        int sum = 0;
        for (String word : words) {
            sum += charCount(word);
        }
        return sum;
    }
}
