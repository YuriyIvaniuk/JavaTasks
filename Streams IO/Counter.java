import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counter {
    public static void main(String[] args) {
        String filename = "xanadu.txt";
        char targetCharacter = 'e';
        int count = countCharacter(filename, targetCharacter);
        System.out.println("The character '" + targetCharacter + "' appears " + count + " times in the file.");
    }
    private static int countCharacter(String filename, char targetCharacter) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int currentChar;
            while ((currentChar = reader.read()) != -1) {
                if ((char) currentChar == targetCharacter) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
