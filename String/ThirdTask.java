import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        String firstString = "Software";
        String secondString = "Swear Oft";
        char[] charArray1 = (firstString.toLowerCase()).toCharArray();
        char[] charArray2 = (secondString.toLowerCase()).toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        String sortedString1 = new String(charArray1).trim();
        String sortedString2 = new String(charArray2).trim();

        if (sortedString1.equals(sortedString2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
