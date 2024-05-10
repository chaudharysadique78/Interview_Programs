package programs;

//Read file and find out the particular word


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWordFinder {

    public static void main(String[] args) {

        String filePath = "C:/Users/2193984/IdeaProjects/demo/test.txt";
        String filep="C:\\Users\\2193984\\IdeaProjects\\demo\\test.txt";

        String wordFind = "OOPS";

        try {
            File file = new File(filep);
            Scanner sc = new Scanner(file);

            int occurance = 0;

            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                String[] words = line.split("\\s");

                for (String word : words) {
                    if (word.equalsIgnoreCase(wordFind)) {
                        occurance++;
                    }
                }

            }

            sc.close();
            System.out.println(wordFind + " occurs " + occurance + " Times");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found " + e.getMessage());
        }

    }

}
