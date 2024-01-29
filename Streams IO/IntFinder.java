import java.io.*;

public class IntFinder {
    public static void main(String[] args) {
        String fileName = "datafile";
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            try {
                int intData = findFirstInt(dataInputStream);
                System.out.println("The first int data is: " + intData);
            } catch (EOFException eofException) {
                System.err.println("No valid integer data found in the file.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
    }
    private static int findFirstInt(DataInputStream dataInputStream) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    return Integer.parseInt(line.trim());
                } catch (NumberFormatException ignored) {
                }
            }
            throw new EOFException();
        }
    }
}
