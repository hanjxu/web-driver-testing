package support;

public class Challenges {
    public static void main(String[] args) {
        System.out.println(">>>capitalize the sentence: the quick brown fox jumps over the lazy dog");
        String sentence = "the, quick, brown, fox, jumps, over, the, lazy, dog";
        System.out.println(capitalizeWords(sentence));
    }
    static String capitalizeWords(String sentence) {
        String[] words = sentence.split(", ");
        String temp = "";
        for (int i = 0; i < words.length; i ++) {
            if (i == words.length - 1) {
                temp += (Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1));
            } else {
                temp += (Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1) + ", ");
            }
        }
        return temp;
    }
}
