package Tasks;

public class Words {
    private String[] words;

    public Words(String[] words) {
        this.words = words;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public String findLongest() {
        String[] words = this.getWords();

        int maxlength = words[0].length();
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > maxlength) {
                maxlength = word.length();
                longestWord = word;
            }
        }

        return longestWord;
    }
}
