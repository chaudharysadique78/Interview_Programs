package interviews;

public class HigestOccuranceCharacter {

    public static void main(String[] args) {
        String str = "AABBB";
        char mostOccurance = findMostOccurance(str);
        System.out.println("Hightest number of time cocurence character "+ mostOccurance);
    }

    public static char findMostOccurance(String str) {
        int[] charCount = new int[256];

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        char mostoccuranceChar = '\0';
        int maxcount = 0;

        for (char c = 0; c < 256; c++) {
            if (charCount[c] > maxcount) {
                maxcount = charCount[c];
                mostoccuranceChar = c;
            }

        }
        return mostoccuranceChar;
    }
}
